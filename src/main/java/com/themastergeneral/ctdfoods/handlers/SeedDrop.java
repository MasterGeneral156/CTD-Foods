package com.themastergeneral.ctdfoods.handlers;

import com.themastergeneral.ctdfoods.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class SeedDrop 
{
	public static void init()
	{
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.tomatoseed), 10);
	}
}
