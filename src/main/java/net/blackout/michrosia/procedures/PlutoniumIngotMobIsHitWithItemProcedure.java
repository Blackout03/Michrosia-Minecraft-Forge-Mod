package net.blackout.michrosia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class PlutoniumIngotMobIsHitWithItemProcedure extends MichrosiaModElements.ModElement {
	public PlutoniumIngotMobIsHitWithItemProcedure(MichrosiaModElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PlutoniumIngotMobIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 40, (int) 0, (true), (false)));
	}
}
