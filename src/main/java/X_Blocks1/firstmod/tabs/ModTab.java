package X_Blocks1.firstmod.tabs;

import X_Blocks1.firstmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs
{
	public ModTab(String label)
	{
		super("modtab");
		this.setBackgroundImageName("modtab.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.ENDER_INGOT);
	}
}
