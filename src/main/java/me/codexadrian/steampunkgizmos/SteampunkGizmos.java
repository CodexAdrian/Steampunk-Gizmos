package me.codexadrian.steampunkgizmos;

import me.codexadrian.steampunkgizmos.items.BaseMultitool;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import team.reborn.energy.EnergyTier;

public class SteampunkGizmos implements ModInitializer {
	public static final String MODID = "steampunkgizmos";
	public static final Item TEST_ITEM = new BaseMultitool(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1), 1000, EnergyTier.LOW);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new ResourceLocation(MODID, "phone"), TEST_ITEM);

		System.out.println("Hello Fabric world!");
	}
}
