package dwsmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    super.preInit(e);
    
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dwsmod.item1, 0, new ModelResourceLocation(dwsmod.modid + ":" + dwsmod.item1.getUnlocalizedName().substring(5), "inventory"));
    }

    public void init(FMLInitializationEvent e) {
    super.init(e);
    }

    public void postInit(FMLPostInitializationEvent e) {
    super.postInit(e);
    }
}
