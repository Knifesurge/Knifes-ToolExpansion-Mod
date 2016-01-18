package com.knifesurge.ToolExpansion.stats.achievements;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class Achievements extends AchievementList{

	public static Achievement getWool;
	
	public void registerAchievements(){
		getWool = (new Achievement("achievement.getWool", "getWool", 0, 0, Blocks.wool, (Achievement)null)).setIndependent().func_180788_c();
	}
}
