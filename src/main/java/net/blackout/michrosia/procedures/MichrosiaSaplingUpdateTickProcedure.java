package net.blackout.michrosia.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.blackout.michrosia.block.MichrosiaGrassBlock;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class MichrosiaSaplingUpdateTickProcedure extends MichrosiaModElements.ModElement {
	public MichrosiaSaplingUpdateTickProcedure(MichrosiaModElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MichrosiaGrassBlock.block.getDefaultState()
				.getBlock()))) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world.getWorld(), new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if ((Math.random() <= 0.01)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
					&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 3), (int) (z + 1)))).getBlock() == Blocks.AIR
									.getDefaultState().getBlock())
									&& (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 3), (int) z))).getBlock() == Blocks.AIR
											.getDefaultState().getBlock())
											&& (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 3), (int) (z - 1))))
													.getBlock() == Blocks.AIR.getDefaultState().getBlock())
													&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 3), (int) (z + 2))))
															.getBlock() == Blocks.AIR.getDefaultState().getBlock())
															&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 3), (int) (z + 1))))
																	.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																	&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 3), (int) z)))
																			.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																			&& (((world.getBlockState(
																					new BlockPos((int) (x - 1), (int) (y + 3), (int) (z - 1))))
																							.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																					&& (((world.getBlockState(new BlockPos((int) (x - 1),
																							(int) (y + 3), (int) (z - 2)))).getBlock() == Blocks.AIR
																									.getDefaultState().getBlock())
																							&& (((world.getBlockState(new BlockPos((int) x,
																									(int) (y + 3), (int) (z + 2))))
																											.getBlock() == Blocks.AIR
																													.getDefaultState().getBlock())
																									&& (((world.getBlockState(new BlockPos((int) x,
																											(int) (y + 3), (int) (z + 1))))
																													.getBlock() == Blocks.AIR
																															.getDefaultState()
																															.getBlock())
																											&& (((world.getBlockState(new BlockPos(
																													(int) x, (int) (y + 3), (int) z)))
																															.getBlock() == Blocks.AIR
																																	.getDefaultState()
																																	.getBlock())
																													&& (((world.getBlockState(
																															new BlockPos((int) x,
																																	(int) (y + 3),
																																	(int) (z - 1))))
																																			.getBlock() == Blocks.AIR
																																					.getDefaultState()
																																					.getBlock())
																															&& (((world.getBlockState(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y + 3),
																																			(int) (z - 2))))
																																					.getBlock() == Blocks.AIR
																																							.getDefaultState()
																																							.getBlock())
																																	&& (((world
																																			.getBlockState(
																																					new BlockPos(
																																							(int) (x + 1),
																																							(int) (y + 3),
																																							(int) (z + 2))))
																																									.getBlock() == Blocks.AIR
																																											.getDefaultState()
																																											.getBlock())
																																			&& (((world
																																					.getBlockState(
																																							new BlockPos(
																																									(int) (x + 1),
																																									(int) (y + 3),
																																									(int) (z + 1))))
																																											.getBlock() == Blocks.AIR
																																													.getDefaultState()
																																													.getBlock())
																																					&& (((world
																																							.getBlockState(
																																									new BlockPos(
																																											(int) (x + 1),
																																											(int) (y + 3),
																																											(int) z)))
																																													.getBlock() == Blocks.AIR
																																															.getDefaultState()
																																															.getBlock())
																																							&& (((world
																																									.getBlockState(
																																											new BlockPos(
																																													(int) (x + 1),
																																													(int) (y + 3),
																																													(int) (z - 1))))
																																															.getBlock() == Blocks.AIR
																																																	.getDefaultState()
																																																	.getBlock())
																																									&& (((world
																																											.getBlockState(
																																													new BlockPos(
																																															(int) (x + 1),
																																															(int) (y + 3),
																																															(int) (z - 2))))
																																																	.getBlock() == Blocks.AIR
																																																			.getDefaultState()
																																																			.getBlock())
																																											&& (((world
																																													.getBlockState(
																																															new BlockPos(
																																																	(int) (x + 2),
																																																	(int) (y + 3),
																																																	(int) (z + 1))))
																																																			.getBlock() == Blocks.AIR
																																																					.getDefaultState()
																																																					.getBlock())
																																													&& (((world
																																															.getBlockState(
																																																	new BlockPos(
																																																			(int) (x + 2),
																																																			(int) (y + 3),
																																																			(int) z)))
																																																					.getBlock() == Blocks.AIR
																																																							.getDefaultState()
																																																							.getBlock())
																																															&& ((world
																																																	.getBlockState(
																																																			new BlockPos(
																																																					(int) (x + 2),
																																																					(int) (y + 3),
																																																					(int) (z - 1))))
																																																							.getBlock() == Blocks.AIR
																																																									.getDefaultState()
																																																									.getBlock())))))))))))))))))))))
									&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 1)))).getBlock() == Blocks.AIR
											.getDefaultState().getBlock())
											&& (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 4), (int) z))).getBlock() == Blocks.AIR
													.getDefaultState().getBlock())
													&& (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 1))))
															.getBlock() == Blocks.AIR.getDefaultState().getBlock())
															&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 2))))
																	.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																	&& (((world
																			.getBlockState(new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 1))))
																					.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																			&& (((world.getBlockState(
																					new BlockPos((int) (x - 1), (int) (y + 4), (int) z)))
																							.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																					&& (((world.getBlockState(new BlockPos((int) (x - 1),
																							(int) (y + 4), (int) (z - 1)))).getBlock() == Blocks.AIR
																									.getDefaultState().getBlock())
																							&& (((world.getBlockState(new BlockPos((int) (x - 1),
																									(int) (y + 4), (int) (z - 2))))
																											.getBlock() == Blocks.AIR
																													.getDefaultState().getBlock())
																									&& (((world.getBlockState(new BlockPos((int) x,
																											(int) (y + 4), (int) (z + 2))))
																													.getBlock() == Blocks.AIR
																															.getDefaultState()
																															.getBlock())
																											&& (((world.getBlockState(new BlockPos(
																													(int) x, (int) (y + 4),
																													(int) (z + 1))))
																															.getBlock() == Blocks.AIR
																																	.getDefaultState()
																																	.getBlock())
																													&& (((world.getBlockState(
																															new BlockPos((int) x,
																																	(int) (y + 4),
																																	(int) z)))
																																			.getBlock() == Blocks.AIR
																																					.getDefaultState()
																																					.getBlock())
																															&& (((world.getBlockState(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y + 4),
																																			(int) (z - 1))))
																																					.getBlock() == Blocks.AIR
																																							.getDefaultState()
																																							.getBlock())
																																	&& (((world
																																			.getBlockState(
																																					new BlockPos(
																																							(int) x,
																																							(int) (y + 4),
																																							(int) (z - 2))))
																																									.getBlock() == Blocks.AIR
																																											.getDefaultState()
																																											.getBlock())
																																			&& (((world
																																					.getBlockState(
																																							new BlockPos(
																																									(int) (x + 1),
																																									(int) (y + 4),
																																									(int) (z + 2))))
																																											.getBlock() == Blocks.AIR
																																													.getDefaultState()
																																													.getBlock())
																																					&& (((world
																																							.getBlockState(
																																									new BlockPos(
																																											(int) (x + 1),
																																											(int) (y + 4),
																																											(int) (z + 1))))
																																													.getBlock() == Blocks.AIR
																																															.getDefaultState()
																																															.getBlock())
																																							&& (((world
																																									.getBlockState(
																																											new BlockPos(
																																													(int) (x + 1),
																																													(int) (y + 4),
																																													(int) z)))
																																															.getBlock() == Blocks.AIR
																																																	.getDefaultState()
																																																	.getBlock())
																																									&& (((world
																																											.getBlockState(
																																													new BlockPos(
																																															(int) (x + 1),
																																															(int) (y + 4),
																																															(int) (z - 1))))
																																																	.getBlock() == Blocks.AIR
																																																			.getDefaultState()
																																																			.getBlock())
																																											&& (((world
																																													.getBlockState(
																																															new BlockPos(
																																																	(int) (x + 1),
																																																	(int) (y + 4),
																																																	(int) (z - 2))))
																																																			.getBlock() == Blocks.AIR
																																																					.getDefaultState()
																																																					.getBlock())
																																													&& (((world
																																															.getBlockState(
																																																	new BlockPos(
																																																			(int) (x + 2),
																																																			(int) (y + 4),
																																																			(int) (z + 1))))
																																																					.getBlock() == Blocks.AIR
																																																							.getDefaultState()
																																																							.getBlock())
																																															&& (((world
																																																	.getBlockState(
																																																			new BlockPos(
																																																					(int) (x + 2),
																																																					(int) (y + 4),
																																																					(int) z)))
																																																							.getBlock() == Blocks.AIR
																																																									.getDefaultState()
																																																									.getBlock())
																																																	&& ((world
																																																			.getBlockState(
																																																					new BlockPos(
																																																							(int) (x + 2),
																																																							(int) (y + 4),
																																																							(int) (z - 1))))
																																																									.getBlock() == Blocks.AIR
																																																											.getDefaultState()
																																																											.getBlock())))))))))))))))))))))
											&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) z))).getBlock() == Blocks.AIR
													.getDefaultState().getBlock())
													&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z + 1))))
															.getBlock() == Blocks.AIR.getDefaultState().getBlock())
															&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) z)))
																	.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																	&& (((world
																			.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z - 1))))
																					.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																			&& (((world.getBlockState(
																					new BlockPos((int) x, (int) (y + 5), (int) (z + 2))))
																							.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																					&& (((world.getBlockState(
																							new BlockPos((int) x, (int) (y + 5), (int) (z + 1))))
																									.getBlock() == Blocks.AIR.getDefaultState()
																											.getBlock())
																							&& (((world.getBlockState(
																									new BlockPos((int) x, (int) (y + 5), (int) z)))
																											.getBlock() == Blocks.AIR
																													.getDefaultState().getBlock())
																									&& (((world.getBlockState(new BlockPos((int) x,
																											(int) (y + 5), (int) (z - 1))))
																													.getBlock() == Blocks.AIR
																															.getDefaultState()
																															.getBlock())
																											&& (((world.getBlockState(new BlockPos(
																													(int) x, (int) (y + 5),
																													(int) (z - 2))))
																															.getBlock() == Blocks.AIR
																																	.getDefaultState()
																																	.getBlock())
																													&& (((world.getBlockState(
																															new BlockPos(
																																	(int) (x + 1),
																																	(int) (y + 5),
																																	(int) (z + 1))))
																																			.getBlock() == Blocks.AIR
																																					.getDefaultState()
																																					.getBlock())
																															&& (((world.getBlockState(
																																	new BlockPos(
																																			(int) (x + 1),
																																			(int) (y + 5),
																																			(int) z)))
																																					.getBlock() == Blocks.AIR
																																							.getDefaultState()
																																							.getBlock())
																																	&& ((world
																																			.getBlockState(
																																					new BlockPos(
																																							(int) (x + 1),
																																							(int) (y + 5),
																																							(int) (z - 1))))
																																									.getBlock() == Blocks.AIR
																																											.getDefaultState()
																																											.getBlock()))))))))))))
													&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 6), (int) z)))
															.getBlock() == Blocks.AIR.getDefaultState().getBlock())
															&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) (z + 1))))
																	.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																	&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z)))
																			.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																			&& (((world.getBlockState(
																					new BlockPos((int) x, (int) (y + 6), (int) (z - 1))))
																							.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																					&& ((world.getBlockState(
																							new BlockPos((int) (x + 6), (int) (y + 5), (int) z)))
																									.getBlock() == Blocks.AIR.getDefaultState()
																											.getBlock()))))))))))) {
				if ((Math.random() <= 0.3)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					if (!world.getWorld().isRemote) {
						Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree1"));
						if (template != null) {
							template.addBlocksToWorld(world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), new PlacementSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
						}
					}
				} else if ((Math.random() <= 0.6)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					if (!world.getWorld().isRemote) {
						Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree3"));
						if (template != null) {
							template.addBlocksToWorld(world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), new PlacementSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
						}
					}
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					if (!world.getWorld().isRemote) {
						Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree2"));
						if (template != null) {
							template.addBlocksToWorld(world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), new PlacementSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
						}
					}
				}
			}
		}
	}
}
