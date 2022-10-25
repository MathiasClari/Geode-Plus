package net.yeoxuhang.geode.common.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.block.*;

import java.util.function.Supplier;

public class GeodeModBlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GeodeMod.MOD_ID);

    public static final RegistryObject<Block> BUDDING_LAPIS = registerBlock("budding_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LAPIS_CLUSTER = registerBlock("lapis_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_LAPIS_BUD = registerBlock("large_lapis_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_LAPIS_BUD = registerBlock("medium_lapis_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_LAPIS_BUD = registerBlock("small_lapis_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_REDSTONE = registerBlock("budding_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> REDSTONE_CRYSTAL = registerBlock("redstone_crystal",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_REDSTONE_BUD = registerBlock("large_redstone_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_REDSTONE_BUD = registerBlock("medium_redstone_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_REDSTONE_BUD = registerBlock("small_redstone_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_EMERALD = registerBlock("budding_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> EMERALD_CLUSTER = registerBlock("emerald_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_EMERALD_BUD = registerBlock("large_emerald_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_EMERALD_BUD = registerBlock("medium_emerald_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_EMERALD_BUD = registerBlock("small_emerald_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_DIAMOND = registerBlock("budding_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DIAMOND_CRYSTAL = registerBlock("diamond_crystal",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_DIAMOND_BUD = registerBlock("large_diamond_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_DIAMOND_BUD = registerBlock("medium_diamond_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_DIAMOND_BUD = registerBlock("small_diamond_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_NETHER_QUARTZ = registerBlock("budding_nether_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_BASALT_QUARTZ = registerBlock("budding_basalt_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.BASALT).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_BLACKSTONE_QUARTZ = registerBlock("budding_blackstone_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> QUARTZ_CRYSTAL_BLOCK = registerBlock("quartz_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> QUARTZ_CRYSTAL = registerBlock("quartz_crystal",
            () -> new QuartzCrystalBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.NETHER_ORE).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud",
            () -> new QuartzCrystalBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud",
            () -> new QuartzCrystalBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud",
            () -> new QuartzCrystalBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.NETHER_ORE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_GOLD_NUGGET = registerBlock("budding_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> GOLD_NUGGET_CLUSTER = registerBlock("gold_nugget_cluster",
            () -> new NetherGoldClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.NETHER_GOLD_ORE).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_GOLD_NUGGET_BUD = registerBlock("large_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_GOLD_NUGGET_BUD = registerBlock("medium_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_GOLD_NUGGET_BUD = registerBlock("small_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.NETHER_GOLD_ORE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_GLOWSTONE = registerBlock("budding_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_BASALT_GLOWSTONE = registerBlock("budding_basalt_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_BLACKSTONE_GLOWSTONE = registerBlock("budding_blackstone_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> GLOWSTONE_CLUSTER = registerBlock("glowstone_cluster",
            () -> new GlowstoneClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.GLASS).strength(1.5F).lightLevel( (p_60929_) ->{
                return 15;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LARGE_GLOWSTONE_BUD = registerBlock("large_glowstone_bud",
            () -> new GlowstoneClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.GLASS).lightLevel((p_60929_) -> {
                return 5;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_GLOWSTONE_BUD = registerBlock("medium_glowstone_bud",
            () -> new GlowstoneClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.GLASS).lightLevel((p_60929_) -> {
                return 3;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_GLOWSTONE_BUD = registerBlock("small_glowstone_bud",
            () -> new GlowstoneClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.GLASS).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> GALCITE = registerBlock("galcite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f, 1200).sound(SoundType.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WRAPPIST_BLOCK = registerBlock("wrappist_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_WRAPPIST = registerBlock("budding_wrappist",
            () -> new BuddingWrappistBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WRAPPIST_CLUSTER = registerBlock("wrappist_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(3F).lightLevel((p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LARGE_WRAPPIST_BUD = registerBlock("large_wrappist_bud",
            () -> new WrappistClusterBlock(5, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 6;
    })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_WRAPPIST_BUD = registerBlock("medium_wrappist_bud",
            () -> new WrappistClusterBlock(4, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 3;
    })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_WRAPPIST_BUD = registerBlock("small_wrappist_bud",
            () -> new WrappistClusterBlock(3, 4, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 2;
    })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_ECHO = registerBlock("budding_echo",
            () -> new BuddingEchoBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.SCULK).requiresCorrectToolForDrops().lightLevel( (p_60929_) ->{
                return 0;
            }).emissiveRendering(GeodeModBlocksRegistry::always)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> ECHO_CRYSTAL = registerBlock("echo_crystal",
            () -> new EchoCrystalBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(4F).lightLevel((p_60929_) ->{
                return 3;
            }).emissiveRendering(GeodeModBlocksRegistry::always)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LARGE_ECHO_BUD = registerBlock("large_echo_bud",
            () -> new EchoCrystalBlock(5, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> {
                return 2;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_ECHO_BUD = registerBlock("medium_echo_bud",
            () -> new EchoCrystalBlock(4, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> {
                return 1;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_ECHO_BUD = registerBlock("small_echo_bud",
            () -> new EchoCrystalBlock(3, 4, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> WRAPPIST_PEDESTAL = registerBlock("wrappist_pedestal",
            () -> new WrappistPedestalBlock(BlockBehaviour.Properties.copy(WRAPPIST_BLOCK.get()).noOcclusion().lightLevel((p_60929_) -> {
                return 8;
            })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return GeodeModItemsRegistry.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    private static boolean always(BlockState p_50775_, BlockGetter p_50776_, BlockPos p_50777_) {
        return true;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
