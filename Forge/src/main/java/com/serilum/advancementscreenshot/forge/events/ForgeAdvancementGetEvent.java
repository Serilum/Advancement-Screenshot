package com.serilum.advancementscreenshot.forge.events;

import com.serilum.advancementscreenshot.data.Constants;
import com.serilum.advancementscreenshot.events.AdvancementGetEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeAdvancementGetEvent {
	@SubscribeEvent
	public static void onClientTick(ClientTickEvent e) {
		if (!e.phase.equals(Phase.END)) {
			return;
		}

		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
