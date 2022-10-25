package net.yeoxuhang.geode.common.registry;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.datagen.*;

@Mod.EventBusSubscriber(modid = GeodeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeodeModDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new GeodeModRecipeProvider(generator));
        generator.addProvider(true, new GeodeModLootTableProvider(generator));
        generator.addProvider(true ,new GeodeModItemModelProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodeModBlocksStateProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodeModBlockTagsProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodeModBiomeTagsProvider(generator, existingFileHelper));

    }
}
