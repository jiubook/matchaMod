package com.github.jiubook.matchaMod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.github.jiubook.matchaMod.item.ItemLoader;

public class CreativeTabsRegister {
	public static CreativeTabs tabMatcha;

	//public CreativeTabsRegister(FMLPreInitializationEvent event)
	public CreativeTabsRegister() {
		tabMatcha = new CreativeTabs("tabMatcha") {
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLoader.Matcha_Seed);
			}
		};
	}
}
