package net.yeoxuhang.geode.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeodeModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Geodes
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_LAPIS_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_REDSTONE_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_EMERALD_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_DIAMOND_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_ECHO_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_NETHER_QUARTZ_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_BASALT_QUARTZ_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_NETHER_GOLD_GEODE;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_END_WRAPPIST_GEODE;

    //Crystals
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_ECHO_LARGE_CRYSTAL;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_NETHER_QUARTZ_LARGE_CRYSTAL;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_NETHER_GLOWSTONE_LARGE_CRYSTAL;
    public static final ForgeConfigSpec.BooleanValue SHOULD_GENERATE_END_WRAPPIST_LARGE_CRYSTAL;

    /*public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.BooleanValue WRAPPIST_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> SCULK_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SCULK_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> SCULK_GEODE_MAXIMAL_HEIGHT;*/


    static {
        BUILDER.comment("Geode+ Mod configuration settings");
        BUILDER.push("Configs for Geode+ Mod");

        BUILDER.comment("Configs for Geodes Spawning");
        SHOULD_GENERATE_LAPIS_GEODE = BUILDER.comment("Should Generate Lapis Geode")
                .define("Lapis Geode", true);
        SHOULD_GENERATE_REDSTONE_GEODE = BUILDER.comment("Should Generate Redstone Geode")
                .define("Redstone Geode", true);
        SHOULD_GENERATE_EMERALD_GEODE = BUILDER.comment("Should Generate Emerald Geode")
                .define("Emerald Geode", true);
        SHOULD_GENERATE_DIAMOND_GEODE = BUILDER.comment("Should Generate Diamond Geode")
                .define("Diamond Geode", true);
        SHOULD_GENERATE_ECHO_GEODE = BUILDER.comment("Should Generate Echo Geode")
                .define("Echo Geode", true);
        SHOULD_GENERATE_NETHER_QUARTZ_GEODE = BUILDER.comment("Should Generate Nether Quartz Geode")
                .define("Nether Quartz Geode", true);
        SHOULD_GENERATE_BASALT_QUARTZ_GEODE = BUILDER.comment("Should Generate Basalt Quartz Geode")
                .define("Basalt Quartz Geode", true);
        SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE = BUILDER.comment("Should Generate Nether Glowstone Geode")
                .define("Nether Glowstone Geode", true);
        SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE = BUILDER.comment("Should Generate Basalt Glowstone Geode")
                .define("Basalt Glowstone Geode", true);
        SHOULD_GENERATE_NETHER_GOLD_GEODE = BUILDER.comment("Should Generate Nether Gold Nugget Geode")
                .define("Nether Gold Nugget Geode", true);
        SHOULD_GENERATE_END_WRAPPIST_GEODE = BUILDER.comment("Should Generate End Wrappist Geode")
                .define("End Wrappist Geode", true);

        BUILDER.comment("Configs for Large Crystals Spawning");
        SHOULD_GENERATE_ECHO_LARGE_CRYSTAL = BUILDER.comment("Should Generate Echo Large Crystal")
                .define("Echo Large Crystal", true);
        SHOULD_GENERATE_NETHER_QUARTZ_LARGE_CRYSTAL = BUILDER.comment("Should Generate Nether Quartz Large Crystal")
                .define("Nether Quartz Large Crystal", true);
        SHOULD_GENERATE_NETHER_GLOWSTONE_LARGE_CRYSTAL = BUILDER.comment("Should Generate Nether Glowstone Large Crystal")
                .define("Nether Glowstone Large Crystal", true);
        SHOULD_GENERATE_END_WRAPPIST_LARGE_CRYSTAL = BUILDER.comment("Should Generate End Wrappist Large Crystal")
                .define("End Wrappist Large Crystal", true);





        /*NETHER_QUARTZ_GEODE_PER_CHUNK = BUILDER.comment("Nether Quartz Geode spawn per chunk!")
                .define("Nether Quartz Geodes Per Chunk", 16);
        NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK = BUILDER.comment("Nether Basalt Quartz Geode spawn per chunk!")
                .define("Nether Basalt Quartz Geodes Per Chunk", 16);
        WRAPPIST_GEODE_PER_CHUNK = BUILDER.comment("Wrappist Geode spawn per chunk!")
                .define("Wrappist Geodes Per Chunk", 32);
        SCULK_GEODE_PER_CHUNK = BUILDER.comment("Sculk Geode spawn per chunk!")
                .define("Sculk Geodes Per Chunk", 16);

        BUILDER.comment("Configs for Geode Height");
        NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT = BUILDER.comment("Nether Quartz Geode spawn minimal height!")
                .define("Nether Quartz Geodes Minimal Height", 6);
        NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("Nether Quartz Geode spawn maximal height!")
                .define("Nether Quartz Geodes Maximal Height", 110);
        NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT = BUILDER.comment("Nether Basalt Quartz Geode spawn minimal height!")
                .define("Nether Basalt Quartz Geodes Minimal Height", 6);
        NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("Nether Basalt Quartz Geode spawn maximal height!")
                .define("Nether Basalt Quartz Geodes Maximal Height", 110);
        WRAPPIST_GEODE_MINIMAL_HEIGHT = BUILDER.comment("Wrappist Geode spawn minimal height!")
                .define("Wrappsit Geodes Minimal Height", 0);
        WRAPPIST_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("Wrappist Geode spawn maximal height!")
                .define("Wrappist Geodes Maximal Height", true);
        SCULK_GEODE_MINIMAL_HEIGHT = BUILDER.comment("Sculk Geode spawn minimal height!")
                .define("Sculk Geodes Minimal Height", 6);
        SCULK_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("Sculk Geode spawn maximal height!")
                .define("Sculk Geodes Maximal Height", 30);*/

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
