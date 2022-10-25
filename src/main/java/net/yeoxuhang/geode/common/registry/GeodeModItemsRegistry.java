package net.yeoxuhang.geode.common.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.item.WrappistGoatHornItem;

public class GeodeModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GeodeMod.MOD_ID);

    public static final RegistryObject<Item> WRAPPIST_SHARD = ITEMS.register("wrappist_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> WRAPPIST_GOAT_HORN = ITEMS.register("wrappist_goat_horn",
            () -> new WrappistGoatHornItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

        public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
