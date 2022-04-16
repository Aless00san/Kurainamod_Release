package net.fabricmc.kurainamod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KurainaMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("kuraianmod");
	//instance the items
	public static final Item Raw_Wing = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
	public static final Item Cooked_Wing = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).build()));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Kuraina says Hello world!");

		Registry.register(Registry.ITEM, new Identifier("kurainamod", "raw_wing"), Raw_Wing);
		Registry.register(Registry.ITEM, new Identifier("kurainamod", "cooked_wing"), Cooked_Wing);
	}
}
