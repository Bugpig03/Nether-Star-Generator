
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netherstargenerator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.netherstargenerator.world.inventory.NetherStarGeneratorTier4GUIMenu;
import net.mcreator.netherstargenerator.world.inventory.NetherStarGeneratorTier3GUIMenu;
import net.mcreator.netherstargenerator.world.inventory.NetherStarGeneratorTier2GUIMenu;
import net.mcreator.netherstargenerator.world.inventory.NetherStarGeneratorGUIMenu;
import net.mcreator.netherstargenerator.NetherStarGeneratorMod;

public class NetherStarGeneratorModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NetherStarGeneratorMod.MODID);
	public static final RegistryObject<MenuType<NetherStarGeneratorGUIMenu>> NETHER_STAR_GENERATOR__T1_GUI = REGISTRY.register("nether_star_generator__t1_gui", () -> IForgeMenuType.create(NetherStarGeneratorGUIMenu::new));
	public static final RegistryObject<MenuType<NetherStarGeneratorTier2GUIMenu>> NETHER_STAR_GENERATOR_TIER_2_GUI = REGISTRY.register("nether_star_generator_tier_2_gui", () -> IForgeMenuType.create(NetherStarGeneratorTier2GUIMenu::new));
	public static final RegistryObject<MenuType<NetherStarGeneratorTier3GUIMenu>> NETHER_STAR_GENERATOR_TIER_3_GUI = REGISTRY.register("nether_star_generator_tier_3_gui", () -> IForgeMenuType.create(NetherStarGeneratorTier3GUIMenu::new));
	public static final RegistryObject<MenuType<NetherStarGeneratorTier4GUIMenu>> NETHER_STAR_GENERATOR_TIER_4_GUI = REGISTRY.register("nether_star_generator_tier_4_gui", () -> IForgeMenuType.create(NetherStarGeneratorTier4GUIMenu::new));
}
