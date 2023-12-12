package com.natamus.advancementscreenshot.events;

import com.natamus.advancementscreenshot.config.ConfigHandler;
import com.natamus.advancementscreenshot.util.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.Screenshot;

public class AdvancementGetEvent {
	public static void onClientTick(Minecraft mc) {
		if (Util.cooldown > 0) {
			Util.cooldown -= 1;
			return;
		}
		
		if (Util.takescreenshot) {
			if (Util.cooldown < 0) {
				Util.cooldown = ConfigHandler.takeScreenshotTickDelay;
				return;
			}
			
			Screenshot.grab(mc.gameDirectory, mc.getMainRenderTarget(), (context) -> {
				mc.execute(() -> {
					if (ConfigHandler.showScreenshotTakenMessage) {
						mc.gui.getChat().addMessage(context);
					}
				});
			});
			
			Util.takescreenshot = false;
			Util.cooldown = -1;
		}
	}
}
