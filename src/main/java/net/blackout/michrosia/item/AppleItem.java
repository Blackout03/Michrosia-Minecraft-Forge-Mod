
package net.blackout.michrosia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.blackout.michrosia.itemgroup.MichrosiaTabItemGroup;
import net.blackout.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class AppleItem extends MichrosiaElements.ModElement {
	@ObjectHolder("michrosia:apple")
	public static final Item block = null;
	public AppleItem(MichrosiaElements instance) {
		super(instance, 113);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MichrosiaTabItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(2.4f).build()));
			setRegistryName("apple");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
