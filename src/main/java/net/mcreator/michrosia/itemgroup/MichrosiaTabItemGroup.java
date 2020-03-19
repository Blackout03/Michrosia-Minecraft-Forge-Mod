
package net.mcreator.michrosia.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.michrosia.block.MichrosiaGrassBlock;
import net.mcreator.michrosia.MichrosiaElements;

@MichrosiaElements.ModElement.Tag
public class MichrosiaTabItemGroup extends MichrosiaElements.ModElement {
	public MichrosiaTabItemGroup(MichrosiaElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmichrosiatab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MichrosiaGrassBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
