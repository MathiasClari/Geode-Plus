package net.yeoxuhang.geode.common.world.feature.biome_modifiers;

import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geode.common.registry.GeodeModBiomeModifiersRegistry;
import net.yeoxuhang.geode.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geode.common.registry.GeodeModPlacedFeaturesRegistry;
import net.yeoxuhang.geode.common.registry.GeodeModTagsRegistry;
import net.yeoxuhang.geode.common.world.feature.GeodeModDefaultFeatures;


public class GeodeModGeodeBiomeModifier implements BiomeModifier {
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {

            //Geodes
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.ECHO_GEODE.getHolder().get());
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.QUARTZ_GEODE.getHolder().get());
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.GLOWSTONE_GEODE.getHolder().get());
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.BASALT_QUARTZ_GEODE.getHolder().get());
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.BASALT_GLOWSTONE_GEODE.getHolder().get());
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.GOLD_NUGGET_GEODE.getHolder().get());
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GeodeModPlacedFeaturesRegistry.WRAPPIST_GEODE.getHolder().get());
            }

            //Crystals
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_ECHO_LARGE_CRYSTAL.get()){
                BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
                GeodeModDefaultFeatures.addEchoCrystalSpike(biomeBuilder);
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_LARGE_CRYSTAL.get()) {
                BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
                GeodeModDefaultFeatures.addQuartzCrystalSpike(biomeBuilder);
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_LARGE_CRYSTAL.get()) {
                BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
                GeodeModDefaultFeatures.addGlowstoneCrystalSpike(biomeBuilder);
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_LARGE_CRYSTAL.get()) {
                BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
                GeodeModDefaultFeatures.addWrappistCrystalSpike(biomeBuilder);
            }
        }

    }


    @Override
    public Codec<? extends BiomeModifier> codec() {
        return GeodeModBiomeModifiersRegistry.GEODE_MODIFIER.get();
    }
}