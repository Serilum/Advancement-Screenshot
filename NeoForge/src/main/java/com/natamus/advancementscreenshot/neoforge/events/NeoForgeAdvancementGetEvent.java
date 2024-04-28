package com.natamus.advancementscreenshot.neoforge.events;

import com.natamus.advancementscreenshot.data.Constants;
import com.natamus.advancementscreenshot.events.AdvancementGetEvent;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class NeoForgeAdvancementGetEvent {
	@SubscribeEvent
	public static void onClientTick(ClientTickEvent.Post e) {

		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
