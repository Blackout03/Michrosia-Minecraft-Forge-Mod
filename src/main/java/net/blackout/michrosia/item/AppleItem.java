
package net.blackout.michrosia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.blackout.michrosia.itemgroup.MichrosiaTabItemGroup;
import net.blackout.michrosia.MichrosiaModElements;

@MichrosiaModElements.ModElement.Tag
public class AppleItem extends MichrosiaModElements.ModElement {
	@ObjectHolder("michrosia:apple")
	public static final Item block = null;
	public AppleItem(MichrosiaModElements instance) {
		super(instance, 113);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MichrosiaTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(2.4f).build()));
			setRegistryName("apple");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
