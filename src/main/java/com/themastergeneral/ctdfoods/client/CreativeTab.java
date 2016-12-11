package com.themastergeneral.ctdfoods.client;

import com.themastergeneral.ctdfoods.CTDFoods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs
{
	public CreativeTab() 
	{
		super(CTDFoods.MODID);
	}
	@Override
	public Item getTabIconItem() 
	{
		return Items.APPLE;
	}
	@Override
	public boolean hasSearchBar() 
	{
		return false;
	}

}
