package com.knifesurge.ToolExpansion;

import com.knifesurge.ToolExpansion.init.ToolExpansionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabToolExpansion extends CreativeTabs {
	
	public tabToolExpansion(String label) {
		super(label);
		this.setBackgroundImageName("toolexpansion.png");
	}

	@Override
	public Item getTabIconItem() {
		return ToolExpansionItems.obsidian_sword;
	}
}
