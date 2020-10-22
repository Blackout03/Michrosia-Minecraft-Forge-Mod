
package net.blackout.michrosia.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import net.blackout.michrosia.block.DarkstoneBlock;
import net.blackout.michrosia.MichrosiaModElements;

@MichrosiaModElements.ModElement.Tag
public class DarkstoneHillsBiome extends MichrosiaModElements.ModElement {
	@ObjectHolder("michrosia:darkstone_hills")
	public static final CustomBiome biome = null;
	public DarkstoneHillsBiome(MichrosiaModElements instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 1024));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.6f).scale(1.4000000000000001f).temperature(0.3f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NONE).waterColor(-13421773).waterFogColor(-13421773)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(DarkstoneBlock.block.getDefaultState(),
							DarkstoneBlock.block.getDefaultState(), DarkstoneBlock.block.getDefaultState())));
			setRegistryName("darkstone_hills");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addFossils(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -16777216;
		}
	}
}
