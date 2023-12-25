
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netherstargenerator.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.netherstargenerator.client.gui.NetherStarGeneratorTier4GUIScreen;
import net.mcreator.netherstargenerator.client.gui.NetherStarGeneratorTier3GUIScreen;
import net.mcreator.netherstargenerator.client.gui.NetherStarGeneratorTier2GUIScreen;
import net.mcreator.netherstargenerator.client.gui.NetherStarGeneratorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NetherStarGeneratorModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NetherStarGeneratorModMenus.NETHER_STAR_GENERATOR__T1_GUI.get(), NetherStarGeneratorGUIScreen::new);
			MenuScreens.register(NetherStarGeneratorModMenus.NETHER_STAR_GENERATOR_TIER_2_GUI.get(), NetherStarGeneratorTier2GUIScreen::new);
			MenuScreens.register(NetherStarGeneratorModMenus.NETHER_STAR_GENERATOR_TIER_3_GUI.get(), NetherStarGeneratorTier3GUIScreen::new);
			MenuScreens.register(NetherStarGeneratorModMenus.NETHER_STAR_GENERATOR_TIER_4_GUI.get(), NetherStarGeneratorTier4GUIScreen::new);
		});
	}
}
