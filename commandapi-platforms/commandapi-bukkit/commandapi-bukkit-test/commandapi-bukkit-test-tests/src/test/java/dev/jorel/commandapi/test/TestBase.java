package dev.jorel.commandapi.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import dev.jorel.commandapi.CommandAPIVersionHandler;
import dev.jorel.commandapi.MCVersion;
import dev.jorel.commandapi.executors.PlayerCommandExecutor;

public abstract class TestBase {

	public CommandAPIServerMock server;
	public Main plugin;
	public MCVersion version;
	
	public TestBase() {
		this.version = CommandAPIVersionHandler.getVersion();
	}
	
	private static <T extends ServerMock> T mock1_13(T serverMockImplementation) {
		if (MockPlatform.getFieldAs(MockBukkit.class, "mock", null, ServerMock.class) != null)
		{
			throw new IllegalStateException("Already mocking");
		}
		
		MockPlatform.setField(MockBukkit.class, "mock", null, serverMockImplementation);
//		mock = new ServerMock();
		
		Level defaultLevel = serverMockImplementation.getLogger().getLevel();
		serverMockImplementation.getLogger().setLevel(Level.WARNING);
		Bukkit.setServer(serverMockImplementation);
		serverMockImplementation.getLogger().setLevel(defaultLevel);
		
		return serverMockImplementation;
	}

	public void setUp() {
		resetAllPotions();
		server = mock1_13(new CommandAPIServerMock());
		plugin = MockBukkit.load(Main.class);
	}

	public void tearDown() {
		Bukkit.getScheduler().cancelTasks(plugin);
		if (plugin != null) {
			plugin.onDisable();
		}
//		MockBukkit.unmock();
		MockBukkit.unload();
	}

	public static final PlayerCommandExecutor P_EXEC = (player, args) -> {};
	
	private void resetAllPotions() {
		PotionEffectType[] arr = (PotionEffectType[]) MockNMS.getField(PotionEffectType.class, "byId", null);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = null;
		}
		@SuppressWarnings("unchecked")
		Map<String, PotionEffectType> byName = (Map<String, PotionEffectType>) MockNMS.getField(PotionEffectType.class, "byName", null);
		byName.clear();
		
		@SuppressWarnings("unchecked")
		Map<String, PotionEffectType> byKey = (Map<String, PotionEffectType>) MockNMS.getField(PotionEffectType.class, "byKey", null);
		if(byKey != null) {
			byKey.clear();
		}
		
		MockNMS.setField(PotionEffectType.class, "acceptingNew", null, true);
	}

	public <T> void assertStoresResult(CommandSender sender, String command, Mut<T> queue, T expected) {
		assertDoesNotThrow(() -> assertTrue(
			server.dispatchThrowableCommand(sender, command),
			"Expected command dispatch to return true, but it gave false"));
		assertEquals(expected, queue.get());
	}

	@Deprecated
	public void assertInvalidSyntax(CommandSender sender, String command) {
		// XXX: Bogus code, do not use. Use assertCommandFailsWith instead.
		assertThrows(CommandSyntaxException.class, () -> assertTrue(server.dispatchThrowableCommand(sender, command)));
	}
	
	public void assertCommandFailsWith(CommandSender sender, String command, String message) {
		CommandSyntaxException exception = assertThrows(CommandSyntaxException.class, () -> server.dispatchThrowableCommand(sender, command));
		assertEquals(message, exception.getMessage());
	}
	
	public void assertNotCommandFailsWith(CommandSender sender, String command, String message) {
		CommandSyntaxException exception = assertThrows(CommandSyntaxException.class, () -> server.dispatchThrowableCommand(sender, command));
		assertNotEquals(message, exception.getMessage());
	}
	
	public void assertNoMoreResults(Mut<?> mut) {
		assertThrows(NoSuchElementException.class, () -> mut.get(), "Expected there to be no results left, but at least one was found");
	}

	public String getDispatcherString() {
		try {
			return Files.readString(new File(plugin.getDataFolder(), "command_registration.json").toPath());
		} catch (IOException e) {
			e.printStackTrace(System.out);
			return "";
		}
	}
	
	public void registerDummyCommands(CommandMap commandMap, String... commandName) {
		commandMap.registerAll("minecraft", Arrays.stream(commandName).map(name -> 
			new Command(name) {
				@Override
				public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
					return true;
				}
			}
		).collect(Collectors.toList()));
	}
	
	public <T> void compareLists(Collection<T> list1, Collection<T> list2) {
		Set<T> s1 = new LinkedHashSet<>(list1);
		Set<T> s2 = new LinkedHashSet<>(list2);
		
		Set<T> s1_2 = new LinkedHashSet<>(list1);
		Set<T> s2_2 = new LinkedHashSet<>(list2);
		
		s1.removeAll(s2);
		s2_2.removeAll(s1_2);
		System.out.println("List 1 has the following extra items: " + s1);
		System.out.println("List 2 has the following extra items: " + s2_2);
	}

}
