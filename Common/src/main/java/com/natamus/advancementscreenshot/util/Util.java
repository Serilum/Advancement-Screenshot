package com.natamus.advancementscreenshot.util;

import net.minecraft.network.chat.Component;

public class Util {
	public static Component activeAdvancementTitle = null;
	public static boolean takescreenshot = false;
	public static int cooldown = -1;
	
	public static void takeScreenshot(Component advancementTitle) {
		activeAdvancementTitle = advancementTitle;

		takescreenshot = true;
		cooldown = 20;
	}
}
