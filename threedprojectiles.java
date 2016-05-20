package threedprojectiles;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
//imports

public class threedprojectiles{
@Mod(MODID = "threedprojectiles", MODNAME = "3D Projectiles", MODVER = "1.0")

public static Item item1;
public static ModelBase model1;
public static Item item2;
public static Entity entity1

@Instance("threedprojectiles")
public static threedprojectiles instance = new threedprojectiles();

@SidedProxy(clientSide = "threedprojectiles.ClientProxy", serverSide = "threedprojectiles.ServerProxy")
public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent event){
   this.proxy.preInit(e);
  item1 = new item1();
  item2 = new item2();
  entity1 = new entity1(null);
  model1 = new model1();
  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item1, 1, new ModelResourceLocation(MODID + ":" + item1.getUnlocalizedName().substring(5), "inventory"));
  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item2, 2, new ModelResourceLocation(MODID + ":" + item2.getUnlocalizedName().substring(5), "inventory"));
  //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 3, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
}
@EventHandler
public void init(FMLInitializationEvent event){
   this.proxy.init(e);
}
@EventHandler
public void postInit(FMLPostInitializationEvent event){
   this.proxy.postInit(e);
  }
}
