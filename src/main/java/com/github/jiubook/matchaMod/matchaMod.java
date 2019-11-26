package com.github.jiubook.matchaMod;

import org.apache.logging.log4j.Logger;

import com.github.jiubook.matchaMod.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = matchaMod.MODID, 
		name = matchaMod.NAME, 
		version = matchaMod.VERSION, 
		acceptedMinecraftVersions = "[1.12.2,1.13)", 
		dependencies = "required-after:forge@[14.23.5.2768,);"
	)

public class matchaMod {
	public static final String MODID = "matchamod";
	public static final String NAME = "Matcha Mod";
	public static final String VERSION = "1.0";
	
	@SidedProxy(clientSide = "com.github.jiubook.matchaMod.client.ClientProxy",
			serverSide = "com.github.jiubook.matchaMod.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(matchaMod.MODID)
	public static matchaMod instance;
	
	private static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLPreInitializationEvent event) {
		proxy.init(event);
	}
	
	public Logger getLogger() {
		return logger;
	}
	
}
