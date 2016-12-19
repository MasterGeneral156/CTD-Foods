package com.themastergeneral.ctdfoods.proxy;

import java.util.logging.Logger;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdfoods.blocks.ModBlocks;
import com.themastergeneral.ctdfoods.handlers.Crafting;
import com.themastergeneral.ctdfoods.handlers.SeedDrop;
import com.themastergeneral.ctdfoods.items.ModItems;

public class CommonProxy 
{
	public static Logger logger;
    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModBlocks.init();	//Add blocks to game.
    	ModItems.init();	//Add items to game.
    	SeedDrop.init();	//Add seed drops to grass.
    }
    public void init(FMLInitializationEvent e) 
    {
    	Crafting.OreDict();			//Add items to ore dictionary.
    	Crafting.addRecipes();		//Add crafting recipes.
    	Crafting.addSmelting();		//Add smelting recipes.
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
    public void registerItemRenderer(Item item, int meta, String id) 
    {
    	 
    }
}
