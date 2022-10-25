package net.yeoxuhang.geode.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.registry.GeodeModItemsRegistry;

public class GeodeModItemModelProvider extends ItemModelProvider {
    public GeodeModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GeodeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GeodeModItemsRegistry.WRAPPIST_SHARD);
        simpleToolItem(GeodeModItemsRegistry.WRAPPIST_GOAT_HORN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GeodeMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleToolItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/goat_horn")).texture("layer0",
                new ResourceLocation(GeodeMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
