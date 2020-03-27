
package net.blackout.michrosia.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.PlantType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.blackout.michrosia.itemgroup.MichrosiaTabItemGroup;
import net.blackout.michrosia.MichrosiaElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@MichrosiaElements.ModElement.Tag
public class MichrosiaGrassShort2Block extends MichrosiaElements.ModElement {
	@ObjectHolder("michrosia:michrosiagrassshort2")
	public static final Block block = null;
	public MichrosiaGrassShort2Block(MichrosiaElements instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MichrosiaTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		FlowersFeature feature = new FlowersFeature(NoFeatureConfig::deserialize) {
			@Override
			public BlockState getRandomFlower(Random random, BlockPos pos) {
				return block.getDefaultState();
			}

			@Override
			public boolean place(IWorld world, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {
				DimensionType dimensionType = world.getDimension().getType();
				boolean dimensionCriteria = false;
				if (dimensionType == DimensionType.OVERWORLD)
					dimensionCriteria = true;
				if (!dimensionCriteria)
					return false;
				return super.place(world, generator, random, pos, config);
			}
		};
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("michrosia:michrosiabiome")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Biome.createDecoratedFeature(feature, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(20)));
		}
	}
	public static class BlockCustomFlower extends FlowerBlock {
		public BlockCustomFlower() {
			super(Effects.SATURATION, 0, Block.Properties.create(Material.PLANTS, MaterialColor.RED).doesNotBlockMovement().sound(SoundType.PLANT)
					.hardnessAndResistance(0f, 0f).lightValue(0));
			setRegistryName("michrosiagrassshort2");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.AIR, (int) (0)));
		}

		@Override
		public PlantType getPlantType(IBlockReader world, BlockPos pos) {
			return PlantType.Plains;
		}
	}
}
