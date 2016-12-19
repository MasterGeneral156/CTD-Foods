package com.themastergeneral.ctdfoods.handlers;

import com.themastergeneral.ctdfoods.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Crafting 
{
	//Add crafting recipes.
	public static void addRecipes() 
	{
		//Raw Patty
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rawpatty, 2), ModItems.knife, Items.BEEF, Items.BEEF);
		//Knife
		GameRegistry.addRecipe(new ItemStack(ModItems.knife), "IS", "IS", " S", 'I', Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 'S', Items.STICK);
		//Container
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.container), "GWG", "G G", "GGG", 'W', "plankWood", 'G', "paneGlass"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.container), ModItems.containermilk);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.container), ModItems.containerwater);
		//Container of Milk
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.containermilk), "GWG", "GBG", "GGG", 'W', "plankWood", 'G', "paneGlass", 'B', Items.MILK_BUCKET));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.containermilk), ModItems.container, Items.MILK_BUCKET);
		//Container of Water
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.containerwater), "GWG", "GBG", "GGG", 'W', "plankWood", 'G', "paneGlass", 'B', Items.WATER_BUCKET));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.containerwater), ModItems.container, Items.WATER_BUCKET);
		//Raw Bacon
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rawbacon, 3), ModItems.knife, Items.PORKCHOP);
		//Tomato Slices
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatoslice, 6), ModItems.knife, ModItems.tomato);
		//Burger Patty
		GameRegistry.addRecipe(new ItemStack(ModItems.burgerpatty), "B", "M", "B", 'B', Items.BREAD, 'M', ModItems.cookedpatty);
		//Tomato Burger Patty
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.burgerpattytomato), ModItems.tomatoslice, ModItems.burgerpatty);
		//Growable Meat Seed
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.meatseed), "FBF", "BSB", "FBF", 'S', "seed", 'F', Items.ROTTEN_FLESH, 'B', Items.BONE));
	}
	//Add furnace recipes.
	public static void addSmelting()
	{
		//Cooked Bacon
		GameRegistry.addSmelting(ModItems.rawbacon, new ItemStack(ModItems.cookedbacon), 0.117F);
		//Cooked Patty
		GameRegistry.addSmelting(ModItems.rawpatty, new ItemStack(ModItems.cookedpatty), 0.175F);
	}
	//Register items to the ore dictionary.
	public static void OreDict()
	{
		//First is Ore Dictionary name, second is item itself.
		OreDictionary.registerOre("seed", ModItems.tomatoseed);
		OreDictionary.registerOre("seed", Items.WHEAT_SEEDS);
		OreDictionary.registerOre("seed", Items.BEETROOT_SEEDS);
		OreDictionary.registerOre("seed", ModItems.meatseed);
		OreDictionary.registerOre("crop", Items.BEETROOT);
		OreDictionary.registerOre("crop", Items.CARROT);
		OreDictionary.registerOre("crop", Items.POTATO);
		OreDictionary.registerOre("crop", Items.WHEAT);
		OreDictionary.registerOre("crop", Items.POISONOUS_POTATO);
		OreDictionary.registerOre("crop", ModItems.tomato);
		OreDictionary.registerOre("crop", ModItems.growablemeat);
	}
}
