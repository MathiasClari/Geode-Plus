package net.yeoxuhang.geode.common.registry;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode.GeodeMod;
import net.yeoxuhang.geode.common.world.feature.biome_modifiers.GeodeModGeodeBiomeModifier;

public class GeodeModBiomeModifiersRegistry {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, GeodeMod.MOD_ID);
    public static RegistryObject<Codec<GeodeModGeodeBiomeModifier>> GEODE_MODIFIER = BIOME_MODIFIERS.register("geode", () -> {
        return Codec.unit(GeodeModGeodeBiomeModifier::new);
    });

    public static void register(IEventBus eventBus) {
        BIOME_MODIFIERS.register(eventBus);
    }
}
