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

public class BasicSeed extends ItemSeeds implements ItemModelProvider
{
	protected String name;
	protected Block crop;
	protected Block farmland;
	public BasicSeed(String string, Block crops, Block soil) 
	{
		super(crops, soil);
		this.name = string;
		this.crop = crops;
		this.farmland = soil;
		this.setUnlocalizedName(string);
		this.setRegistryName(string);
		this.setCreativeTab(CTDFoods.creativeTab);
	}
	public void registerItemModel(Item item) 
	{
		CTDFoods.proxy.registerItemRenderer(this, 0, name);
	}
}
