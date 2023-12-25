
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netherstargenerator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.netherstargenerator.block.entity.Netherstargeneratortier2BlockEntity;
import net.mcreator.netherstargenerator.block.entity.NetherStarGeneratortier3BlockEntity;
import net.mcreator.netherstargenerator.block.entity.NetherStarGeneratorTier4BlockEntity;
import net.mcreator.netherstargenerator.block.entity.NetherStarGeneratorBlockEntity;
import net.mcreator.netherstargenerator.NetherStarGeneratorMod;

public class NetherStarGeneratorModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NetherStarGeneratorMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NETHER_STAR_GENERATOR_TIER1 = register("nether_star_generator_tier1", NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER1, NetherStarGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_STAR_GENERATOR_TIER2 = register("nether_star_generator_tier2", NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER2, Netherstargeneratortier2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_STAR_GENERATORTIER_3 = register("nether_star_generatortier_3", NetherStarGeneratorModBlocks.NETHER_STAR_GENERATORTIER_3, NetherStarGeneratortier3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_STAR_GENERATOR_TIER_4 = register("nether_star_generator_tier_4", NetherStarGeneratorModBlocks.NETHER_STAR_GENERATOR_TIER_4, NetherStarGeneratorTier4BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
