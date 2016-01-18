package com.knifesurge.ToolExpansion;

import com.knifesurge.ToolExpansion.eventhandlers.EntityJoinWorldEventHandler;
import com.knifesurge.ToolExpansion.eventhandlers.FillBucketEventHandler;
import com.knifesurge.ToolExpansion.eventhandlers.ItemTossEventHandler;
import com.knifesurge.ToolExpansion.init.ToolExpansionBlocks;
import com.knifesurge.ToolExpansion.init.ToolExpansionItems;
import com.knifesurge.ToolExpansion.proxy.CommonProxy;
import com.knifesurge.ToolExpansion.recipes.Recipes;
import com.knifesurge.ToolExpansion.recipes.SmeltingRecipes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class ToolExpansion
{   
    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static final tabToolExpansion tabToolExpansion = new tabToolExpansion("tabToolExpansion");
    
    @Instance(Reference.MODID)
	public static ToolExpansion instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ToolExpansionBlocks.init();
    	ToolExpansionBlocks.register();
    	ToolExpansionItems.init();
    	ToolExpansionItems.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.registerRenders();
		Recipes.addRecipes();
		SmeltingRecipes.addRecipes();
		registerEventListeners();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
    
    public void registerEventListeners(){
    	//DEBUG
    	System.out.println("Registering Events");
    	//Register Events
    	MinecraftForge.EVENT_BUS.register(new EntityJoinWorldEventHandler());
    	MinecraftForge.EVENT_BUS.register(new FillBucketEventHandler());
    	//MinecraftForge.EVENT_BUS.register(new ItemTossEventHandler());
    }
    
}
