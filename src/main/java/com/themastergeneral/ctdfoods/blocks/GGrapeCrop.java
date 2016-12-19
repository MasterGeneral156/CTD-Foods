package com.themastergeneral.ctdfoods.blocks;

import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

/*
	Green Grape Crop Class
	Creates a BasicCrop with specified data.
*/

public class GGrapeCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public GGrapeCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.ggrapeseed;		//When crop is broken, what seed returns
	}
	public Item getCrop() 
	{
		return ModItems.ggrape;			//When crop is fully grown and broken, what crop returns
	}
	//Register crop's item model.
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}
