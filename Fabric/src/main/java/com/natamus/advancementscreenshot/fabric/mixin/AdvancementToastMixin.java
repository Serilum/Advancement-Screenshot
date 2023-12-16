package com.natamus.advancementscreenshot.fabric.mixin;

import com.natamus.advancementscreenshot.util.Util;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.toasts.AdvancementToast;
import net.minecraft.client.gui.components.toasts.Toast;
import net.minecraft.client.gui.components.toasts.ToastComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = AdvancementToast.class, priority = 1001)
public class AdvancementToastMixin {
	@Inject(method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/gui/components/toasts/ToastComponent;J)Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", at = @At(value = "INVOKE", target = "Lnet/minecraft/advancements/DisplayInfo;getType()Lnet/minecraft/advancements/AdvancementType;", ordinal = 3))
	private void render(GuiGraphics guiGraphics, ToastComponent toastComponent, long l, CallbackInfoReturnable<Toast.Visibility> cir) {
		Util.takeScreenshot();
	}
}
