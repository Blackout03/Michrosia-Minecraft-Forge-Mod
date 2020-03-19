package net.mcreator.michrosia.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.michrosia.block.ReprocessorPartBlock;
import net.mcreator.michrosia.block.ReprocessorBlock;
import net.mcreator.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class ReprocessorPartMainOnBlockRightClickedProcedure extends MichrosiaElements.ModElement {
	public ReprocessorPartMainOnBlockRightClickedProcedure(MichrosiaElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ReprocessorPartBlock.block.getDefaultState()
				.getBlock())
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == ReprocessorPartBlock.block.getDefaultState()
						.getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReprocessorBlock.block.getDefaultState(), 3);
		}
	}
}
