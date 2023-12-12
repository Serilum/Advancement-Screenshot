package com.natamus.advancementscreenshot.util;

public class Util {
	public static boolean takescreenshot = false;
	public static int cooldown = -1;
	
	public static void takeScreenshot() {
		takescreenshot = true;
		cooldown = 20;
	}
}
