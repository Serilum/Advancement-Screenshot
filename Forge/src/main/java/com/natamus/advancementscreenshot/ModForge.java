package com.natamus.advancementscreenshot;

import com.natamus.advancementscreenshot.forge.config.IntegrateForgeConfig;
import com.natamus.advancementscreenshot.forge.events.ForgeAdvancementGetEvent;
import com.natamus.advancementscreenshot.util.Reference;
import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.check.ShouldLoadCheck;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(Reference.MOD_ID)
public class ModForge {
	
	public ModForge() {
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::loadComplete);

		setGlobalConstants();
		ModCommon.init();

		IntegrateForgeConfig.registerScreen(ModLoadingContext.get());

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadComplete(final FMLLoadCompleteEvent event) {
		if (!FMLEnvironment.dist.equals(Dist.CLIENT)) {
			return;
		}

    	MinecraftForge.EVENT_BUS.register(new ForgeAdvancementGetEvent());
	}

	private static void setGlobalConstants() {

	}
}