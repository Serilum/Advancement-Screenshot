package com.serilum.advancementscreenshot.neoforge.events;

import com.serilum.advancementscreenshot.data.Constants;
import com.serilum.advancementscreenshot.events.AdvancementGetEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeAdvancementGetEvent {
	@SubscribeEvent
	public static void onClientTick(ClientTickEvent.Post e) {

		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
