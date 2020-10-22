package net.blackout.michrosia.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class ReprocessorNeighbourBlockChangesProcedure extends MichrosiaModElements.ModElement {
	public ReprocessorNeighbourBlockChangesProcedure(MichrosiaModElements instance) {
		super(instance, 135);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure ReprocessorNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure ReprocessorNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure ReprocessorNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure ReprocessorNeighbourBlockChanges!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
		} else if ((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
