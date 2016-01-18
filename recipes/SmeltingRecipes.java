package com.knifesurge.ToolExpansion.recipes;

import com.knifesurge.ToolExpansion.init.ToolExpansionBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {

	public static void addRecipes()
	{
		//Blocks
		GameRegistry.addSmelting(Blocks.nether_brick, new ItemStack(ToolExpansionBlocks.nether_stone), 0.2F);
		
		//Items
		GameRegistry.addSmelting(Blocks.anvil, new ItemStack(ToolExpansionBlocks.ToolExpAnvil), 1.0F);
	}
}
