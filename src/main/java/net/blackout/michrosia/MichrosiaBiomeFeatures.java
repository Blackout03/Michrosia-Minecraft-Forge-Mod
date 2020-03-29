package net.blackout.michrosia;

import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.NoiseDependant;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.GrassFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.Biome;
import net.minecraft.block.Blocks;

public class MichrosiaBiomeFeatures {
	public static void addMichrosiaVegetation(Biome biomeIn) {
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.SWAMP_FLOWER,
				IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(1)));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.PLAIN_FLOWER,
				IFeatureConfig.NO_FEATURE_CONFIG, Placement.NOISE_HEIGHTMAP_32, new NoiseDependant(-0.4D, 8, 2)));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS,
				new GrassFeatureConfig(Blocks.GRASS.getDefaultState()), Placement.NOISE_HEIGHTMAP_DOUBLE, new NoiseDependant(-0.4D, 2, 4)));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.FOREST_FLOWER,
				IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(1)));
	}
}
