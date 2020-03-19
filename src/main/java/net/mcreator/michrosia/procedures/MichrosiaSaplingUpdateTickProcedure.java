package net.mcreator.michrosia.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.michrosia.block.MichrosiaGrassBlock;
import net.mcreator.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class MichrosiaSaplingUpdateTickProcedure extends MichrosiaElements.ModElement {
	public MichrosiaSaplingUpdateTickProcedure(MichrosiaElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MichrosiaSaplingUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MichrosiaGrassBlock.block.getDefaultState()
				.getBlock()))) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if ((Math.random() <= 0.005)) {
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
					if (!world.isRemote) {
						Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree1"));
						if (template != null) {
							template.addBlocksToWorldChunk(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null).setIgnoreEntities(false));
						}
					}
				} else if ((Math.random() <= 0.6)) {
					if (!world.isRemote) {
						Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree2"));
						if (template != null) {
							template.addBlocksToWorldChunk(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null).setIgnoreEntities(false));
						}
					}
				} else {
					if (!world.isRemote) {
						Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree3"));
						if (template != null) {
							template.addBlocksToWorldChunk(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null).setIgnoreEntities(false));
						}
					}
				}
			}
		}
	}
}
