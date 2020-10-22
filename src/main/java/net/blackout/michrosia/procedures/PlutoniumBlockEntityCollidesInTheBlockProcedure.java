package net.blackout.michrosia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class PlutoniumBlockEntityCollidesInTheBlockProcedure extends MichrosiaModElements.ModElement {
	public PlutoniumBlockEntityCollidesInTheBlockProcedure(MichrosiaModElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PlutoniumBlockEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((!(entity instanceof PlayerEntity)) || (!(entity instanceof ServerPlayerEntity)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 3, (true), (false)));
		}
	}
}
