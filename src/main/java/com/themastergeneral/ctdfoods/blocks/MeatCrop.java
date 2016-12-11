package com.themastergeneral.ctdfoods.blocks;

import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

public class MeatCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public MeatCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.meatseed;
	}
	public Item getCrop() 
	{
		return ModItems.growablemeat;
	}
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}

