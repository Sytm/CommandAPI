package dev.jorel.commandapi.test;

import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffectType;

import dev.jorel.commandapi.CommandAPIBukkit;

public abstract class Enums extends ArgumentNMS {

	public Enums(CommandAPIBukkit<?> baseNMS) {
		super(baseNMS);
	}

	@Override
	public final Enchantment[] getEnchantments() {
		return new Enchantment[] {
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_FIRE,
			Enchantment.PROTECTION_FALL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.OXYGEN,
			Enchantment.WATER_WORKER,
			Enchantment.THORNS,
			Enchantment.DEPTH_STRIDER,
			Enchantment.FROST_WALKER,
			Enchantment.BINDING_CURSE,
			Enchantment.DAMAGE_ALL,
			Enchantment.DAMAGE_UNDEAD,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.KNOCKBACK,
			Enchantment.FIRE_ASPECT,
			Enchantment.LOOT_BONUS_MOBS,
			Enchantment.SWEEPING_EDGE,
			Enchantment.DIG_SPEED,
			Enchantment.SILK_TOUCH,
			Enchantment.DURABILITY,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.ARROW_DAMAGE,
			Enchantment.ARROW_KNOCKBACK,
			Enchantment.ARROW_FIRE,
			Enchantment.ARROW_INFINITE,
			Enchantment.LUCK,
			Enchantment.LURE,
			Enchantment.LOYALTY,
			Enchantment.IMPALING,
			Enchantment.RIPTIDE,
			Enchantment.CHANNELING,
			Enchantment.MENDING,
			Enchantment.VANISHING_CURSE
		};
	}

	@Override
	public final EntityType[] getEntityTypes() {
		return new EntityType[] {
			EntityType.DROPPED_ITEM,
			EntityType.EXPERIENCE_ORB,
			EntityType.AREA_EFFECT_CLOUD,
			EntityType.ELDER_GUARDIAN,
			EntityType.WITHER_SKELETON,
			EntityType.STRAY,
			EntityType.EGG,
			EntityType.LEASH_HITCH,
			EntityType.PAINTING,
			EntityType.ARROW,
			EntityType.SNOWBALL,
			EntityType.FIREBALL,
			EntityType.SMALL_FIREBALL,
			EntityType.ENDER_PEARL,
			EntityType.ENDER_SIGNAL,
			EntityType.SPLASH_POTION,
			EntityType.THROWN_EXP_BOTTLE,
			EntityType.ITEM_FRAME,
			EntityType.WITHER_SKULL,
			EntityType.PRIMED_TNT,
			EntityType.FALLING_BLOCK,
			EntityType.FIREWORK,
			EntityType.HUSK,
			EntityType.SPECTRAL_ARROW,
			EntityType.SHULKER_BULLET,
			EntityType.DRAGON_FIREBALL,
			EntityType.ZOMBIE_VILLAGER,
			EntityType.SKELETON_HORSE,
			EntityType.ZOMBIE_HORSE,
			EntityType.ARMOR_STAND,
			EntityType.DONKEY,
			EntityType.MULE,
			EntityType.EVOKER_FANGS,
			EntityType.EVOKER,
			EntityType.VEX,
			EntityType.VINDICATOR,
			EntityType.ILLUSIONER,
			EntityType.MINECART_COMMAND,
			EntityType.BOAT,
			EntityType.MINECART,
			EntityType.MINECART_CHEST,
			EntityType.MINECART_FURNACE,
			EntityType.MINECART_TNT,
			EntityType.MINECART_HOPPER,
			EntityType.MINECART_MOB_SPAWNER,
			EntityType.CREEPER,
			EntityType.SKELETON,
			EntityType.SPIDER,
			EntityType.GIANT,
			EntityType.ZOMBIE,
			EntityType.SLIME,
			EntityType.GHAST,
			EntityType.PIG_ZOMBIE,
			EntityType.ENDERMAN,
			EntityType.CAVE_SPIDER,
			EntityType.SILVERFISH,
			EntityType.BLAZE,
			EntityType.MAGMA_CUBE,
			EntityType.ENDER_DRAGON,
			EntityType.WITHER,
			EntityType.BAT,
			EntityType.WITCH,
			EntityType.ENDERMITE,
			EntityType.GUARDIAN,
			EntityType.SHULKER,
			EntityType.PIG,
			EntityType.SHEEP,
			EntityType.COW,
			EntityType.CHICKEN,
			EntityType.SQUID,
			EntityType.WOLF,
			EntityType.MUSHROOM_COW,
			EntityType.SNOWMAN,
			EntityType.OCELOT,
			EntityType.IRON_GOLEM,
			EntityType.HORSE,
			EntityType.RABBIT,
			EntityType.POLAR_BEAR,
			EntityType.LLAMA,
			EntityType.LLAMA_SPIT,
			EntityType.PARROT,
			EntityType.VILLAGER,
			EntityType.ENDER_CRYSTAL,
			EntityType.TURTLE,
			EntityType.PHANTOM,
			EntityType.TRIDENT,
			EntityType.COD,
			EntityType.SALMON,
			EntityType.PUFFERFISH,
			EntityType.TROPICAL_FISH,
			EntityType.DROWNED,
			EntityType.DOLPHIN,
			EntityType.LINGERING_POTION,
			EntityType.FISHING_HOOK,
			EntityType.LIGHTNING,
			EntityType.WEATHER,
			EntityType.PLAYER,
			EntityType.COMPLEX_PART,
			EntityType.TIPPED_ARROW,
			EntityType.UNKNOWN
		};
	}

	@Override
	public final org.bukkit.loot.LootTables[] getLootTables() {
		return new org.bukkit.loot.LootTables[] {
			// org.bukkit.loot.LootTables.EMPTY,
			org.bukkit.loot.LootTables.ABANDONED_MINESHAFT,
			org.bukkit.loot.LootTables.BURIED_TREASURE,
			org.bukkit.loot.LootTables.DESERT_PYRAMID,
			org.bukkit.loot.LootTables.END_CITY_TREASURE,
			org.bukkit.loot.LootTables.IGLOO_CHEST,
			org.bukkit.loot.LootTables.JUNGLE_TEMPLE,
			org.bukkit.loot.LootTables.JUNGLE_TEMPLE_DISPENSER,
			org.bukkit.loot.LootTables.NETHER_BRIDGE,
			org.bukkit.loot.LootTables.SHIPWRECK_MAP,
			org.bukkit.loot.LootTables.SHIPWRECK_SUPPLY,
			org.bukkit.loot.LootTables.SHIPWRECK_TREASURE,
			org.bukkit.loot.LootTables.SIMPLE_DUNGEON,
			org.bukkit.loot.LootTables.SPAWN_BONUS_CHEST,
			org.bukkit.loot.LootTables.STRONGHOLD_CORRIDOR,
			org.bukkit.loot.LootTables.STRONGHOLD_CROSSING,
			org.bukkit.loot.LootTables.STRONGHOLD_LIBRARY,
			org.bukkit.loot.LootTables.UNDERWATER_RUIN_BIG,
			org.bukkit.loot.LootTables.UNDERWATER_RUIN_SMALL,
			org.bukkit.loot.LootTables.VILLAGE_BLACKSMITH,
			org.bukkit.loot.LootTables.WOODLAND_MANSION,
			org.bukkit.loot.LootTables.BAT,
			org.bukkit.loot.LootTables.BLAZE,
			org.bukkit.loot.LootTables.CAVE_SPIDER,
			org.bukkit.loot.LootTables.CHICKEN,
			org.bukkit.loot.LootTables.COD,
			org.bukkit.loot.LootTables.COW,
			org.bukkit.loot.LootTables.CREEPER,
			org.bukkit.loot.LootTables.DOLPHIN,
			org.bukkit.loot.LootTables.DONKEY,
			org.bukkit.loot.LootTables.DROWNED,
			org.bukkit.loot.LootTables.ELDER_GUARDIAN,
			org.bukkit.loot.LootTables.ENDERMAN,
			org.bukkit.loot.LootTables.ENDERMITE,
			org.bukkit.loot.LootTables.ENDER_DRAGON,
			org.bukkit.loot.LootTables.EVOKER,
			org.bukkit.loot.LootTables.GHAST,
			org.bukkit.loot.LootTables.GIANT,
			org.bukkit.loot.LootTables.GUARDIAN,
			org.bukkit.loot.LootTables.HORSE,
			org.bukkit.loot.LootTables.HUSK,
			org.bukkit.loot.LootTables.IRON_GOLEM,
			org.bukkit.loot.LootTables.LLAMA,
			org.bukkit.loot.LootTables.MAGMA_CUBE,
			org.bukkit.loot.LootTables.MULE,
			org.bukkit.loot.LootTables.MUSHROOM_COW,
			org.bukkit.loot.LootTables.OCELOT,
			org.bukkit.loot.LootTables.PARROT,
			org.bukkit.loot.LootTables.PHANTOM,
			org.bukkit.loot.LootTables.PIG,
			org.bukkit.loot.LootTables.POLAR_BEAR,
			org.bukkit.loot.LootTables.PUFFERFISH,
			org.bukkit.loot.LootTables.RABBIT,
			org.bukkit.loot.LootTables.SALMON,
			org.bukkit.loot.LootTables.SHULKER,
			org.bukkit.loot.LootTables.SILVERFISH,
			org.bukkit.loot.LootTables.SKELETON,
			org.bukkit.loot.LootTables.SKELETON_HORSE,
			org.bukkit.loot.LootTables.SLIME,
			org.bukkit.loot.LootTables.SNOW_GOLEM,
			org.bukkit.loot.LootTables.SPIDER,
			org.bukkit.loot.LootTables.SQUID,
			org.bukkit.loot.LootTables.STRAY,
			org.bukkit.loot.LootTables.TROPICAL_FISH,
			org.bukkit.loot.LootTables.TURTLE,
			org.bukkit.loot.LootTables.VEX,
			org.bukkit.loot.LootTables.VILLAGER,
			org.bukkit.loot.LootTables.VINDICATOR,
			org.bukkit.loot.LootTables.WITCH,
			org.bukkit.loot.LootTables.WITHER_SKELETON,
			org.bukkit.loot.LootTables.WOLF,
			org.bukkit.loot.LootTables.ZOMBIE,
			org.bukkit.loot.LootTables.ZOMBIE_HORSE,
			org.bukkit.loot.LootTables.ZOMBIE_PIGMAN,
			org.bukkit.loot.LootTables.ZOMBIE_VILLAGER,
			org.bukkit.loot.LootTables.FISHING,
			org.bukkit.loot.LootTables.FISHING_FISH,
			org.bukkit.loot.LootTables.FISHING_JUNK,
			org.bukkit.loot.LootTables.FISHING_TREASURE,
			org.bukkit.loot.LootTables.SHEEP,
			org.bukkit.loot.LootTables.SHEEP_BLACK,
			org.bukkit.loot.LootTables.SHEEP_BLUE,
			org.bukkit.loot.LootTables.SHEEP_BROWN,
			org.bukkit.loot.LootTables.SHEEP_CYAN,
			org.bukkit.loot.LootTables.SHEEP_GRAY,
			org.bukkit.loot.LootTables.SHEEP_GREEN,
			org.bukkit.loot.LootTables.SHEEP_LIGHT_BLUE,
			org.bukkit.loot.LootTables.SHEEP_LIME,
			org.bukkit.loot.LootTables.SHEEP_MAGENTA,
			org.bukkit.loot.LootTables.SHEEP_ORANGE,
			org.bukkit.loot.LootTables.SHEEP_PINK,
			org.bukkit.loot.LootTables.SHEEP_PURPLE,
			org.bukkit.loot.LootTables.SHEEP_RED,
			org.bukkit.loot.LootTables.SHEEP_WHITE,
			org.bukkit.loot.LootTables.SHEEP_YELLOW
		};
	}

	@Override
	public final PotionEffectType[] getPotionEffects() {
		return new PotionEffectType[] {
			PotionEffectType.SPEED,
			PotionEffectType.SLOW,
			PotionEffectType.FAST_DIGGING,
			PotionEffectType.SLOW_DIGGING,
			PotionEffectType.INCREASE_DAMAGE,
			PotionEffectType.HEAL,
			PotionEffectType.HARM,
			PotionEffectType.JUMP,
			PotionEffectType.CONFUSION,
			PotionEffectType.REGENERATION,
			PotionEffectType.DAMAGE_RESISTANCE,
			PotionEffectType.FIRE_RESISTANCE,
			PotionEffectType.WATER_BREATHING,
			PotionEffectType.INVISIBILITY,
			PotionEffectType.BLINDNESS,
			PotionEffectType.NIGHT_VISION,
			PotionEffectType.HUNGER,
			PotionEffectType.WEAKNESS,
			PotionEffectType.POISON,
			PotionEffectType.WITHER,
			PotionEffectType.HEALTH_BOOST,
			PotionEffectType.ABSORPTION,
			PotionEffectType.SATURATION,
			PotionEffectType.GLOWING,
			PotionEffectType.LEVITATION,
			PotionEffectType.LUCK,
			PotionEffectType.UNLUCK,
			PotionEffectType.SLOW_FALLING,
			PotionEffectType.CONDUIT_POWER,
			PotionEffectType.DOLPHINS_GRACE
		};
	}
	
	@Override
	public Sound[] getSounds() {
		return new Sound[] {
			Sound.AMBIENT_CAVE,
			Sound.AMBIENT_UNDERWATER_ENTER,
			Sound.AMBIENT_UNDERWATER_EXIT,
			Sound.AMBIENT_UNDERWATER_LOOP,
			Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS,
			Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE,
			Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE,
			Sound.BLOCK_ANVIL_BREAK,
			Sound.BLOCK_ANVIL_DESTROY,
			Sound.BLOCK_ANVIL_FALL,
			Sound.BLOCK_ANVIL_HIT,
			Sound.BLOCK_ANVIL_LAND,
			Sound.BLOCK_ANVIL_PLACE,
			Sound.BLOCK_ANVIL_STEP,
			Sound.BLOCK_ANVIL_USE,
			Sound.BLOCK_BEACON_ACTIVATE,
			Sound.BLOCK_BEACON_AMBIENT,
			Sound.BLOCK_BEACON_DEACTIVATE,
			Sound.BLOCK_BEACON_POWER_SELECT,
			Sound.BLOCK_BREWING_STAND_BREW,
			Sound.BLOCK_BUBBLE_COLUMN_BUBBLE_POP,
			Sound.BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT,
			Sound.BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE,
			Sound.BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT,
			Sound.BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE,
			Sound.BLOCK_CHEST_CLOSE,
			Sound.BLOCK_CHEST_LOCKED,
			Sound.BLOCK_CHEST_OPEN,
			Sound.BLOCK_CHORUS_FLOWER_DEATH,
			Sound.BLOCK_CHORUS_FLOWER_GROW,
			Sound.BLOCK_COMPARATOR_CLICK,
			Sound.BLOCK_CONDUIT_ACTIVATE,
			Sound.BLOCK_CONDUIT_AMBIENT,
			Sound.BLOCK_CONDUIT_AMBIENT_SHORT,
			Sound.BLOCK_CONDUIT_ATTACK_TARGET,
			Sound.BLOCK_CONDUIT_DEACTIVATE,
			Sound.BLOCK_CORAL_BLOCK_BREAK,
			Sound.BLOCK_CORAL_BLOCK_FALL,
			Sound.BLOCK_CORAL_BLOCK_HIT,
			Sound.BLOCK_CORAL_BLOCK_PLACE,
			Sound.BLOCK_CORAL_BLOCK_STEP,
			Sound.BLOCK_DISPENSER_DISPENSE,
			Sound.BLOCK_DISPENSER_FAIL,
			Sound.BLOCK_DISPENSER_LAUNCH,
			Sound.BLOCK_ENCHANTMENT_TABLE_USE,
			Sound.BLOCK_ENDER_CHEST_CLOSE,
			Sound.BLOCK_ENDER_CHEST_OPEN,
			Sound.BLOCK_END_GATEWAY_SPAWN,
			Sound.BLOCK_END_PORTAL_FRAME_FILL,
			Sound.BLOCK_END_PORTAL_SPAWN,
			Sound.BLOCK_FENCE_GATE_CLOSE,
			Sound.BLOCK_FENCE_GATE_OPEN,
			Sound.BLOCK_FIRE_AMBIENT,
			Sound.BLOCK_FIRE_EXTINGUISH,
			Sound.BLOCK_FURNACE_FIRE_CRACKLE,
			Sound.BLOCK_GLASS_BREAK,
			Sound.BLOCK_GLASS_FALL,
			Sound.BLOCK_GLASS_HIT,
			Sound.BLOCK_GLASS_PLACE,
			Sound.BLOCK_GLASS_STEP,
			Sound.BLOCK_GRASS_BREAK,
			Sound.BLOCK_GRASS_FALL,
			Sound.BLOCK_GRASS_HIT,
			Sound.BLOCK_GRASS_PLACE,
			Sound.BLOCK_GRASS_STEP,
			Sound.BLOCK_GRAVEL_BREAK,
			Sound.BLOCK_GRAVEL_FALL,
			Sound.BLOCK_GRAVEL_HIT,
			Sound.BLOCK_GRAVEL_PLACE,
			Sound.BLOCK_GRAVEL_STEP,
			Sound.BLOCK_IRON_DOOR_CLOSE,
			Sound.BLOCK_IRON_DOOR_OPEN,
			Sound.BLOCK_IRON_TRAPDOOR_CLOSE,
			Sound.BLOCK_IRON_TRAPDOOR_OPEN,
			Sound.BLOCK_LADDER_BREAK,
			Sound.BLOCK_LADDER_FALL,
			Sound.BLOCK_LADDER_HIT,
			Sound.BLOCK_LADDER_PLACE,
			Sound.BLOCK_LADDER_STEP,
			Sound.BLOCK_LAVA_AMBIENT,
			Sound.BLOCK_LAVA_EXTINGUISH,
			Sound.BLOCK_LAVA_POP,
			Sound.BLOCK_LEVER_CLICK,
			Sound.BLOCK_LILY_PAD_PLACE,
			Sound.BLOCK_METAL_BREAK,
			Sound.BLOCK_METAL_FALL,
			Sound.BLOCK_METAL_HIT,
			Sound.BLOCK_METAL_PLACE,
			Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF,
			Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON,
			Sound.BLOCK_METAL_STEP,
			Sound.BLOCK_NOTE_BLOCK_BASEDRUM,
			Sound.BLOCK_NOTE_BLOCK_BASS,
			Sound.BLOCK_NOTE_BLOCK_BELL,
			Sound.BLOCK_NOTE_BLOCK_CHIME,
			Sound.BLOCK_NOTE_BLOCK_FLUTE,
			Sound.BLOCK_NOTE_BLOCK_GUITAR,
			Sound.BLOCK_NOTE_BLOCK_HARP,
			Sound.BLOCK_NOTE_BLOCK_HAT,
			Sound.BLOCK_NOTE_BLOCK_PLING,
			Sound.BLOCK_NOTE_BLOCK_SNARE,
			Sound.BLOCK_NOTE_BLOCK_XYLOPHONE,
			Sound.BLOCK_PISTON_CONTRACT,
			Sound.BLOCK_PISTON_EXTEND,
			Sound.BLOCK_PORTAL_AMBIENT,
			Sound.BLOCK_PORTAL_TRAVEL,
			Sound.BLOCK_PORTAL_TRIGGER,
			Sound.BLOCK_PUMPKIN_CARVE,
			Sound.BLOCK_REDSTONE_TORCH_BURNOUT,
			Sound.BLOCK_SAND_BREAK,
			Sound.BLOCK_SAND_FALL,
			Sound.BLOCK_SAND_HIT,
			Sound.BLOCK_SAND_PLACE,
			Sound.BLOCK_SAND_STEP,
			Sound.BLOCK_SHULKER_BOX_CLOSE,
			Sound.BLOCK_SHULKER_BOX_OPEN,
			Sound.BLOCK_SLIME_BLOCK_BREAK,
			Sound.BLOCK_SLIME_BLOCK_FALL,
			Sound.BLOCK_SLIME_BLOCK_HIT,
			Sound.BLOCK_SLIME_BLOCK_PLACE,
			Sound.BLOCK_SLIME_BLOCK_STEP,
			Sound.BLOCK_SNOW_BREAK,
			Sound.BLOCK_SNOW_FALL,
			Sound.BLOCK_SNOW_HIT,
			Sound.BLOCK_SNOW_PLACE,
			Sound.BLOCK_SNOW_STEP,
			Sound.BLOCK_STONE_BREAK,
			Sound.BLOCK_STONE_BUTTON_CLICK_OFF,
			Sound.BLOCK_STONE_BUTTON_CLICK_ON,
			Sound.BLOCK_STONE_FALL,
			Sound.BLOCK_STONE_HIT,
			Sound.BLOCK_STONE_PLACE,
			Sound.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
			Sound.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON,
			Sound.BLOCK_STONE_STEP,
			Sound.BLOCK_TRIPWIRE_ATTACH,
			Sound.BLOCK_TRIPWIRE_CLICK_OFF,
			Sound.BLOCK_TRIPWIRE_CLICK_ON,
			Sound.BLOCK_TRIPWIRE_DETACH,
			Sound.BLOCK_WATER_AMBIENT,
			Sound.BLOCK_WET_GRASS_BREAK,
			Sound.BLOCK_WET_GRASS_FALL,
			Sound.BLOCK_WET_GRASS_HIT,
			Sound.BLOCK_WET_GRASS_PLACE,
			Sound.BLOCK_WET_GRASS_STEP,
			Sound.BLOCK_WOODEN_BUTTON_CLICK_OFF,
			Sound.BLOCK_WOODEN_BUTTON_CLICK_ON,
			Sound.BLOCK_WOODEN_DOOR_CLOSE,
			Sound.BLOCK_WOODEN_DOOR_OPEN,
			Sound.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
			Sound.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON,
			Sound.BLOCK_WOODEN_TRAPDOOR_CLOSE,
			Sound.BLOCK_WOODEN_TRAPDOOR_OPEN,
			Sound.BLOCK_WOOD_BREAK,
			Sound.BLOCK_WOOD_FALL,
			Sound.BLOCK_WOOD_HIT,
			Sound.BLOCK_WOOD_PLACE,
			Sound.BLOCK_WOOD_STEP,
			Sound.BLOCK_WOOL_BREAK,
			Sound.BLOCK_WOOL_FALL,
			Sound.BLOCK_WOOL_HIT,
			Sound.BLOCK_WOOL_PLACE,
			Sound.BLOCK_WOOL_STEP,
			Sound.ENCHANT_THORNS_HIT,
			Sound.ENTITY_ARMOR_STAND_BREAK,
			Sound.ENTITY_ARMOR_STAND_FALL,
			Sound.ENTITY_ARMOR_STAND_HIT,
			Sound.ENTITY_ARMOR_STAND_PLACE,
			Sound.ENTITY_ARROW_HIT,
			Sound.ENTITY_ARROW_HIT_PLAYER,
			Sound.ENTITY_ARROW_SHOOT,
			Sound.ENTITY_BAT_AMBIENT,
			Sound.ENTITY_BAT_DEATH,
			Sound.ENTITY_BAT_HURT,
			Sound.ENTITY_BAT_LOOP,
			Sound.ENTITY_BAT_TAKEOFF,
			Sound.ENTITY_BLAZE_AMBIENT,
			Sound.ENTITY_BLAZE_BURN,
			Sound.ENTITY_BLAZE_DEATH,
			Sound.ENTITY_BLAZE_HURT,
			Sound.ENTITY_BLAZE_SHOOT,
			Sound.ENTITY_BOAT_PADDLE_LAND,
			Sound.ENTITY_BOAT_PADDLE_WATER,
			Sound.ENTITY_CAT_AMBIENT,
			Sound.ENTITY_CAT_DEATH,
			Sound.ENTITY_CAT_HISS,
			Sound.ENTITY_CAT_HURT,
			Sound.ENTITY_CAT_PURR,
			Sound.ENTITY_CAT_PURREOW,
			Sound.ENTITY_CHICKEN_AMBIENT,
			Sound.ENTITY_CHICKEN_DEATH,
			Sound.ENTITY_CHICKEN_EGG,
			Sound.ENTITY_CHICKEN_HURT,
			Sound.ENTITY_CHICKEN_STEP,
			Sound.ENTITY_COD_AMBIENT,
			Sound.ENTITY_COD_DEATH,
			Sound.ENTITY_COD_FLOP,
			Sound.ENTITY_COD_HURT,
			Sound.ENTITY_COW_AMBIENT,
			Sound.ENTITY_COW_DEATH,
			Sound.ENTITY_COW_HURT,
			Sound.ENTITY_COW_MILK,
			Sound.ENTITY_COW_STEP,
			Sound.ENTITY_CREEPER_DEATH,
			Sound.ENTITY_CREEPER_HURT,
			Sound.ENTITY_CREEPER_PRIMED,
			Sound.ENTITY_DOLPHIN_AMBIENT,
			Sound.ENTITY_DOLPHIN_AMBIENT_WATER,
			Sound.ENTITY_DOLPHIN_ATTACK,
			Sound.ENTITY_DOLPHIN_DEATH,
			Sound.ENTITY_DOLPHIN_EAT,
			Sound.ENTITY_DOLPHIN_HURT,
			Sound.ENTITY_DOLPHIN_JUMP,
			Sound.ENTITY_DOLPHIN_PLAY,
			Sound.ENTITY_DOLPHIN_SPLASH,
			Sound.ENTITY_DOLPHIN_SWIM,
			Sound.ENTITY_DONKEY_AMBIENT,
			Sound.ENTITY_DONKEY_ANGRY,
			Sound.ENTITY_DONKEY_CHEST,
			Sound.ENTITY_DONKEY_DEATH,
			Sound.ENTITY_DONKEY_HURT,
			Sound.ENTITY_DRAGON_FIREBALL_EXPLODE,
			Sound.ENTITY_DROWNED_AMBIENT,
			Sound.ENTITY_DROWNED_AMBIENT_WATER,
			Sound.ENTITY_DROWNED_DEATH,
			Sound.ENTITY_DROWNED_DEATH_WATER,
			Sound.ENTITY_DROWNED_HURT,
			Sound.ENTITY_DROWNED_HURT_WATER,
			Sound.ENTITY_DROWNED_SHOOT,
			Sound.ENTITY_DROWNED_STEP,
			Sound.ENTITY_DROWNED_SWIM,
			Sound.ENTITY_EGG_THROW,
			Sound.ENTITY_ELDER_GUARDIAN_AMBIENT,
			Sound.ENTITY_ELDER_GUARDIAN_AMBIENT_LAND,
			Sound.ENTITY_ELDER_GUARDIAN_CURSE,
			Sound.ENTITY_ELDER_GUARDIAN_DEATH,
			Sound.ENTITY_ELDER_GUARDIAN_DEATH_LAND,
			Sound.ENTITY_ELDER_GUARDIAN_FLOP,
			Sound.ENTITY_ELDER_GUARDIAN_HURT,
			Sound.ENTITY_ELDER_GUARDIAN_HURT_LAND,
			Sound.ENTITY_ENDERMAN_AMBIENT,
			Sound.ENTITY_ENDERMAN_DEATH,
			Sound.ENTITY_ENDERMAN_HURT,
			Sound.ENTITY_ENDERMAN_SCREAM,
			Sound.ENTITY_ENDERMAN_STARE,
			Sound.ENTITY_ENDERMAN_TELEPORT,
			Sound.ENTITY_ENDERMITE_AMBIENT,
			Sound.ENTITY_ENDERMITE_DEATH,
			Sound.ENTITY_ENDERMITE_HURT,
			Sound.ENTITY_ENDERMITE_STEP,
			Sound.ENTITY_ENDER_DRAGON_AMBIENT,
			Sound.ENTITY_ENDER_DRAGON_DEATH,
			Sound.ENTITY_ENDER_DRAGON_FLAP,
			Sound.ENTITY_ENDER_DRAGON_GROWL,
			Sound.ENTITY_ENDER_DRAGON_HURT,
			Sound.ENTITY_ENDER_DRAGON_SHOOT,
			Sound.ENTITY_ENDER_EYE_DEATH,
			Sound.ENTITY_ENDER_EYE_LAUNCH,
			Sound.ENTITY_ENDER_PEARL_THROW,
			Sound.ENTITY_EVOKER_AMBIENT,
			Sound.ENTITY_EVOKER_CAST_SPELL,
			Sound.ENTITY_EVOKER_DEATH,
			Sound.ENTITY_EVOKER_FANGS_ATTACK,
			Sound.ENTITY_EVOKER_HURT,
			Sound.ENTITY_EVOKER_PREPARE_ATTACK,
			Sound.ENTITY_EVOKER_PREPARE_SUMMON,
			Sound.ENTITY_EVOKER_PREPARE_WOLOLO,
			Sound.ENTITY_EXPERIENCE_BOTTLE_THROW,
			Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
			Sound.ENTITY_FIREWORK_ROCKET_BLAST,
			Sound.ENTITY_FIREWORK_ROCKET_BLAST_FAR,
			Sound.ENTITY_FIREWORK_ROCKET_LARGE_BLAST,
			Sound.ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR,
			Sound.ENTITY_FIREWORK_ROCKET_LAUNCH,
			Sound.ENTITY_FIREWORK_ROCKET_SHOOT,
			Sound.ENTITY_FIREWORK_ROCKET_TWINKLE,
			Sound.ENTITY_FIREWORK_ROCKET_TWINKLE_FAR,
			Sound.ENTITY_FISHING_BOBBER_RETRIEVE,
			Sound.ENTITY_FISHING_BOBBER_SPLASH,
			Sound.ENTITY_FISHING_BOBBER_THROW,
			Sound.ENTITY_FISH_SWIM,
			Sound.ENTITY_GENERIC_BIG_FALL,
			Sound.ENTITY_GENERIC_BURN,
			Sound.ENTITY_GENERIC_DEATH,
			Sound.ENTITY_GENERIC_DRINK,
			Sound.ENTITY_GENERIC_EAT,
			Sound.ENTITY_GENERIC_EXPLODE,
			Sound.ENTITY_GENERIC_EXTINGUISH_FIRE,
			Sound.ENTITY_GENERIC_HURT,
			Sound.ENTITY_GENERIC_SMALL_FALL,
			Sound.ENTITY_GENERIC_SPLASH,
			Sound.ENTITY_GENERIC_SWIM,
			Sound.ENTITY_GHAST_AMBIENT,
			Sound.ENTITY_GHAST_DEATH,
			Sound.ENTITY_GHAST_HURT,
			Sound.ENTITY_GHAST_SCREAM,
			Sound.ENTITY_GHAST_SHOOT,
			Sound.ENTITY_GHAST_WARN,
			Sound.ENTITY_GUARDIAN_AMBIENT,
			Sound.ENTITY_GUARDIAN_AMBIENT_LAND,
			Sound.ENTITY_GUARDIAN_ATTACK,
			Sound.ENTITY_GUARDIAN_DEATH,
			Sound.ENTITY_GUARDIAN_DEATH_LAND,
			Sound.ENTITY_GUARDIAN_FLOP,
			Sound.ENTITY_GUARDIAN_HURT,
			Sound.ENTITY_GUARDIAN_HURT_LAND,
			Sound.ENTITY_HORSE_AMBIENT,
			Sound.ENTITY_HORSE_ANGRY,
			Sound.ENTITY_HORSE_ARMOR,
			Sound.ENTITY_HORSE_BREATHE,
			Sound.ENTITY_HORSE_DEATH,
			Sound.ENTITY_HORSE_EAT,
			Sound.ENTITY_HORSE_GALLOP,
			Sound.ENTITY_HORSE_HURT,
			Sound.ENTITY_HORSE_JUMP,
			Sound.ENTITY_HORSE_LAND,
			Sound.ENTITY_HORSE_SADDLE,
			Sound.ENTITY_HORSE_STEP,
			Sound.ENTITY_HORSE_STEP_WOOD,
			Sound.ENTITY_HOSTILE_BIG_FALL,
			Sound.ENTITY_HOSTILE_DEATH,
			Sound.ENTITY_HOSTILE_HURT,
			Sound.ENTITY_HOSTILE_SMALL_FALL,
			Sound.ENTITY_HOSTILE_SPLASH,
			Sound.ENTITY_HOSTILE_SWIM,
			Sound.ENTITY_HUSK_AMBIENT,
			Sound.ENTITY_HUSK_CONVERTED_TO_ZOMBIE,
			Sound.ENTITY_HUSK_DEATH,
			Sound.ENTITY_HUSK_HURT,
			Sound.ENTITY_HUSK_STEP,
			Sound.ENTITY_ILLUSIONER_AMBIENT,
			Sound.ENTITY_ILLUSIONER_CAST_SPELL,
			Sound.ENTITY_ILLUSIONER_DEATH,
			Sound.ENTITY_ILLUSIONER_HURT,
			Sound.ENTITY_ILLUSIONER_MIRROR_MOVE,
			Sound.ENTITY_ILLUSIONER_PREPARE_BLINDNESS,
			Sound.ENTITY_ILLUSIONER_PREPARE_MIRROR,
			Sound.ENTITY_IRON_GOLEM_ATTACK,
			Sound.ENTITY_IRON_GOLEM_DEATH,
			Sound.ENTITY_IRON_GOLEM_HURT,
			Sound.ENTITY_IRON_GOLEM_STEP,
			Sound.ENTITY_ITEM_BREAK,
			Sound.ENTITY_ITEM_FRAME_ADD_ITEM,
			Sound.ENTITY_ITEM_FRAME_BREAK,
			Sound.ENTITY_ITEM_FRAME_PLACE,
			Sound.ENTITY_ITEM_FRAME_REMOVE_ITEM,
			Sound.ENTITY_ITEM_FRAME_ROTATE_ITEM,
			Sound.ENTITY_ITEM_PICKUP,
			Sound.ENTITY_LEASH_KNOT_BREAK,
			Sound.ENTITY_LEASH_KNOT_PLACE,
			Sound.ENTITY_LIGHTNING_BOLT_IMPACT,
			Sound.ENTITY_LIGHTNING_BOLT_THUNDER,
			Sound.ENTITY_LINGERING_POTION_THROW,
			Sound.ENTITY_LLAMA_AMBIENT,
			Sound.ENTITY_LLAMA_ANGRY,
			Sound.ENTITY_LLAMA_CHEST,
			Sound.ENTITY_LLAMA_DEATH,
			Sound.ENTITY_LLAMA_EAT,
			Sound.ENTITY_LLAMA_HURT,
			Sound.ENTITY_LLAMA_SPIT,
			Sound.ENTITY_LLAMA_STEP,
			Sound.ENTITY_LLAMA_SWAG,
			Sound.ENTITY_MAGMA_CUBE_DEATH,
			Sound.ENTITY_MAGMA_CUBE_DEATH_SMALL,
			Sound.ENTITY_MAGMA_CUBE_HURT,
			Sound.ENTITY_MAGMA_CUBE_HURT_SMALL,
			Sound.ENTITY_MAGMA_CUBE_JUMP,
			Sound.ENTITY_MAGMA_CUBE_SQUISH,
			Sound.ENTITY_MAGMA_CUBE_SQUISH_SMALL,
			Sound.ENTITY_MINECART_INSIDE,
			Sound.ENTITY_MINECART_RIDING,
			Sound.ENTITY_MOOSHROOM_SHEAR,
			Sound.ENTITY_MULE_AMBIENT,
			Sound.ENTITY_MULE_CHEST,
			Sound.ENTITY_MULE_DEATH,
			Sound.ENTITY_MULE_HURT,
			Sound.ENTITY_PAINTING_BREAK,
			Sound.ENTITY_PAINTING_PLACE,
			Sound.ENTITY_PARROT_AMBIENT,
			Sound.ENTITY_PARROT_DEATH,
			Sound.ENTITY_PARROT_EAT,
			Sound.ENTITY_PARROT_FLY,
			Sound.ENTITY_PARROT_HURT,
			Sound.ENTITY_PARROT_IMITATE_BLAZE,
			Sound.ENTITY_PARROT_IMITATE_CREEPER,
			Sound.ENTITY_PARROT_IMITATE_DROWNED,
			Sound.ENTITY_PARROT_IMITATE_ELDER_GUARDIAN,
			Sound.ENTITY_PARROT_IMITATE_ENDERMAN,
			Sound.ENTITY_PARROT_IMITATE_ENDERMITE,
			Sound.ENTITY_PARROT_IMITATE_ENDER_DRAGON,
			Sound.ENTITY_PARROT_IMITATE_EVOKER,
			Sound.ENTITY_PARROT_IMITATE_GHAST,
			Sound.ENTITY_PARROT_IMITATE_HUSK,
			Sound.ENTITY_PARROT_IMITATE_ILLUSIONER,
			Sound.ENTITY_PARROT_IMITATE_MAGMA_CUBE,
			Sound.ENTITY_PARROT_IMITATE_PHANTOM,
			Sound.ENTITY_PARROT_IMITATE_POLAR_BEAR,
			Sound.ENTITY_PARROT_IMITATE_SHULKER,
			Sound.ENTITY_PARROT_IMITATE_SILVERFISH,
			Sound.ENTITY_PARROT_IMITATE_SKELETON,
			Sound.ENTITY_PARROT_IMITATE_SLIME,
			Sound.ENTITY_PARROT_IMITATE_SPIDER,
			Sound.ENTITY_PARROT_IMITATE_STRAY,
			Sound.ENTITY_PARROT_IMITATE_VEX,
			Sound.ENTITY_PARROT_IMITATE_VINDICATOR,
			Sound.ENTITY_PARROT_IMITATE_WITCH,
			Sound.ENTITY_PARROT_IMITATE_WITHER,
			Sound.ENTITY_PARROT_IMITATE_WITHER_SKELETON,
			Sound.ENTITY_PARROT_IMITATE_WOLF,
			Sound.ENTITY_PARROT_IMITATE_ZOMBIE,
			Sound.ENTITY_PARROT_IMITATE_ZOMBIE_PIGMAN,
			Sound.ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER,
			Sound.ENTITY_PARROT_STEP,
			Sound.ENTITY_PHANTOM_AMBIENT,
			Sound.ENTITY_PHANTOM_BITE,
			Sound.ENTITY_PHANTOM_DEATH,
			Sound.ENTITY_PHANTOM_FLAP,
			Sound.ENTITY_PHANTOM_HURT,
			Sound.ENTITY_PHANTOM_SWOOP,
			Sound.ENTITY_PIG_AMBIENT,
			Sound.ENTITY_PIG_DEATH,
			Sound.ENTITY_PIG_HURT,
			Sound.ENTITY_PIG_SADDLE,
			Sound.ENTITY_PIG_STEP,
			Sound.ENTITY_PLAYER_ATTACK_CRIT,
			Sound.ENTITY_PLAYER_ATTACK_KNOCKBACK,
			Sound.ENTITY_PLAYER_ATTACK_NODAMAGE,
			Sound.ENTITY_PLAYER_ATTACK_STRONG,
			Sound.ENTITY_PLAYER_ATTACK_SWEEP,
			Sound.ENTITY_PLAYER_ATTACK_WEAK,
			Sound.ENTITY_PLAYER_BIG_FALL,
			Sound.ENTITY_PLAYER_BREATH,
			Sound.ENTITY_PLAYER_BURP,
			Sound.ENTITY_PLAYER_DEATH,
			Sound.ENTITY_PLAYER_HURT,
			Sound.ENTITY_PLAYER_HURT_DROWN,
			Sound.ENTITY_PLAYER_HURT_ON_FIRE,
			Sound.ENTITY_PLAYER_LEVELUP,
			Sound.ENTITY_PLAYER_SMALL_FALL,
			Sound.ENTITY_PLAYER_SPLASH,
			Sound.ENTITY_PLAYER_SPLASH_HIGH_SPEED,
			Sound.ENTITY_PLAYER_SWIM,
			Sound.ENTITY_POLAR_BEAR_AMBIENT,
			Sound.ENTITY_POLAR_BEAR_AMBIENT_BABY,
			Sound.ENTITY_POLAR_BEAR_DEATH,
			Sound.ENTITY_POLAR_BEAR_HURT,
			Sound.ENTITY_POLAR_BEAR_STEP,
			Sound.ENTITY_POLAR_BEAR_WARNING,
			Sound.ENTITY_PUFFER_FISH_AMBIENT,
			Sound.ENTITY_PUFFER_FISH_BLOW_OUT,
			Sound.ENTITY_PUFFER_FISH_BLOW_UP,
			Sound.ENTITY_PUFFER_FISH_DEATH,
			Sound.ENTITY_PUFFER_FISH_FLOP,
			Sound.ENTITY_PUFFER_FISH_HURT,
			Sound.ENTITY_PUFFER_FISH_STING,
			Sound.ENTITY_RABBIT_AMBIENT,
			Sound.ENTITY_RABBIT_ATTACK,
			Sound.ENTITY_RABBIT_DEATH,
			Sound.ENTITY_RABBIT_HURT,
			Sound.ENTITY_RABBIT_JUMP,
			Sound.ENTITY_SALMON_AMBIENT,
			Sound.ENTITY_SALMON_DEATH,
			Sound.ENTITY_SALMON_FLOP,
			Sound.ENTITY_SALMON_HURT,
			Sound.ENTITY_SHEEP_AMBIENT,
			Sound.ENTITY_SHEEP_DEATH,
			Sound.ENTITY_SHEEP_HURT,
			Sound.ENTITY_SHEEP_SHEAR,
			Sound.ENTITY_SHEEP_STEP,
			Sound.ENTITY_SHULKER_AMBIENT,
			Sound.ENTITY_SHULKER_BULLET_HIT,
			Sound.ENTITY_SHULKER_BULLET_HURT,
			Sound.ENTITY_SHULKER_CLOSE,
			Sound.ENTITY_SHULKER_DEATH,
			Sound.ENTITY_SHULKER_HURT,
			Sound.ENTITY_SHULKER_HURT_CLOSED,
			Sound.ENTITY_SHULKER_OPEN,
			Sound.ENTITY_SHULKER_SHOOT,
			Sound.ENTITY_SHULKER_TELEPORT,
			Sound.ENTITY_SILVERFISH_AMBIENT,
			Sound.ENTITY_SILVERFISH_DEATH,
			Sound.ENTITY_SILVERFISH_HURT,
			Sound.ENTITY_SILVERFISH_STEP,
			Sound.ENTITY_SKELETON_AMBIENT,
			Sound.ENTITY_SKELETON_DEATH,
			Sound.ENTITY_SKELETON_HORSE_AMBIENT,
			Sound.ENTITY_SKELETON_HORSE_AMBIENT_WATER,
			Sound.ENTITY_SKELETON_HORSE_DEATH,
			Sound.ENTITY_SKELETON_HORSE_GALLOP_WATER,
			Sound.ENTITY_SKELETON_HORSE_HURT,
			Sound.ENTITY_SKELETON_HORSE_JUMP_WATER,
			Sound.ENTITY_SKELETON_HORSE_STEP_WATER,
			Sound.ENTITY_SKELETON_HORSE_SWIM,
			Sound.ENTITY_SKELETON_HURT,
			Sound.ENTITY_SKELETON_SHOOT,
			Sound.ENTITY_SKELETON_STEP,
			Sound.ENTITY_SLIME_ATTACK,
			Sound.ENTITY_SLIME_DEATH,
			Sound.ENTITY_SLIME_DEATH_SMALL,
			Sound.ENTITY_SLIME_HURT,
			Sound.ENTITY_SLIME_HURT_SMALL,
			Sound.ENTITY_SLIME_JUMP,
			Sound.ENTITY_SLIME_JUMP_SMALL,
			Sound.ENTITY_SLIME_SQUISH,
			Sound.ENTITY_SLIME_SQUISH_SMALL,
			Sound.ENTITY_SNOWBALL_THROW,
			Sound.ENTITY_SNOW_GOLEM_AMBIENT,
			Sound.ENTITY_SNOW_GOLEM_DEATH,
			Sound.ENTITY_SNOW_GOLEM_HURT,
			Sound.ENTITY_SNOW_GOLEM_SHOOT,
			Sound.ENTITY_SPIDER_AMBIENT,
			Sound.ENTITY_SPIDER_DEATH,
			Sound.ENTITY_SPIDER_HURT,
			Sound.ENTITY_SPIDER_STEP,
			Sound.ENTITY_SPLASH_POTION_BREAK,
			Sound.ENTITY_SPLASH_POTION_THROW,
			Sound.ENTITY_SQUID_AMBIENT,
			Sound.ENTITY_SQUID_DEATH,
			Sound.ENTITY_SQUID_HURT,
			Sound.ENTITY_SQUID_SQUIRT,
			Sound.ENTITY_STRAY_AMBIENT,
			Sound.ENTITY_STRAY_DEATH,
			Sound.ENTITY_STRAY_HURT,
			Sound.ENTITY_STRAY_STEP,
			Sound.ENTITY_TNT_PRIMED,
			Sound.ENTITY_TROPICAL_FISH_AMBIENT,
			Sound.ENTITY_TROPICAL_FISH_DEATH,
			Sound.ENTITY_TROPICAL_FISH_FLOP,
			Sound.ENTITY_TROPICAL_FISH_HURT,
			Sound.ENTITY_TURTLE_AMBIENT_LAND,
			Sound.ENTITY_TURTLE_DEATH,
			Sound.ENTITY_TURTLE_DEATH_BABY,
			Sound.ENTITY_TURTLE_EGG_BREAK,
			Sound.ENTITY_TURTLE_EGG_CRACK,
			Sound.ENTITY_TURTLE_EGG_HATCH,
			Sound.ENTITY_TURTLE_HURT,
			Sound.ENTITY_TURTLE_HURT_BABY,
			Sound.ENTITY_TURTLE_LAY_EGG,
			Sound.ENTITY_TURTLE_SHAMBLE,
			Sound.ENTITY_TURTLE_SHAMBLE_BABY,
			Sound.ENTITY_TURTLE_SWIM,
			Sound.ENTITY_VEX_AMBIENT,
			Sound.ENTITY_VEX_CHARGE,
			Sound.ENTITY_VEX_DEATH,
			Sound.ENTITY_VEX_HURT,
			Sound.ENTITY_VILLAGER_AMBIENT,
			Sound.ENTITY_VILLAGER_DEATH,
			Sound.ENTITY_VILLAGER_HURT,
			Sound.ENTITY_VILLAGER_NO,
			Sound.ENTITY_VILLAGER_TRADE,
			Sound.ENTITY_VILLAGER_YES,
			Sound.ENTITY_VINDICATOR_AMBIENT,
			Sound.ENTITY_VINDICATOR_DEATH,
			Sound.ENTITY_VINDICATOR_HURT,
			Sound.ENTITY_WITCH_AMBIENT,
			Sound.ENTITY_WITCH_DEATH,
			Sound.ENTITY_WITCH_DRINK,
			Sound.ENTITY_WITCH_HURT,
			Sound.ENTITY_WITCH_THROW,
			Sound.ENTITY_WITHER_AMBIENT,
			Sound.ENTITY_WITHER_BREAK_BLOCK,
			Sound.ENTITY_WITHER_DEATH,
			Sound.ENTITY_WITHER_HURT,
			Sound.ENTITY_WITHER_SHOOT,
			Sound.ENTITY_WITHER_SKELETON_AMBIENT,
			Sound.ENTITY_WITHER_SKELETON_DEATH,
			Sound.ENTITY_WITHER_SKELETON_HURT,
			Sound.ENTITY_WITHER_SKELETON_STEP,
			Sound.ENTITY_WITHER_SPAWN,
			Sound.ENTITY_WOLF_AMBIENT,
			Sound.ENTITY_WOLF_DEATH,
			Sound.ENTITY_WOLF_GROWL,
			Sound.ENTITY_WOLF_HOWL,
			Sound.ENTITY_WOLF_HURT,
			Sound.ENTITY_WOLF_PANT,
			Sound.ENTITY_WOLF_SHAKE,
			Sound.ENTITY_WOLF_STEP,
			Sound.ENTITY_WOLF_WHINE,
			Sound.ENTITY_ZOMBIE_AMBIENT,
			Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR,
			Sound.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR,
			Sound.ENTITY_ZOMBIE_BREAK_WOODEN_DOOR,
			Sound.ENTITY_ZOMBIE_CONVERTED_TO_DROWNED,
			Sound.ENTITY_ZOMBIE_DEATH,
			Sound.ENTITY_ZOMBIE_DESTROY_EGG,
			Sound.ENTITY_ZOMBIE_HORSE_AMBIENT,
			Sound.ENTITY_ZOMBIE_HORSE_DEATH,
			Sound.ENTITY_ZOMBIE_HORSE_HURT,
			Sound.ENTITY_ZOMBIE_HURT,
			Sound.ENTITY_ZOMBIE_INFECT,
			Sound.ENTITY_ZOMBIE_PIGMAN_AMBIENT,
			Sound.ENTITY_ZOMBIE_PIGMAN_ANGRY,
			Sound.ENTITY_ZOMBIE_PIGMAN_DEATH,
			Sound.ENTITY_ZOMBIE_PIGMAN_HURT,
			Sound.ENTITY_ZOMBIE_STEP,
			Sound.ENTITY_ZOMBIE_VILLAGER_AMBIENT,
			Sound.ENTITY_ZOMBIE_VILLAGER_CONVERTED,
			Sound.ENTITY_ZOMBIE_VILLAGER_CURE,
			Sound.ENTITY_ZOMBIE_VILLAGER_DEATH,
			Sound.ENTITY_ZOMBIE_VILLAGER_HURT,
			Sound.ENTITY_ZOMBIE_VILLAGER_STEP,
			Sound.ITEM_ARMOR_EQUIP_CHAIN,
			Sound.ITEM_ARMOR_EQUIP_DIAMOND,
			Sound.ITEM_ARMOR_EQUIP_ELYTRA,
			Sound.ITEM_ARMOR_EQUIP_GENERIC,
			Sound.ITEM_ARMOR_EQUIP_GOLD,
			Sound.ITEM_ARMOR_EQUIP_IRON,
			Sound.ITEM_ARMOR_EQUIP_LEATHER,
			Sound.ITEM_ARMOR_EQUIP_TURTLE,
			Sound.ITEM_AXE_STRIP,
			Sound.ITEM_BOTTLE_EMPTY,
			Sound.ITEM_BOTTLE_FILL,
			Sound.ITEM_BOTTLE_FILL_DRAGONBREATH,
			Sound.ITEM_BUCKET_EMPTY,
			Sound.ITEM_BUCKET_EMPTY_FISH,
			Sound.ITEM_BUCKET_EMPTY_LAVA,
			Sound.ITEM_BUCKET_FILL,
			Sound.ITEM_BUCKET_FILL_FISH,
			Sound.ITEM_BUCKET_FILL_LAVA,
			Sound.ITEM_CHORUS_FRUIT_TELEPORT,
			Sound.ITEM_ELYTRA_FLYING,
			Sound.ITEM_FIRECHARGE_USE,
			Sound.ITEM_FLINTANDSTEEL_USE,
			Sound.ITEM_HOE_TILL,
			Sound.ITEM_SHIELD_BLOCK,
			Sound.ITEM_SHIELD_BREAK,
			Sound.ITEM_SHOVEL_FLATTEN,
			Sound.ITEM_TOTEM_USE,
			Sound.ITEM_TRIDENT_HIT,
			Sound.ITEM_TRIDENT_HIT_GROUND,
			Sound.ITEM_TRIDENT_RETURN,
			Sound.ITEM_TRIDENT_RIPTIDE_1,
			Sound.ITEM_TRIDENT_RIPTIDE_2,
			Sound.ITEM_TRIDENT_RIPTIDE_3,
			Sound.ITEM_TRIDENT_THROW,
			Sound.ITEM_TRIDENT_THUNDER,
			Sound.MUSIC_CREATIVE,
			Sound.MUSIC_CREDITS,
			Sound.MUSIC_DISC_11,
			Sound.MUSIC_DISC_13,
			Sound.MUSIC_DISC_BLOCKS,
			Sound.MUSIC_DISC_CAT,
			Sound.MUSIC_DISC_CHIRP,
			Sound.MUSIC_DISC_FAR,
			Sound.MUSIC_DISC_MALL,
			Sound.MUSIC_DISC_MELLOHI,
			Sound.MUSIC_DISC_STAL,
			Sound.MUSIC_DISC_STRAD,
			Sound.MUSIC_DISC_WAIT,
			Sound.MUSIC_DISC_WARD,
			Sound.MUSIC_DRAGON,
			Sound.MUSIC_END,
			Sound.MUSIC_GAME,
			Sound.MUSIC_MENU,
			Sound.MUSIC_NETHER,
			Sound.MUSIC_UNDER_WATER,
			Sound.UI_BUTTON_CLICK,
			Sound.UI_TOAST_CHALLENGE_COMPLETE,
			Sound.UI_TOAST_IN,
			Sound.UI_TOAST_OUT,
			Sound.WEATHER_RAIN,
			Sound.WEATHER_RAIN_ABOVE
		};
	}

}
