package com.knifesurge.ToolExpansion.init;

import com.knifesurge.ToolExpansion.Reference;
import com.knifesurge.ToolExpansion.ToolExpansion;
import com.knifesurge.ToolExpansion.items.Cap;
import com.knifesurge.ToolExpansion.items.CooledFireRod;
import com.knifesurge.ToolExpansion.items.Rod;
import com.knifesurge.ToolExpansion.items.Stick;
import com.knifesurge.ToolExpansion.items.armor.boots.ObsidianBoots;
import com.knifesurge.ToolExpansion.items.armor.chestplates.ObsidianChestplate;
import com.knifesurge.ToolExpansion.items.armor.helmets.ObsidianHelmet;
import com.knifesurge.ToolExpansion.items.armor.leggings.ObsidianLeggings;
import com.knifesurge.ToolExpansion.items.tools.ObsidianSword;
import com.knifesurge.ToolExpansion.items.tools.QuartzSword;
import com.knifesurge.ToolExpansion.items.tools.RedstoneSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolExpansionItems {

	/** //* means texture is needed */
	
	//Tools
	public static Item obsidian_sword;
	public static Item redstone_sword; 
	public static Item quartz_sword; 
	
	//Tool Materials
	public static ToolMaterial material_obsidian = EnumHelper.addToolMaterial("Obsidian Tool Material", 3, 2000, 15.0F, 4.0F, 10);
	public static ToolMaterial material_redstone = EnumHelper.addToolMaterial("Redstone Material", 2, 500, 2.0F, 2.0F, 22);
	public static ToolMaterial material_quartz = EnumHelper.addToolMaterial("Quartz Tool Material", 2, 700, 11.0F, 3.0F, 30);
	
	//Armor Materials
	public static ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial(
			"obsidianArmorMaterial", 
			Reference.MODID + ":" + "obsidianArmorMaterial", 500, new int[] {3,8,6,3}, 30);
	//Armor
	public static Item obsidianHelmet;
	public static Item obsidianChestplate;
	public static Item obsidianLeggings;
	public static Item obsidianBoots;
	//Items
	public static Item basic_cap; //*
	public static Item basic_rod; //*
	public static Item hardened_cap; //*
	public static Item hardened_stick; //*
	public static Item hardened_rod;
	public static Item iron_cap; //*
	public static Item iron_stick; //*
	public static Item iron_rod; //*
	public static Item gold_cap; //*
	public static Item gold_stick; 
	public static Item gold_rod; //*
	public static Item fire_cap; //*
	public static Item cooledBlazeRod; //*
	public static Item fire_rod; //*
	
	//Blocks
	
	public static void init()
	{
		//Tools
		obsidian_sword = new ObsidianSword(material_obsidian).setUnlocalizedName("obsidian_sword").setCreativeTab(ToolExpansion.tabToolExpansion);
		redstone_sword = new RedstoneSword(material_redstone).setUnlocalizedName("redstone_sword").setCreativeTab(ToolExpansion.tabToolExpansion);
		quartz_sword = new QuartzSword(material_quartz).setUnlocalizedName("quartz_sword").setCreativeTab(ToolExpansion.tabToolExpansion);
		//Items
		cooledBlazeRod = new CooledFireRod().setUnlocalizedName("cooled_blaze_rod").setCreativeTab(ToolExpansion.tabToolExpansion);
		basic_cap = new Cap().setUnlocalizedName("basic_cap").setCreativeTab(ToolExpansion.tabToolExpansion);
		basic_rod = new Rod().setUnlocalizedName("basic_rod").setCreativeTab(ToolExpansion.tabToolExpansion);
		hardened_cap = new Cap().setUnlocalizedName("hardened_cap").setCreativeTab(ToolExpansion.tabToolExpansion);
		hardened_stick = new Stick().setUnlocalizedName("hardened_stick").setCreativeTab(ToolExpansion.tabToolExpansion);
		hardened_rod = new Rod().setUnlocalizedName("hardened_rod").setCreativeTab(ToolExpansion.tabToolExpansion);
		iron_cap = new Cap().setUnlocalizedName("iron_cap").setCreativeTab(ToolExpansion.tabToolExpansion);
		iron_stick = new Stick().setUnlocalizedName("iron_stick").setCreativeTab(ToolExpansion.tabToolExpansion);
		iron_rod = new Rod().setUnlocalizedName("iron_rod").setCreativeTab(ToolExpansion.tabToolExpansion);
		gold_cap = new Cap().setUnlocalizedName("gold_cap").setCreativeTab(ToolExpansion.tabToolExpansion);
		gold_stick = new Stick().setUnlocalizedName("gold_stick").setCreativeTab(ToolExpansion.tabToolExpansion);
		gold_rod = new Rod().setUnlocalizedName("gold_rod").setCreativeTab(ToolExpansion.tabToolExpansion);
		fire_cap = new Cap().setUnlocalizedName("fire_cap").setCreativeTab(ToolExpansion.tabToolExpansion);
		fire_rod = new Cap().setUnlocalizedName("fire_rod").setCreativeTab(ToolExpansion.tabToolExpansion);
		//Blocks
		//Armor
		obsidianHelmet = new ObsidianHelmet(obsidianArmorMaterial, 1, 0).setUnlocalizedName("obsidianHelmet");
		obsidianChestplate = new ObsidianChestplate(obsidianArmorMaterial, 1, 1).setUnlocalizedName("obsidianChestplate");
		obsidianLeggings = new ObsidianLeggings(obsidianArmorMaterial, 2, 2).setUnlocalizedName("obsidianLeggings");
		obsidianBoots = new ObsidianBoots(obsidianArmorMaterial, 1, 3).setUnlocalizedName("obsidianBoots");
		
		
	}
	
	public static void register()
	{
		//Tools
		GameRegistry.registerItem(obsidian_sword, obsidian_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_sword, redstone_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_sword, quartz_sword.getUnlocalizedName().substring(5));
		//Items
		GameRegistry.registerItem(cooledBlazeRod, cooledBlazeRod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(basic_cap, basic_cap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(basic_rod, basic_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hardened_cap, hardened_cap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hardened_stick, hardened_stick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hardened_rod, hardened_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(iron_cap, iron_cap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(iron_stick, iron_stick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(iron_rod, iron_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gold_cap, gold_cap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gold_stick, gold_stick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gold_rod, gold_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fire_cap, fire_cap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fire_rod, fire_rod.getUnlocalizedName().substring(5));
		//Blocks
		//Armor
		GameRegistry.registerItem(obsidianHelmet, "obsidianHelmet");
		GameRegistry.registerItem(obsidianChestplate, "obsidianChestplate");
		GameRegistry.registerItem(obsidianLeggings, "obsidianLeggings");
		GameRegistry.registerItem(obsidianBoots, "obsidianBoots");
	}
	
	public static void registerRenders()
	{
		//Tools
		registerRender(obsidian_sword);
		registerRender(redstone_sword);
		registerRender(quartz_sword);
		//Items
		registerRender(cooledBlazeRod);
		registerRender(basic_cap);
		registerRender(basic_rod);
		registerRender(hardened_cap);
		registerRender(hardened_stick);
		registerRender(hardened_rod);
		registerRender(iron_cap);
		registerRender(iron_stick);
		registerRender(iron_rod);
		registerRender(gold_cap);
		registerRender(gold_stick);
		registerRender(gold_rod);
		registerRender(fire_cap);
		registerRender(fire_rod);
		//Blocks
		//Armor
		registerRender(obsidianHelmet);
		registerRender(obsidianChestplate);
		registerRender(obsidianLeggings);
		registerRender(obsidianBoots);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
