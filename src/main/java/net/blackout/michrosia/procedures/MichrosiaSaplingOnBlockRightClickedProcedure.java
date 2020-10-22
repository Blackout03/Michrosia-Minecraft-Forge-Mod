package net.blackout.michrosia.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class MichrosiaSaplingOnBlockRightClickedProcedure extends MichrosiaModElements.ModElement {
	public MichrosiaSaplingOnBlockRightClickedProcedure(MichrosiaModElements instance) {
		super(instance, 50);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MichrosiaSaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure MichrosiaSaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure MichrosiaSaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure MichrosiaSaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure MichrosiaSaplingOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.BONE_MEAL, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL, (int) (1));
				((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 30, 3, 3, 3, 1);
			}
			if ((Math.random() <= 0.05)) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())
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
																		&& (((world
																				.getBlockState(new BlockPos((int) (x - 1), (int) (y + 3), (int) z)))
																						.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																				&& (((world.getBlockState(
																						new BlockPos((int) (x - 1), (int) (y + 3), (int) (z - 1))))
																								.getBlock() == Blocks.AIR.getDefaultState()
																										.getBlock())
																						&& (((world.getBlockState(new BlockPos((int) (x - 1),
																								(int) (y + 3), (int) (z - 2))))
																										.getBlock() == Blocks.AIR.getDefaultState()
																												.getBlock())
																								&& (((world.getBlockState(new BlockPos((int) x,
																										(int) (y + 3), (int) (z + 2))))
																												.getBlock() == Blocks.AIR
																														.getDefaultState().getBlock())
																										&& (((world.getBlockState(new BlockPos(
																												(int) x, (int) (y + 3),
																												(int) (z + 1))))
																														.getBlock() == Blocks.AIR
																																.getDefaultState()
																																.getBlock())
																												&& (((world.getBlockState(
																														new BlockPos((int) x,
																																(int) (y + 3),
																																(int) z)))
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
																																&& (((world
																																		.getBlockState(
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
										&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 1))))
												.getBlock() == Blocks.AIR.getDefaultState().getBlock())
												&& (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 4), (int) z)))
														.getBlock() == Blocks.AIR.getDefaultState().getBlock())
														&& (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 1))))
																.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 2))))
																		.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																		&& (((world.getBlockState(
																				new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 1))))
																						.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																				&& (((world.getBlockState(
																						new BlockPos((int) (x - 1), (int) (y + 4), (int) z)))
																								.getBlock() == Blocks.AIR.getDefaultState()
																										.getBlock())
																						&& (((world.getBlockState(new BlockPos((int) (x - 1),
																								(int) (y + 4), (int) (z - 1))))
																										.getBlock() == Blocks.AIR.getDefaultState()
																												.getBlock())
																								&& (((world.getBlockState(new BlockPos((int) (x - 1),
																										(int) (y + 4), (int) (z - 2))))
																												.getBlock() == Blocks.AIR
																														.getDefaultState().getBlock())
																										&& (((world.getBlockState(new BlockPos(
																												(int) x, (int) (y + 4),
																												(int) (z + 2))))
																														.getBlock() == Blocks.AIR
																																.getDefaultState()
																																.getBlock())
																												&& (((world.getBlockState(
																														new BlockPos((int) x,
																																(int) (y + 4),
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
																																&& (((world
																																		.getBlockState(
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
												&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) z)))
														.getBlock() == Blocks.AIR.getDefaultState().getBlock())
														&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z + 1))))
																.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) z)))
																		.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																		&& (((world.getBlockState(
																				new BlockPos((int) (x - 1), (int) (y + 5), (int) (z - 1))))
																						.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																				&& (((world.getBlockState(
																						new BlockPos((int) x, (int) (y + 5), (int) (z + 2))))
																								.getBlock() == Blocks.AIR.getDefaultState()
																										.getBlock())
																						&& (((world.getBlockState(
																								new BlockPos((int) x, (int) (y + 5), (int) (z + 1))))
																										.getBlock() == Blocks.AIR.getDefaultState()
																												.getBlock())
																								&& (((world.getBlockState(new BlockPos((int) x,
																										(int) (y + 5), (int) z)))
																												.getBlock() == Blocks.AIR
																														.getDefaultState().getBlock())
																										&& (((world.getBlockState(new BlockPos(
																												(int) x, (int) (y + 5),
																												(int) (z - 1))))
																														.getBlock() == Blocks.AIR
																																.getDefaultState()
																																.getBlock())
																												&& (((world.getBlockState(
																														new BlockPos((int) x,
																																(int) (y + 5),
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
																																&& (((world
																																		.getBlockState(
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
																								.getBlock() == Blocks.AIR.getDefaultState()
																										.getBlock())
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
					} else if ((Math.random() <= 0.5)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						if (!world.getWorld().isRemote) {
							Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree2"));
							if (template != null) {
								template.addBlocksToWorld(world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), new PlacementSettings()
										.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
							}
						}
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						if (!world.getWorld().isRemote) {
							Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("michrosia", "michrosiatree3"));
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
}
