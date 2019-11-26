package com.github.jiubook.matchaMod.item;

import com.github.jiubook.matchaMod.matchaMod;
import com.github.jiubook.matchaMod.item.ItemNormal;
import com.github.jiubook.matchaMod.common.*;

import net.minecraft.item.*;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = matchaMod.MODID)
public final class ItemLoader {

	//Item_Seed
	public static Item Matcha_Seed = new ItemNormal("Matcha_Seed", 64, CreativeTabsRegister.tabMatcha);
	public static Item Kraurotic_Matcha_Seed = new ItemNormal("Kraurotic_Matcha_Seed", 64, CreativeTabsRegister.tabMatcha);
	public static Item Innocent_Matcha_Seed = new ItemNormal("Innocent_Matcha_Seed", 64, CreativeTabsRegister.tabMatcha);
	public static Item Matcha_Cup = new ItemNormal("Matcha_Cup", 64, CreativeTabsRegister.tabMatcha);
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		registerRender(Matcha_Seed);
		registerRender(Kraurotic_Matcha_Seed);
		registerRender(Innocent_Matcha_Seed);
		registerRender(Matcha_Cup);
	}
	
	//public ItemLoader(FMLPreInitializationEvent event)
	public ItemLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				Matcha_Seed, Kraurotic_Matcha_Seed, Innocent_Matcha_Seed, Matcha_Cup
				);
	}
	
  	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		if (item.getHasSubtypes()) {
			NonNullList<ItemStack> subItems = NonNullList.create();
			item.getSubItems(item.getCreativeTab(), subItems);
			for (ItemStack subItem : subItems) {
				String subItemName = item.getUnlocalizedName(subItem);
				subItemName = subItemName.substring(subItemName.indexOf(".")+1);
				
				ModelBakery.registerItemVariants(item, new ResourceLocation(matchaMod.MODID, subItemName));
				ModelLoader.setCustomModelResourceLocation(item, subItem.getMetadata(), new ModelResourceLocation(matchaMod.MODID + ":" + subItemName, "inventory"));
			}
		}
		else {
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(matchaMod.MODID + ":" + item.delegate.name().getResourcePath(), "inventory"));
		}
	}
}
