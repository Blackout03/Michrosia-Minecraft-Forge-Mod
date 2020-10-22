
package net.blackout.michrosia.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.blackout.michrosia.MichrosiaModElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@MichrosiaModElements.ModElement.Tag
public class ExtraDarkstoneBlock extends MichrosiaModElements.ModElement {
	@ObjectHolder("michrosia:extra_darkstone")
	public static final Block block = null;
	public ExtraDarkstoneBlock(MichrosiaModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 6f).lightValue(0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("extra_darkstone");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
			return new ItemStack(DarkstoneBlock.block, (int) (1));
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DarkcobblestoneBlock.block, (int) (1)));
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("michrosia:michrosia")))
				biomeCriteria = true;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("michrosia:darkstone_hills")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;
					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.place(world, generator, rand, pos, config);
				}
			}.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("extra_darkstone", "extra_darkstone", blockAt -> {
				boolean blockCriteria = false;
				if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.GRANITE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DIORITE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ANDESITE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.COAL_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.IRON_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.REDSTONE_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.REDSTONE_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.GOLD_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.LAPIS_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DIAMOND_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.EMERALD_ORE.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}), block.getDefaultState(), 64)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(64, 0, 0, 200))));
		}
	}
}
