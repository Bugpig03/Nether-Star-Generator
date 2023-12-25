
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netherstargenerator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.netherstargenerator.NetherStarGeneratorMod;

public class NetherStarGeneratorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NetherStarGeneratorMod.MODID);
	public static final RegistryObject<Item> NETHER_STAR_GENERATOR_TIER1 = block(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER1);
	public static final RegistryObject<Item> NETHER_STAR_GENERATOR_TIER2 = block(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER2);
	public static final RegistryObject<Item> NETHER_STAR_GENERATORTIER_3 = block(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATORTIER_3);
	public static final RegistryObject<Item> NETHER_STAR_GENERATOR_TIER_4 = block(NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER_4);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
