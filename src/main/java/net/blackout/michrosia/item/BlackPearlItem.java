
package net.blackout.michrosia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.blackout.michrosia.itemgroup.MichrosiaTabItemGroup;
import net.blackout.michrosia.MichrosiaModElements;

@MichrosiaModElements.ModElement.Tag
public class BlackPearlItem extends MichrosiaModElements.ModElement {
	@ObjectHolder("michrosia:black_pearl")
	public static final Item block = null;
	public BlackPearlItem(MichrosiaModElements instance) {
		super(instance, 130);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MichrosiaTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("black_pearl");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
