package net.blackout.michrosia.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.blackout.michrosia.MichrosiaModVariables;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;
import java.util.HashMap;

@MichrosiaModElements.ModElement.Tag
public class ThankYouMessageProcedure extends MichrosiaModElements.ModElement {
	public ThankYouMessageProcedure(MichrosiaModElements instance) {
		super(instance, 104);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ThankYouMessage!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(MichrosiaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MichrosiaModVariables.PlayerVariables())).playerFirstJoin1) == (true))) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Thank You for"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("playing my Mod,"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Michrosia! - Blackout03"), (false));
			}
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(MichrosiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.playerFirstJoin1 = _setval;
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
