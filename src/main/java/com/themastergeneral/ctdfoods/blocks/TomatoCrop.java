package com.themastergeneral.ctdfoods.blocks;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TomatoCrop extends BasicCrop implements ItemModelProvider 
{
	protected String name;
	public TomatoCrop(String name) 
	{
		super(name);
	}
	public Item getSeed() 
	{
		return ModItems.tomatoseed;
	}
	public Item getCrop() 
	{
		return ModItems.tomato;
	}
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}
