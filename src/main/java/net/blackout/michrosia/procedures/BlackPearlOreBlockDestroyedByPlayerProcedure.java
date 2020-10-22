package net.blackout.michrosia.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.blackout.michrosia.item.BlackPearlItem;
import net.blackout.michrosia.block.BlackPearlOreBlock;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class BlackPearlOreBlockDestroyedByPlayerProcedure extends MichrosiaModElements.ModElement {
	public BlackPearlOreBlockDestroyedByPlayerProcedure(MichrosiaModElements instance) {
		super(instance, 131);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BlackPearlOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure BlackPearlOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure BlackPearlOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure BlackPearlOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure BlackPearlOreBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack MainHand = ItemStack.EMPTY;
		MainHand = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
		if ((!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)))) {
			if (((!((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, /* @ItemStack */(MainHand)) != 0)))
					|| (!((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, /* @ItemStack */(MainHand)) != 0))))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if ((Math.random() >= 0.5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if ((Math.random() >= 0.25)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, (MainHand))) == 1)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if ((Math.random() >= 0.75)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if ((Math.random() >= 0.5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, (MainHand))) == 2)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if ((Math.random() >= 0.75)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if ((Math.random() >= 0.5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, (MainHand))) == 3)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if ((Math.random() >= 0.75)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if ((Math.random() >= 0.5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if ((Math.random() >= 0.25)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, /* @ItemStack */(MainHand)) != 0))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlackPearlOreBlock.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
