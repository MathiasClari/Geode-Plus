package net.yeoxuhang.geode.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.registry.GeodeModBlocksRegistry;

public class GeodeModBlocksStateProvider extends BlockStateProvider {
    public GeodeModBlocksStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodeMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(GeodeModBlocksRegistry.SMOOTH_END_STONE.get());
        simpleBlock(GeodeModBlocksRegistry.GALCITE.get());
        simpleBlock(GeodeModBlocksRegistry.WRAPPIST_BLOCK.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_WRAPPIST.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_ECHO.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get());
        simpleBlock(GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_GOLD_NUGGET.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_LAPIS.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_REDSTONE.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_EMERALD.get());
        simpleBlock(GeodeModBlocksRegistry.BUDDING_DIAMOND.get());

        directionalBlock(GeodeModBlocksRegistry.ECHO_CRYSTAL.get(), models().cross(GeodeModBlocksRegistry.ECHO_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.ECHO_CRYSTAL.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(), models().cross(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), models().cross(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(), models().cross(GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(), models().cross(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.LAPIS_CLUSTER.get(), models().cross(GeodeModBlocksRegistry.LAPIS_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LAPIS_CLUSTER.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get(), models().cross(GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.EMERALD_CLUSTER.get(), models().cross(GeodeModBlocksRegistry.EMERALD_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.EMERALD_CLUSTER.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get())));

        directionalBlock(GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get(), models().cross(GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get())));
        directionalBlock(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get(), models().cross(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get(), models().cross(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get())));
        directionalBlock(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get(), models().cross(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get().getLootTable().getPath(),
                blockTexture(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get())));

    }
}
