package com.natamus.advancementscreenshot.mixin;

import com.natamus.advancementscreenshot.util.Util;
import net.minecraft.client.gui.components.toasts.AdvancementToast;
import net.minecraft.client.gui.components.toasts.ToastManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = AdvancementToast.class, priority = 1001)
public class AdvancementToastMixin {
	@Inject(method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/advancements/DisplayInfo;getType()Lnet/minecraft/advancements/AdvancementType;"))
	private void update(ToastManager toastManager, long l, CallbackInfo ci) {
		Util.takeScreenshot();
	}
}
