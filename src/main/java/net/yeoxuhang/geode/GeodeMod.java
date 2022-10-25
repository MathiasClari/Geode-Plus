package net.yeoxuhang.geode;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yeoxuhang.geode.client.block.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode.common.config.GeodeModClientConfigs;
import net.yeoxuhang.geode.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geode.common.registry.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GeodeMod.MOD_ID)
public class GeodeMod {
    public static final String MOD_ID = "geode";
    public static final Logger LOGGER = LogManager.getLogger();

    public static CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public GeodeMod() {
        PROXY.init();
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        GeodeModItemsRegistry.register(eventBus);
        GeodeModBlocksRegistry.register(eventBus);
        GeodeModBlockEntitiesRegistry.register(eventBus);

        GeodeModLootModifiersRegistry.register(eventBus);

        GeodeModFeaturesRegistry.register(eventBus);
        GeodeModPlacedFeaturesRegistry.register(eventBus);
        GeodeModBiomeModifiersRegistry.register(eventBus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, GeodeModClientConfigs.SPEC, "geode+_client_config.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GeodeModCommonConfigs.SPEC, "geode+_common_config.toml");
        eventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        PROXY.clientInit();
    }
}
