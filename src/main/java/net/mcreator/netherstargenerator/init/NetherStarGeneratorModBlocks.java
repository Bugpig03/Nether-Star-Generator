
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netherstargenerator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.netherstargenerator.block.Netherstargeneratortier2Block;
import net.mcreator.netherstargenerator.block.NetherStarGeneratortier3Block;
import net.mcreator.netherstargenerator.block.NetherStarGeneratorTier4Block;
import net.mcreator.netherstargenerator.block.NetherStarGeneratorBlock;
import net.mcreator.netherstargenerator.NetherStarGeneratorMod;

public class NetherStarGeneratorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NetherStarGeneratorMod.MODID);
	public static final RegistryObject<Block> NETHER_STAR_GENERATOR_TIER1 = REGISTRY.register("nether_star_generator_tier1", () -> new NetherStarGeneratorBlock());
	public static final RegistryObject<Block> NETHER_STAR_GENERATOR_TIER2 = REGISTRY.register("nether_star_generator_tier2", () -> new Netherstargeneratortier2Block());
	public static final RegistryObject<Block> NETHER_STAR_GENERATORTIER_3 = REGISTRY.register("nether_star_generatortier_3", () -> new NetherStarGeneratortier3Block());
	public static final RegistryObject<Block> NETHER_STAR_GENERATOR_TIER_4 = REGISTRY.register("nether_star_generator_tier_4", () -> new NetherStarGeneratorTier4Block());
}
