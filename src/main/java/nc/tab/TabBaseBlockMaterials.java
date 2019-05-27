package nc.tab;

import nc.init.NCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBaseBlockMaterials extends CreativeTabs {

	public TabBaseBlockMaterials() {
		super("nuclearcraftBaseBlockMaterials");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(NCBlocks.ore, 1, 2);
	}
}
