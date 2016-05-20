package threedprojectiles;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class sounds {
        @ForgeSubscribe
        public void onSoundLoad(SoundLoadEvent event) {
                event.manager.addSound("threedprojectiles:crunch.ogg");
                //event.manager.addSound("yourmod:optionalFile/YourSound.ogg");
                //event.manager.addSound("yourmod:optionalFile/optionalFile2/YourSound.ogg");
        }
}
