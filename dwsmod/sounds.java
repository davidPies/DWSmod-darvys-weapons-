package dwsmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class soundevents {
	public static SoundEvent swish;
	
	public static void registerSounds() {
		swish = registerSound("swish");
	}
	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(dwsmod.modid, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}
