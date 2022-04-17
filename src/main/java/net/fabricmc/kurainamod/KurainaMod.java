package net.fabricmc.kurainamod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.kurainamod.client.renderer.entity.KurainaRenderer;
import net.fabricmc.kurainamod.entity.KurainaEntity;
import net.fabricmc.kurainamod.utils.MobAttributes;
import net.fabricmc.kurainamod.utils.ModEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class KurainaMod implements ModInitializer {

	public static ModEntity MOBS;
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("kurainamod");
	//instance the items
	public static final Item Raw_Wing = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
	public static final Item Cooked_Wing = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).build()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		MOBS = new ModEntity();
		MobAttributes.init();
		//We initialize GeckoLib
		GeckoLib.initialize();
		//adding the items to the registry
		Registry.register(Registry.ITEM, new Identifier("kurainamod", "raw_wing"), Raw_Wing);
		Registry.register(Registry.ITEM, new Identifier("kurainamod", "cooked_wing"), Cooked_Wing);
		//adding renderer registry
		EntityRendererRegistry.register(ModEntity.KURAINA, (context) -> {
			return new KurainaRenderer(context);
		});
	}

}
