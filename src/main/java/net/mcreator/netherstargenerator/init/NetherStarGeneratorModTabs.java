
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netherstargenerator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.netherstargenerator.NetherStarGeneratorMod;

public class NetherStarGeneratorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NetherStarGeneratorMod.MODID);
	public static final RegistryObject<CreativeModeTab> NETHER_STAR_GENERATOR_TAB = REGISTRY.register("nether_star_generator_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.nether_star_generator.nether_star_generator_tab")).icon(() -> new ItemStack(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER1.get().asItem());
				tabData.accept(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER2.get().asItem());
				tabData.accept(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATORTIER_3.get().asItem());
				tabData.accept(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER_4.get().asItem());
			}).withSearchBar().build());
}
