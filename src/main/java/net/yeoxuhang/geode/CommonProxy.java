package net.yeoxuhang.geode;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = GeodeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void init() {
    }

    public void clientInit() {
    }
    public Player getClientSidePlayer() {
        return null;
    }


    public void setupParticles() {
    }
}
