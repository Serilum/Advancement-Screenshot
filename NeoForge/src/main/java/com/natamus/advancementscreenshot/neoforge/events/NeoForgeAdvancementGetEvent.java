package com.natamus.advancementscreenshot.neoforge.events;

import com.natamus.advancementscreenshot.data.Constants;
import com.natamus.advancementscreenshot.events.AdvancementGetEvent;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.event.TickEvent.ClientTickEvent;
import net.neoforged.neoforge.event.TickEvent.Phase;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class NeoForgeAdvancementGetEvent {
	@SubscribeEvent
	public static void onClientTick(ClientTickEvent e) {
		if (!e.phase.equals(Phase.END)) {
			return;
		}

		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
