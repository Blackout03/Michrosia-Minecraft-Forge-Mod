package net.blackout.michrosia.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.blackout.michrosia.MichrosiaModVariables;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;
import java.util.HashMap;

@MichrosiaModElements.ModElement.Tag
public class JoinWorldPatchouliBookProcedure extends MichrosiaModElements.ModElement {
	public JoinWorldPatchouliBookProcedure(MichrosiaModElements instance) {
		super(instance, 108);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure JoinWorldPatchouliBook!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(MichrosiaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MichrosiaModVariables.PlayerVariables())).playerFirstJoin3) == (true))) {
			if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
				world.getWorld().getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
						"give @p patchouli:guide_book{\"patchouli:book\":\"michrosia:michrosia_guide\"}");
			}
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(MichrosiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.playerFirstJoin3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.getPlayer();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", entity.getPosX());
		dependencies.put("y", entity.getPosY());
		dependencies.put("z", entity.getPosZ());
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
