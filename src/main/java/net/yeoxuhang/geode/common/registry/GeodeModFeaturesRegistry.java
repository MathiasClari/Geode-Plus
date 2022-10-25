package net.yeoxuhang.geode.common.registry;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.world.feature.CrystalSpikeFeature;
import net.yeoxuhang.geode.common.world.feature.EchoCrystalSpikeFeature;
import net.yeoxuhang.geode.common.world.feature.WrappistCrystalSpikeFeature;
import net.yeoxuhang.geode.common.world.feature.config.GeodeCrystalSpikeConfig;

public class GeodeModFeaturesRegistry {
    public static final DeferredRegister<Feature<?>> FEATURE =
            DeferredRegister.create(ForgeRegistries.Keys.FEATURES, GeodeMod.MOD_ID);

    public static final RegistryObject<CrystalSpikeFeature> CRYSTAL_SPIKE = FEATURE.register("crystal_spike",
            () -> new CrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final RegistryObject<EchoCrystalSpikeFeature> ECHO_CRYSTAL_SPIKE = FEATURE.register("echo_crystal_spike",
            () -> new EchoCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final RegistryObject<WrappistCrystalSpikeFeature> WRAPPIST_CRYSTAL_SPIKE = FEATURE.register("wrappist_crystal_spike",
            () -> new WrappistCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURE.register(eventBus);
    }
}
