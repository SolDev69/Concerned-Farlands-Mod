package net.zeta.cursedfarlands.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OctavePerlinNoiseSampler.class)
public class ConcernedFarlandsMixin {
	//@Inject(at = @At("HEAD"), method = "init()V")
	//private void init(CallbackInfo info) {
	//	System.out.println("This line is printed by an example mod mixin!");
	//}
	/**
	 * @author E
	 */
	@Overwrite
	public static double maintainPrecision(double d) {
		return d;
	}
}
