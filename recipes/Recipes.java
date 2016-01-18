package com.knifesurge.ToolExpansion.recipes;

import com.knifesurge.ToolExpansion.init.ToolExpansionItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

	public static void addRecipes()
	{
		
		/**
		 * Items
		 * 
		 */
		
		//Basic Cap
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.basic_cap, 2), 
				"AAA",
				"A A",
				'A', Blocks.planks);
		//Basic Rod
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.basic_rod),
				"A",
				"B",
				"A",
				'A', ToolExpansionItems.basic_cap, 'B', Items.stick);
		//Hardened Cap
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.hardened_cap, 2),
				"AAA",
				"A A",
				'A', Blocks.stone);
		//Hardened Rod
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.hardened_rod, 2),
				"A",
				"B",
				"A",
				'A', ToolExpansionItems.hardened_cap, 'B', ToolExpansionItems.hardened_stick);
		//Iron Cap
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.iron_cap, 2),
				"AAA",
				"A A",
				'A', Items.iron_ingot);
		//Iron Rod
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.iron_rod),
				"A",
				"B",
				"A",
				'A', ToolExpansionItems.iron_cap, 'B', ToolExpansionItems.iron_stick);
		//Gold Cap
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.gold_cap, 2),
				"AAA",
				"A A",
				'A', Items.gold_ingot);
		//Gold Rod
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.gold_rod),
				"A",
				"B",
				"A",
				'A', ToolExpansionItems.gold_cap, 'B', ToolExpansionItems.gold_stick);
		//Fire Cap
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.fire_cap, 2),
				"AAA",
				"A A",
				'A', Items.blaze_rod);
		//Fire Rod
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.fire_rod),
				"A",
				"B",
				"A",
				'A', ToolExpansionItems.fire_cap, 'B', ToolExpansionItems.cooledBlazeRod);
		/** 
		 * Tools
		 */
		
		/* Swords */
		
		//Obsidian Sword
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.obsidian_sword), 
				" A ",
				" A ",
				" B ",
				'A', Blocks.obsidian, 'B', ToolExpansionItems.cooledBlazeRod);
		//Redstone Sword
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.redstone_sword),
				" A ",
				" A ",
				" B ",
				'A', Blocks.redstone_block, 'B', Items.stick);
		//Quartz Sword
		GameRegistry.addRecipe(new ItemStack(ToolExpansionItems.quartz_sword),
				" A ",
				" A ",
				" B ",
				'A', Blocks.quartz_block, 'B', ToolExpansionItems.hardened_rod);
	}
	
}
