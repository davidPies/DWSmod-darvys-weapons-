package wheatycraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = "wheatycraft", name = "Wheat Thin craft", version = "1.0")
public class wheatycraft{
	public static final String modid = "wheatycraft";
    public static final String MODNAME = "Wheat Thin craft";
    public static final String MODVER = "1.0";
	
public static Item item1;
public static ModelBase model1;
public static Item item2;
public static Item item3;
public static Entity entity1;
public static render1 render1;

@Instance("wheatycraft")
public static wheatycraft instance = new wheatycraft();

@SidedProxy(clientSide = "dwsmod.ClientProxy", serverSide = "dwsmod.ServerProxy")
public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent event){
   this.proxy.preInit(event);
  item1 = new item1();
  //item2 = new item2();
  //item3 = new item3();
  //render1 = new render1();
  //entity1 = new entity1(null, null);
  sounds = new sounds(null);
  //model1 = new model1();
}
@EventHandler
public void init(FMLInitializationEvent event){
   this.proxy.init(event);
}
@EventHandler
public void postInit(FMLPostInitializationEvent event){
   this.proxy.postInit(event);
  }
}
