package com.themastergeneral.ctdfoods.items;

import com.themastergeneral.ctdfoods.blocks.ModBlocks;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static BasicTool knife;
	public static BasicItem container;
	public static BasicItem containerwater;
	public static BasicItem containermilk;
	public static BasicFood cookedbacon;
	public static BasicFood rawbacon;
	public static BasicFood tomato;
	public static BasicFood tomatoslice;
	public static BasicSeed tomatoseed;
	public static BasicFood cookedpatty;
	public static BasicFood rawpatty;
	public static void init() 
	{
		knife = register(new BasicTool("knife"));
		container = register(new BasicItem("container"));
		containerwater = register(new BasicItem("containerwater"));
		containermilk = register(new BasicItem("containermilk"));
		cookedbacon = register(new BasicFood("cookedbacon", 3, 0.267F, true));
		rawbacon = register(new BasicFood("rawbacon", 1, 0.1F, true));
		cookedpatty = register(new BasicFood("cookedpatty", 3, 0.267F, true));
		rawpatty = register(new BasicFood("rawpatty", 1, 0.1F, true));
		tomato = register(new BasicFood("tomato", 2, 2F, false));
		tomatoslice = register(new BasicFood("tomatoslice", 1, 0.25F, false));
		tomatoseed = register(new BasicSeed("tomatoseed", ModBlocks.croptomato, Blocks.FARMLAND));
	}
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}
}
