package net.yeoxuhang.geode.common.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode.GeodeMod;

public class GeodeModTagsRegistry {
    public static class Biomes {
        //Geodes
        public static final TagKey<Biome> HAS_ECHO_GEODE
                = biomeTag("has_echo_geode");
        public static final TagKey<Biome> HAS_NETHER_QUARTZ_GEODE
                = biomeTag("has_nether_quartz_geode");
        public static final TagKey<Biome> HAS_NETHER_GLOWSTONE_GEODE
                = biomeTag("has_nether_glowstone_geode");
        public static final TagKey<Biome> HAS_BASALT_QUARTZ_GEODE
                = biomeTag("has_basalt_quartz_geode");
        public static final TagKey<Biome> HAS_BASALT_GLOWSTONE_GEODE
                = biomeTag("has_basalt_glowstone_geode");
        public static final TagKey<Biome> HAS_WRAPPIST_GEODE
                = biomeTag("has_wrappist_geode");
        public static final TagKey<Biome> HAS_NETHER_GOLD_NUGGET_GEODE
                = biomeTag("has_nether_gold_nugget_geode");

        //Crystals
        public static final TagKey<Biome> HAS_ECHO_CRYSTAL
                = biomeTag("has_echo_crystal");
        public static final TagKey<Biome> HAS_QUARTZ_CRYSTAL
                = biomeTag("has_quartz_crystal");
        public static final TagKey<Biome> HAS_GLOWSTONE_CRYSTAL
                = biomeTag("has_glowstone_crystal");
        public static final TagKey<Biome> HAS_WRAPPIST_CRYSTAL
                = biomeTag("has_warppist_crystal");
        private static TagKey<Biome> biomeTag(String name) {
            return TagKey.create(Registry.BIOME_REGISTRY ,new ResourceLocation(GeodeMod.MOD_ID, name));
        }

    }

    public static class Blocks {
        public static final TagKey<Block> CAN_LARGE_ECHO_CRYSTAL_PLACE
                = blockTag("can_large_echo_crystal_place");

        public static final TagKey<Block> CAN_LARGE_WRAPPIST_CRYSTAL_PLACE
                = blockTag("can_large_wrappist_crystal_place");

        private static TagKey<Block> blockTag(String name) {
            return BlockTags.create(new ResourceLocation(GeodeMod.MOD_ID, name));
        }
    }
}
