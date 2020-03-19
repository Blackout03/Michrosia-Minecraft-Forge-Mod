package net.mcreator.michrosia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class PlutoniumIngotItemInInventoryTickProcedure extends MichrosiaElements.ModElement {
	public PlutoniumIngotItemInInventoryTickProcedure(MichrosiaElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlutoniumIngotItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 15, (int) 5, (false), (false)));
	}
}
