package net.blackout.michrosia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;

@MichrosiaModElements.ModElement.Tag
public class MichrosiaGrassPathEntityWalksOnTheBlockProcedure extends MichrosiaModElements.ModElement {
	public MichrosiaGrassPathEntityWalksOnTheBlockProcedure(MichrosiaModElements instance) {
		super(instance, 59);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MichrosiaGrassPathEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 3, (int) 1, (false), (false)));
	}
}
