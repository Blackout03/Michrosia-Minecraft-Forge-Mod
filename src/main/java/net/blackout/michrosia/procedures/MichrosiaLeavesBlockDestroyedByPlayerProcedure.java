package net.blackout.michrosia.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.blackout.michrosia.item.AppleItem;
import net.blackout.michrosia.block.MichrosiaSaplingBlock;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class MichrosiaLeavesBlockDestroyedByPlayerProcedure extends MichrosiaModElements.ModElement {
	public MichrosiaLeavesBlockDestroyedByPlayerProcedure(MichrosiaModElements instance) {
		super(instance, 46);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure MichrosiaLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure MichrosiaLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure MichrosiaLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure MichrosiaLeavesBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.05)) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(MichrosiaSaplingBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
		if ((Math.random() < 0.005)) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AppleItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
