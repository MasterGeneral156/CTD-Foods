package com.themastergeneral.ctdfoods.items;

import net.minecraft.item.ItemStack;

public class BasicTool extends BasicItem
{
	public BasicTool(String name) 
	{
		super(name);
		this.maxStackSize = 1;
	}
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	{
		return false;
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
