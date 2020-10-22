
package net.blackout.michrosia.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.blackout.michrosia.itemgroup.MichrosiaTabItemGroup;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.List;
import java.util.Collections;

@MichrosiaModElements.ModElement.Tag
public class MichrosiaGrassBlock extends MichrosiaModElements.ModElement {
	@ObjectHolder("michrosia:michrosiagrass")
	public static final Block block = null;
	public MichrosiaGrassBlock(MichrosiaModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MichrosiaTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(0.5f, 0.5f).lightValue(0).harvestLevel(1)
					.harvestTool(ToolType.SHOVEL));
			setRegistryName("michrosiagrass");
		}

		@Override
		public MaterialColor getMaterialColor(BlockState state, IBlockReader blockAccess, BlockPos pos) {
			return MaterialColor.RED;
		}

		@Override
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(MichrosiaDirtBlock.block, (int) (1)));
		}
	}
}
