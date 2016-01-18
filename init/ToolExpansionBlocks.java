package com.knifesurge.ToolExpansion.init;

import com.knifesurge.ToolExpansion.Reference;
import com.knifesurge.ToolExpansion.ToolExpansion;
import com.knifesurge.ToolExpansion.block.NetherStone;
import com.knifesurge.ToolExpansion.block.ToolExpCauldron;
import com.knifesurge.ToolExpansion.block.ToolExpAnvil;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolExpansionBlocks {

	public static Block nether_stone; //*
	public static Block ToolExpCauldron; //*
	public static Block ToolExpAnvil; //*
	
	public static void init()
	{
		nether_stone = new NetherStone(Material.ground).setUnlocalizedName("nether_stone").setCreativeTab(ToolExpansion.tabToolExpansion);
		ToolExpCauldron = new ToolExpCauldron().setUnlocalizedName("tool_exp_cauldron").setCreativeTab(ToolExpansion.tabToolExpansion);
		ToolExpAnvil = new ToolExpAnvil().setUnlocalizedName("tool_exp_anivl").setCreativeTab(ToolExpansion.tabToolExpansion);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(nether_stone, "nether_stone");
		GameRegistry.registerBlock(ToolExpCauldron, "tool_exp_cauldron");
		GameRegistry.registerBlock(ToolExpAnvil, "tool_exp_anvil");
	}
	
	public static void registerRenders()
	{
		registerRender(nether_stone);
		registerRender(ToolExpCauldron);
		registerRender(ToolExpAnvil);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
	
}
