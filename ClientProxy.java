package com.bedrockminer.tutorial;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    super(e);
    }

    public void init(FMLInitializationEvent e) {
    super(e);
    }

    public void postInit(FMLPostInitializationEvent e) {
    super(e);
    }
}
