
package net.blackout.michrosia.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.blackout.michrosia.block.MichrosiaGrassBlock;
import net.blackout.michrosia.MichrosiaModElements;

@MichrosiaModElements.ModElement.Tag
public class MichrosiaTabItemGroup extends MichrosiaModElements.ModElement {
	public MichrosiaTabItemGroup(MichrosiaModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmichrosia") {
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
