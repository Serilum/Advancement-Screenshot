package com.natamus.advancementscreenshot.mixin;

import com.natamus.advancementscreenshot.util.Util;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.client.gui.components.toasts.AdvancementToast;
import net.minecraft.client.gui.components.toasts.ToastManager;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = AdvancementToast.class, priority = 1001)
public class AdvancementToastMixin {
	@Shadow private @Final AdvancementHolder advancement;

	@Inject(method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", at = @At(value = "HEAD"))
	private void update(ToastManager toastManager, long l, CallbackInfo ci) {
		DisplayInfo displayInfo = (DisplayInfo)this.advancement.value().display().orElse(null);
		Component advancementTitle = displayInfo.getTitle();

		if (Util.activeAdvancementTitle != advancementTitle) {
			Util.takeScreenshot(advancementTitle);
		}
	}
}
