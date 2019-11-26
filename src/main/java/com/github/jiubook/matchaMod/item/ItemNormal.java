package com.github.jiubook.matchaMod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import com.github.jiubook.matchaMod.matchaMod;

public class ItemNormal extends Item {
	public ItemNormal(String name, int maxStack,CreativeTabs creativeTab) {
		super();
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(matchaMod.MODID, name));
		this.setMaxStackSize(maxStack);
		this.setCreativeTab(creativeTab);
	}

}
