package com.knifesurge.ToolExpansion.eventhandlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FillBucketEventHandler {

	@SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=true)
	public void onEvent(FillBucketEvent event){
		if(event.entity instanceof EntityPlayer)
		{
			System.out.println("Glub!");
		}
	}
	
}
