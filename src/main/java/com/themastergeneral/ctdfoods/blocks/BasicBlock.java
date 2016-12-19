package com.themastergeneral.ctdfoods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.client.ItemModelProvider;

/*
	Basic Block Class
	Used to create a block with no special properties
*/

public class BasicBlock extends Block implements ItemModelProvider 
{
	protected String name;
	public BasicBlock(Material materialIn, String name) 
	{
		super(materialIn);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CTDFoods.creativeTab);
	}
	//Register the block's item model.
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		CTDFoods.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}
