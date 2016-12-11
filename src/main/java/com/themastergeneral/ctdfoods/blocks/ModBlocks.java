package com.themastergeneral.ctdfoods.blocks;

import com.themastergeneral.ctdfoods.client.ItemModelProvider;
import com.themastergeneral.ctdfoods.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static BasicBlock blocksalt;
	public static BasicCrop croptomato;
	public static void init()
	{
		blocksalt = register(new BasicBlock(Material.GROUND, "blocksalt"));
		croptomato = register(new TomatoCrop("croptomato"));
	}
	private static <T extends Block> T register (T block, ItemBlock itemBlock) 
	{
	   	 GameRegistry.register(block);
	   	 if(itemBlock != null) 
	   	 {
	   		 GameRegistry.register(itemBlock);
	   	 }
	   	 if(block instanceof ItemModelProvider) 
	   	 {
	   		 ((ItemModelProvider)block).registerItemModel(itemBlock);
	   	 }
	   	 return block;
   	 }
   	 
   	 private static <T extends Block> T register(T block) 
   	 {
	   	 ItemBlock itemBlock = new ItemBlock(block);
	   	 itemBlock.setRegistryName(block.getRegistryName());
	   	 return register(block, itemBlock);
   	 }
}
