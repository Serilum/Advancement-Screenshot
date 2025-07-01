package com.natamus.advancementscreenshot.forge.events;

import com.natamus.advancementscreenshot.data.Constants;
import com.natamus.advancementscreenshot.events.AdvancementGetEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeAdvancementGetEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeAdvancementGetEvent.class);

		ClientTickEvent.Pre.BUS.addListener(ForgeAdvancementGetEvent::onClientTick);
	}

	@SubscribeEvent
	public static void onClientTick(ClientTickEvent.Pre e) {
		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
