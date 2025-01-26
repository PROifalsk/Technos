package net.proifalsk.technos;

import net.fabricmc.api.ModInitializer;

import net.proifalsk.technos.blocks.ModBlocks;
import net.proifalsk.technos.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Technos implements ModInitializer {
	public static final String MOD_ID = "technos";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready states

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}