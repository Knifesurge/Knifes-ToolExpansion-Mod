package com.knifesurge.ToolExpansion.entityItem;

import com.knifesurge.ToolExpansion.init.ToolExpansionItems;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SpecialEntityItem extends EntityItem{

	private int age;
    private int delayBeforeCanPickup;
    
	public SpecialEntityItem(World worldIn, double x, double y, double z, ItemStack stack) {
		super(worldIn, x, y, z, stack);
	}
	
	public SpecialEntityItem(World worldIn, double x, double y, double z)
	{
		super(worldIn, x, y, z);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(this.inWater)
		{
			this.setDead();
			//DEBUG
			System.out.println("this set to Dead");
			EntityItem entity = new EntityItem(worldObj, this.posX, this.posY, this.posZ);
			//DEBUG
			System.out.println("EntityItem entity created at this position");
			entity.setEntityItemStack(new ItemStack(ToolExpansionItems.cooledBlazeRod));
			//DEBUG
			System.out.println("entity's EntityItemStack set to cooledFireRod");
			worldObj.spawnEntityInWorld(entity);
			//DEBUG
			System.out.println("entity spawned in world");	
		}
		
	}

}
