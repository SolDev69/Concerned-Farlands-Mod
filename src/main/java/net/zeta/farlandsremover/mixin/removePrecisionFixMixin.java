package net.zeta.farlandsremover.mixin;

import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import net.minecraft.util.math.noise.PerlinNoiseSampler;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Random;

@Mixin(OctavePerlinNoiseSampler.class)
public class removePrecisionFixMixin {
	@Shadow
	@Final
	private PerlinNoiseSampler[] field_26172;
	@Shadow
	@Final
	private int field_26173;

	public void dummy(Random random, int i) {
		this.field_26173 = i;
		this.field_26172 = new PerlinNoiseSampler[i];

		for(int j = 0; j < i; ++j) {
			this.field_26172[j] = new PerlinNoiseSampler(random);
		}

	}

	@Overwrite
	public double[] method_28052(double[] ds, int i, int j, int k, int l, int m, int n, double d, double e, double f) {
		if (ds == null) {
			ds = new double[l * m * n];
		} else {
			for(int o = 0; o < ds.length; ++o) {
				ds[o] = 0.0D;
			}
		}

		double g = 1.0D;

		for(int p = 0; p < this.field_26173; ++p) {
			double h = (double)i * g * d;
			double q = (double)j * g * e;
			double r = (double)k * g * f;
			System.out.println("Here lies the FarLands patch. R.I.P.");
			this.field_26172[p].method_28049(ds, h, q, r, l, m, n, d * g, e * g, f * g, g);
			g /= 2.0D;
		}

		return ds;
	}

}
