package net.yeoxuhang.geode.client.block.model.layer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.client.block.render.WrappistPedestalBlockEntityRenderer;

@Mod.EventBusSubscriber(modid = GeodeMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeodeModModelLayers {
    public static final ModelLayerLocation WRAPPIST_PEDESTAL = register("wrappist_pedestal", "main");

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WRAPPIST_PEDESTAL, WrappistPedestalBlockEntityRenderer::createBodyLayer);
    }

    private static ModelLayerLocation register(String model, String layer) {
        return new ModelLayerLocation(new ResourceLocation(GeodeMod.MOD_ID, model), layer);
    }
}
