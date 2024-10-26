package com.natamus.advancementscreenshot.forge.events;

import com.natamus.advancementscreenshot.data.Constants;
import com.natamus.advancementscreenshot.events.AdvancementGetEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class ForgeAdvancementGetEvent {
	@SubscribeEvent
	public void onClientTick(ClientTickEvent e) {
		if (!e.phase.equals(Phase.END)) {
			return;
		}

		AdvancementGetEvent.onClientTick(Constants.mc);
	}
}
