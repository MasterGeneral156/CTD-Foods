package com.themastergeneral.ctdfoods.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdfoods.CTDFoods;
import com.themastergeneral.ctdfoods.blocks.ModBlocks;

public final class BlockRenderRegister 
{
	public static void registerBlockRenderer() 
	{
	    reg(ModBlocks.blocksalt);
	    reg(ModBlocks.croptomato);
	    reg(ModBlocks.cropggrape);
	    reg(ModBlocks.croprgrape);
	}

	public static void reg(Block block) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(CTDFoods.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
