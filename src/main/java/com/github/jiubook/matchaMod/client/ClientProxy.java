package com.github.jiubook.matchaMod.client;

import com.github.jiubook.matchaMod.common.CommonProxy;
import com.github.jiubook.matchaMod.item.ItemLoader;
import com.github.jiubook.matchaMod.matchaMod;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
//		ItemLoader.clintInit();
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ItemLoader.initModels();
	}
	
	public void init(FMLPreInitializationEvent event) {
		super.init(event);
	}
}
