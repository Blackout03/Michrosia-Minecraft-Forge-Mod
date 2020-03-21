package net.blackout.michrosia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.blackout.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class MichrosiaGrassPathEntityWalksOnTheBlockProcedure extends MichrosiaElements.ModElement {
	public MichrosiaGrassPathEntityWalksOnTheBlockProcedure(MichrosiaElements instance) {
		super(instance, 59);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MichrosiaGrassPathEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 3, (int) 1, (false), (false)));
	}
}
