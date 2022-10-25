package net.yeoxuhang.geode.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.registry.GeodeModBlocksRegistry;
import net.yeoxuhang.geode.common.registry.GeodeModTagsRegistry;

public class GeodeModBlockTagsProvider extends BlockTagsProvider {
    public GeodeModBlockTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodeMod.MOD_ID, exFileHelper);
    }

    protected void addTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodeModBlocksRegistry.GALCITE.get(),
                GeodeModBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodeModBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_ECHO.get(),
                GeodeModBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodeModBlocksRegistry.GALCITE.get(),
                GeodeModBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodeModBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_ECHO.get(),
                GeodeModBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodeModBlocksRegistry.BUDDING_GOLD_NUGGET.get()
        );
        this.tag(GeodeModTagsRegistry.Blocks.CAN_LARGE_ECHO_CRYSTAL_PLACE).add(Blocks.SCULK,
                Blocks.STONE,
                Blocks.DEEPSLATE);

        this.tag(GeodeModTagsRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE).add(Blocks.END_STONE);
    }
}
