package X_Blocks1.firstmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.ENDER_ORE, new ItemStack(ModItems.ENDER_INGOT, 1), 1.0f);
	}
	
}
