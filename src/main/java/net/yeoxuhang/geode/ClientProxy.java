package net.yeoxuhang.geode;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yeoxuhang.geode.client.block.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode.common.registry.GeodeModBlockEntitiesRegistry;
import net.yeoxuhang.geode.common.registry.GeodeModBlocksRegistry;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = GeodeMod.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {

    public void init() {
    }

    public void clientInit() {
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LAPIS_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.EMERALD_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get(), RenderType.cutout());
        //Quartz Crystal
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), RenderType.cutout());
        //Glowstone Cluster
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.ECHO_CRYSTAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get(), RenderType.cutout());
        BlockEntityRenderers.register(GeodeModBlockEntitiesRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
    }

    public Player getClientSidePlayer() {
        return Minecraft.getInstance().player;
    }

    public void setupParticles() {
        GeodeMod.LOGGER.debug("Registered particle factories");
    }


}
