package com.knifesurge.ToolExpansion.eventhandlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemTossEventHandler {

	@SubscribeEvent
	public void onEvent(ItemTossEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			System.out.println("Someone dropped something!");
		}
	}
	
}
