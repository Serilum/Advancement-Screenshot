package com.natamus.advancementscreenshot.neoforge.events;

import com.natamus.advancementscreenshot.data.Constants;
import com.natamus.advancementscreenshot.events.AdvancementGetEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeAdvancementGetEvent {
	@SubscribeEvent
	public static void onClientTick(ClientTickEvent.Post e) {

		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
