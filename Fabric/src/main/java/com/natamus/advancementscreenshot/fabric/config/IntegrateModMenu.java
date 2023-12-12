package com.natamus.advancementscreenshot.fabric.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.advancementscreenshot.util.Reference;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class IntegrateModMenu implements ModMenuApi {
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> DuskConfig.DuskConfigScreen.getScreen(parent, Reference.MOD_ID);
	}
}