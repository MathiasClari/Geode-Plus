package net.yeoxuhang.geode.common.registry;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.block.blockentity.WrappistPedestalBlockEntity;

public class GeodeModBlockEntitiesRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GeodeMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<WrappistPedestalBlockEntity>> WRAPPIST_PEDESTAL_ENTITY =
            BLOCK_ENTITIES.register("wrappist_pedestal", () ->
                    BlockEntityType.Builder.of(WrappistPedestalBlockEntity::new,
                            GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
