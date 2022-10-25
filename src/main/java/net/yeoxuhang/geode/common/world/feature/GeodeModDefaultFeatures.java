package net.yeoxuhang.geode.common.world.feature;

import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yeoxuhang.geode.common.registry.GeodeModPlacedFeaturesRegistry;

public class GeodeModDefaultFeatures {
    public static void addEchoCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE.getHolder().get());
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.getHolder().get());
    }
    public static void addQuartzCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE.getHolder().get());
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.getHolder().get());
    }
    public static void addGlowstoneCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE.getHolder().get());
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.getHolder().get());
    }
    public static void addWrappistCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.getHolder().get());
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE_FLOOR.getHolder().get());
    }
}
