package dev.jorel.commandapi.test;

import org.bukkit.Color;
import org.bukkit.potion.PotionEffectType;

public class MockPotionEffectType extends PotionEffectType {

	private final int id;
	private final String name;
	private final boolean instant;
	private final Color color;

	public MockPotionEffectType(int id, String name, boolean instant, Color color) {
		super(id);

		this.id = id;
		this.name = name;
		this.instant = instant;
		this.color = color;
	}

	@Deprecated
	@Override
	public double getDurationModifier() {
		// This is deprecated and always returns 1.0
		return 1.0;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isInstant() {
		return instant;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PotionEffectType) {
			return id == ((PotionEffectType) obj).getId();
		}

		return false;
	}

	@Override
	public int hashCode() {
		return id;
	}

}