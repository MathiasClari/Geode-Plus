package net.yeoxuhang.geode.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.yeoxuhang.geode.common.registry.GeodeModBlocksRegistry;

public class BuddingEchoBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingEchoBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = GeodeModBlocksRegistry.SMALL_ECHO_BUD.get();
                Warden.applyDarknessAround(p_220899_, Vec3.atCenterOf(p_220900_), (Entity)null, 20);
            } else if (blockstate.is(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get()) && blockstate.getValue(EchoCrystalBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get();
                Warden.applyDarknessAround(p_220899_, Vec3.atCenterOf(p_220900_), (Entity)null, 20);
            } else if (blockstate.is(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get()) && blockstate.getValue(EchoCrystalBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.LARGE_ECHO_BUD.get();
                Warden.applyDarknessAround(p_220899_, Vec3.atCenterOf(p_220900_), (Entity)null, 20);
            } else if (blockstate.is(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get()) && blockstate.getValue(EchoCrystalBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.ECHO_CRYSTAL.get();
                Warden.applyDarknessAround(p_220899_, Vec3.atCenterOf(p_220900_), (Entity)null, 20);
            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(EchoCrystalBlock.FACING, direction).setValue(EchoCrystalBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }
        }
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return silkTouchLevel == 0 ? 5 : 0;
    }
}