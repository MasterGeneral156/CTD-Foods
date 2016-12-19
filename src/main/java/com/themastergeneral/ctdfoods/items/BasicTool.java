package com.themastergeneral.ctdfoods.items;

import net.minecraft.item.ItemStack;

/*
	Basic Tool Class
	Used to create an item that can used in crafting.
*/

public class BasicTool extends BasicItem
{
	public BasicTool(String name) 
	{
		super(name);
		this.maxStackSize = 1;	//Can only have one item per stack.
	}
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	{
		return false;			//Set to true to lose item on crafted
	}
	@Override
	public boolean getShareTag()
	{
		return true;
	}
	public boolean hasContainerItem(ItemStack itemStack)
	{
		return true;
	}
}
