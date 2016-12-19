package com.themastergeneral.ctdfoods.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdfoods.client.BlockRenderRegister;

//Client side proxy

public class ClientProxy extends CommonProxy 
{
    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) 
    {
        super.init(e);
        BlockRenderRegister.registerBlockRenderer();	//Register block renderer
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) 
    {
        super.postInit(e);
    }
	//Item Render Register
    public void registerItemRenderer(Item item, int meta, String id)
    {
		//Sets resource location for items.
    	 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("ctdfoods:" + id, "inventory"));
    }
}
