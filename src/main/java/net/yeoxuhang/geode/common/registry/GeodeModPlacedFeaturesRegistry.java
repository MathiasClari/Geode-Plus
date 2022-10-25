package net.yeoxuhang.geode.common.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;

import java.util.List;

public class GeodeModPlacedFeaturesRegistry {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, GeodeMod.MOD_ID);
    public static final RegistryObject<PlacedFeature> QUARTZ_GEODE = PLACED_FEATURES.register("quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.QUARTZ_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));
    public static final RegistryObject<PlacedFeature> BASALT_QUARTZ_GEODE = PLACED_FEATURES.register("basalt_quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BASALT_QUARTZ_GEODE, List.of(rarityBasaltGeode(), inSquarePlacement(), placementNetherBasaltModifier(), biomeFilter())));
    //public static final RegistryObject<PlacedFeature> BLACKSTONE_QUARTZ_GEODE = PLACED_FEATURES.register("blackstone_quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeatures.BLACKSTONE_QUARTZ_GEODE, List.of(rarityGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> WRAPPIST_GEODE = PLACED_FEATURES.register("wrappist_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.WRAPPIST_GEODE, List.of(rarityEndGeode(), inSquarePlacement(), placementEndModifier(), biomeFilter())));


    public static final RegistryObject<PlacedFeature> GLOWSTONE_GEODE = PLACED_FEATURES.register("glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GLOWSTONE_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> BASALT_GLOWSTONE_GEODE = PLACED_FEATURES.register("basalt_glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BASALT_GLOWSTONE_GEODE, List.of(rarityBasaltGeode(), inSquarePlacement(), placementNetherBasaltModifier(), biomeFilter())));
    //public static final RegistryObject<PlacedFeature> BLACKSTONE_GLOWSTONE_GEODE = PLACED_FEATURES.register("blackstone_glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeatures.BLACKSTONE_GLOWSTONE_GEODE, List.of(rarityGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> GOLD_NUGGET_GEODE = PLACED_FEATURES.register("gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GOLD_NUGGET_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> ECHO_GEODE = PLACED_FEATURES.register("echo_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ECHO_GEODE, List.of(rarityDeepDarkGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter())));
    public static final RegistryObject<PlacedFeature> QUARTZ_CRYSTAL_SPIKE = PLACED_FEATURES.register("quartz_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> QUARTZ_CRYSTAL_SPIKE_FLOOR = PLACED_FEATURES.register("quartz_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE = PLACED_FEATURES.register("glowstone_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = PLACED_FEATURES.register("glowstone_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> ECHO_CRYSTAL_SPIKE = PLACED_FEATURES.register("echo_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ECHO_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> ECHO_CRYSTAL_SPIKE_FLOOR = PLACED_FEATURES.register("echo_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE = PLACED_FEATURES.register("wrappist_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE_FLOOR = PLACED_FEATURES.register("wrappist_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    private static RarityFilter rarityNetherGeode() {
        return RarityFilter.onAverageOnceEvery(16);
    }

    private static CountPlacement placementCrystal() {
        return CountPlacement.of(10);
    }

    private static RarityFilter rarityBasaltGeode() {
        return RarityFilter.onAverageOnceEvery(16);
    }

    private static RarityFilter rarityEndGeode() {
        return RarityFilter.onAverageOnceEvery(32);
    }
    private static RarityFilter rarityDeepDarkGeode() {
        return RarityFilter.onAverageOnceEvery(8);
    }

    private static InSquarePlacement inSquarePlacement() {
        return InSquarePlacement.spread();
    }

    private static PlacementModifier placementNetherModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }
    private static PlacementModifier placementNetherCrystalModifier() {
        return PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT;
    }

    private static PlacementModifier placementNetherBasaltModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }

    private static PlacementModifier placementDeepDarkModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30));
    }

    private static PlacementModifier placementEndModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(32));
    }

    private static BiomeFilter biomeFilter() {
        return BiomeFilter.biome();
    }
    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
