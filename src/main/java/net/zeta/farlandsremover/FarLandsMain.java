package net.zeta.farlandsremover;

import net.fabricmc.api.ModInitializer;
import org.lwjgl.Sys;

public class FarLandsMain implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
		System.out.println("Murdering the Farlands patch...");
	}
}
