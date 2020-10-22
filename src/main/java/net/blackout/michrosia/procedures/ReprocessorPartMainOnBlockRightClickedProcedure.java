package net.blackout.michrosia.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.state.DirectionProperty;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.blackout.michrosia.block.ReprocessorPartMainBlock;
import net.blackout.michrosia.block.ReprocessorPartBlock;
import net.blackout.michrosia.block.ReprocessorBlock;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

@MichrosiaModElements.ModElement.Tag
public class ReprocessorPartMainOnBlockRightClickedProcedure extends MichrosiaModElements.ModElement {
	public ReprocessorPartMainOnBlockRightClickedProcedure(MichrosiaModElements instance) {
		super(instance, 40);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure ReprocessorPartMainOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ReprocessorPartMainBlock.block.getDefaultState()
				.getBlock())) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())) {
				if (((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ReprocessorPartBlock.block
							.getDefaultState().getBlock())
							&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == ReprocessorPartBlock.block
									.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReprocessorBlock.block.getDefaultState(), 3);
						try {
							BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
						} catch (Exception e) {
						}
					}
				}
				if (((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ReprocessorPartBlock.block
							.getDefaultState().getBlock())
							&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == ReprocessorPartBlock.block
									.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReprocessorBlock.block.getDefaultState(), 3);
						try {
							BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
						} catch (Exception e) {
						}
					}
				}
				if (((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ReprocessorPartBlock.block
							.getDefaultState().getBlock())
							&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == ReprocessorPartBlock.block
									.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReprocessorBlock.block.getDefaultState(), 3);
						try {
							BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
						} catch (Exception e) {
						}
					}
				}
				if (((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST)) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ReprocessorPartBlock.block
							.getDefaultState().getBlock())
							&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == ReprocessorPartBlock.block
									.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReprocessorBlock.block.getDefaultState(), 3);
						try {
							BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
						} catch (Exception e) {
						}
					}
				}
				if ((((entity instanceof ServerPlayerEntity) && (entity.world instanceof ServerWorld))
						? ((ServerPlayerEntity) entity).getAdvancements()
								.getProgress(((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
										.getAdvancement(new ResourceLocation("michrosia:advancementcraftreprocessorpart")))
								.isDone()
						: false)) {
					if (entity instanceof ServerPlayerEntity) {
						Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
								.getAdvancement(new ResourceLocation("michrosia:advancementbuildthereprocessor"));
						AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemaningCriteria().iterator();
							while (_iterator.hasNext()) {
								String _criterion = (String) _iterator.next();
								((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
							}
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		PlayerEntity entity = event.getPlayer();
		if (event.getHand() != entity.getActiveHand())
			return;
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
