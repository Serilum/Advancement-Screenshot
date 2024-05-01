package com.natamus.advancementscreenshot.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.advancementscreenshot.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean showScreenshotTakenMessage = false;
	@Entry(min = 0, max = 100) public static int takeScreenshotTickDelay = 20;

	public static void initConfig() {
		configMetaData.put("showScreenshotTakenMessage", Arrays.asList(
			"If enabled, shows the normal screenshot taken (same as F2) message when a screenshot is taken after an advancement."
		));
		configMetaData.put("takeScreenshotTickDelay", Arrays.asList(
			"How many ticks the mod should wait until it takes a screenshot. By default 1 second. 20 ticks = 1 second"
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}