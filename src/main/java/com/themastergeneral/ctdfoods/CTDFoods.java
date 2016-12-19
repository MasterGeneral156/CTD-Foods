package com.themastergeneral.ctdfoods;

import java.util.logging.Logger;

import com.themastergeneral.ctdfoods.client.CreativeTab;
import com.themastergeneral.ctdfoods.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CTDFoods.MODID, name = CTDFoods.MODNAME, version = CTDFoods.VERSION)	//Make mod a true mod!
public class CTDFoods 
{

    public static final String MODID = "ctdfoods";			//Mod ID
    public static final String MODNAME = "CTD Foods";		//Mod Name
    public static final String VERSION = "1.0.0 - Alpha 2";	//Mod Version
    
    //Creative Tab
    public static final CreativeTabs creativeTab = new CreativeTab();
        
    @Instance
    public static CTDFoods instance = new CTDFoods();
    public static Logger logger;	//FML logging soonish.
    
    @SidedProxy(clientSide="com.themastergeneral.ctdfoods.proxy.ClientProxy", serverSide="com.themastergeneral.ctdfoods.proxy.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	this.proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	this.proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	this.proxy.postInit(e);
    }
}
