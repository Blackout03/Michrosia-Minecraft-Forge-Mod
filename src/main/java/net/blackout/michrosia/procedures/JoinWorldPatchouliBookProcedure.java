package net.blackout.michrosia.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.blackout.michrosia.MichrosiaVariables;
import net.blackout.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class JoinWorldPatchouliBookProcedure extends MichrosiaElements.ModElement {
	public JoinWorldPatchouliBookProcedure(MichrosiaElements instance) {
		super(instance, 108);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure JoinWorldPatchouliBook!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JoinWorldPatchouliBook!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((MichrosiaVariables.WorldVariables.get(world).First_Join) == (true))) {
			if (!world.isRemote && world.getServer() != null) {
				world.getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
						"/give @p patchouli:guide_book{\"patchouli:book\":\"michrosia:michrosia_guide\"}");
			}
			MichrosiaVariables.WorldVariables.get(world).First_Join = (boolean) (false);
			MichrosiaVariables.WorldVariables.get(world).syncData(world);
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.getPlayer();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", (int) entity.posX);
		dependencies.put("y", (int) entity.posY);
		dependencies.put("z", (int) entity.posZ);
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
