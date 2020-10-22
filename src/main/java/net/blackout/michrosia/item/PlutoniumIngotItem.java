
package net.blackout.michrosia.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.blackout.michrosia.procedures.PlutoniumIngotMobIsHitWithItemProcedure;
import net.blackout.michrosia.itemgroup.MichrosiaTabItemGroup;
import net.blackout.michrosia.MichrosiaModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@MichrosiaModElements.ModElement.Tag
public class PlutoniumIngotItem extends MichrosiaModElements.ModElement {
	@ObjectHolder("michrosia:plutoniumingot")
	public static final Item block = null;
	public PlutoniumIngotItem(MichrosiaModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MichrosiaTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("plutoniumingot");
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

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\\u00A73\\u00A7lRadioactive"));
		}

		@Override
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				PlutoniumIngotMobIsHitWithItemProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
