package net.blackout.michrosia.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.blackout.michrosia.MichrosiaModVariables;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

@MichrosiaModElements.ModElement.Tag
public class JoinWorldMichrosiaAdvancementProcedure extends MichrosiaModElements.ModElement {
	public JoinWorldMichrosiaAdvancementProcedure(MichrosiaModElements instance) {
		super(instance, 106);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure JoinWorldMichrosiaAdvancement!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(MichrosiaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MichrosiaModVariables.PlayerVariables())).playerFirstJoin2) == (true))) {
			if (entity instanceof ServerPlayerEntity) {
				Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
						.getAdvancement(new ResourceLocation("michrosia:advancementjoinworldmichrosia"));
				AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(MichrosiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.playerFirstJoin2 = _setval;
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
