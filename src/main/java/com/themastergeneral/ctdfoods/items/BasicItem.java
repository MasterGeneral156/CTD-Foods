package com.themastergeneral.ctdfoods.items;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;

import net.minecraft.item.Item;

/*
	Basic Item Class
	Used for the item base in this mod.
	Basic items are created with this.
	All other special items extend this class.
*/

public class BasicItem extends Item implements ItemModelProvider
{
	protected String name;
	public BasicItem(String string) 
	{
		this.name = string;
		this.setUnlocalizedName(string);
		this.setRegistryName(string);
		this.setCreativeTab(CTDFoods.creativeTab);
	}
	//Register item model
	public void registerItemModel(Item item) 
	{
		CTDFoods.proxy.registerItemRenderer(this, 0, name);
	}
}
