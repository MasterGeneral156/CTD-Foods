package com.themastergeneral.ctdfoods.blocks;

import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

public class GGrapeCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public GGrapeCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.ggrapeseed;
	}
	public Item getCrop() 
	{
		return ModItems.ggrape;
	}
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}
