package com.themastergeneral.ctdfoods.blocks;

import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

/*
	Meat Crop Class
	Creates a BasicCrop with specified data.
*/

public class MeatCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public MeatCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.meatseed;		//When crop is broken, what seed returns
	}
	public Item getCrop() 
	{
		return ModItems.growablemeat;	//When crop is fully grown and broken, what crop returns
	}
	//Register crop's item model.
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}

