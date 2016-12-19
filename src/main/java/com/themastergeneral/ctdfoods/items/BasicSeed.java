package com.themastergeneral.ctdfoods.items;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

/*
	Basic SeedClass
	Used to create an item that can be planted in soil.
*/

public class BasicSeed extends ItemSeeds implements ItemModelProvider
{
	protected String name;
	protected Block crop;
	protected Block farmland;
	public BasicSeed(String string, Block crops, Block soil) 
	{
		super(crops, soil); //Super ItemSeeds. 
							//crops = crop block that the seed turns into when planted, 
							//soil = block seed can be planted on.
		this.name = string;
		this.crop = crops;
		this.farmland = soil;
		this.setUnlocalizedName(string);
		this.setRegistryName(string);
		this.setCreativeTab(CTDFoods.creativeTab);
	}
	//Register item model.
	public void registerItemModel(Item item) 
	{
		CTDFoods.proxy.registerItemRenderer(this, 0, name);
	}
}
