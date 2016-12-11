package com.themastergeneral.ctdfoods.items;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;

import net.minecraft.item.Item;

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
	public void registerItemModel(Item item) 
	{
		CTDFoods.proxy.registerItemRenderer(this, 0, name);
	}
}
