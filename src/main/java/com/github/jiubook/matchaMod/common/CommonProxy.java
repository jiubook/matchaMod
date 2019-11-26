package com.github.jiubook.matchaMod.common;

import com.github.jiubook.matchaMod.common.CreativeTabsRegister;
import com.github.jiubook.matchaMod.item.ItemLoader;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		new CreativeTabsRegister();
		new ItemLoader();
	}
	
	public void init(FMLPreInitializationEvent event) {
		
	}
}
