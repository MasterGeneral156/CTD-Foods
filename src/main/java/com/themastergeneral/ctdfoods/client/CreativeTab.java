package com.themastergeneral.ctdfoods.client;

import com.themastergeneral.ctdfoods.CTDFoods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs
{
	public CreativeTab() 
	{
		super(CTDFoods.MODID);		//Unlocalized tab name, maybe?
	}
	@Override
	public Item getTabIconItem() 
	{
		return Items.APPLE;			//Tab icon. Change to whatever.
	}
	@Override
	public boolean hasSearchBar() 
	{
		return false;				//Set to true to allow tab to have a search bar.
	}

}
