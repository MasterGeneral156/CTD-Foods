package com.themastergeneral.ctdfoods.blocks;

import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

public class RGrapeCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public RGrapeCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.rgrapeseed;
	}
	public Item getCrop() 
	{
		return ModItems.rgrape;
	}
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}
