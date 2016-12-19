package com.themastergeneral.ctdfoods.blocks;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

/*
	Tomato Crop Class
	Creates a BasicCrop with specified data.
*/

public class TomatoCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public TomatoCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.tomatoseed;		//When crop is broken, what seed returns
	}
	public Item getCrop() 
	{
		return ModItems.tomato;			//When crop is fully grown and broken, what crop returns
	}
	//Register crop's item model.
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}
