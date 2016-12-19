package com.themastergeneral.ctdfoods.items;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

/*
	Basic Food Class
	Most food items will use this class.
*/

public class BasicFood extends ItemFood implements ItemModelProvider 
{
	protected String name;
	public BasicFood(String string, int amount, float saturation, boolean isWolfFood) 
	{

		super(amount, saturation, isWolfFood); 	//Super ItemFood. Needs hunger restored, saturation given, 
												//and if item can be fed to wolves.
		this.name = string;
		this.setUnlocalizedName(string);
		this.setRegistryName(string);
		this.setCreativeTab(CTDFoods.creativeTab);
	}
	//Registers item model.
	public void registerItemModel(Item item) 
	{
		CTDFoods.proxy.registerItemRenderer(this, 0, name);
	}
}
