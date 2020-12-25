package X_Blocks1.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import X_Blocks1.firstmod.items.ItemBase;
import X_Blocks1.firstmod.items.tools.ToolAxe;
import X_Blocks1.firstmod.items.tools.ToolHoe;
import X_Blocks1.firstmod.items.tools.ToolPickaxe;
import X_Blocks1.firstmod.items.tools.ToolSpade;
import X_Blocks1.firstmod.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_ENDER_INGOT = EnumHelper.addToolMaterial("material_ender_ingot", 3, 500, 12.0F, 4.5F, 10);
	
	//Items
	public static final Item ENDER_INGOT = new ItemBase("ender_ingot");
	
	//Tools
	public static final ItemSword ENDER_SWORD = new ToolSword("ender_sword", MATERIAL_ENDER_INGOT);
	public static final ItemSpade ENDER_SHOVEL = new ToolSpade("ender_shovel", MATERIAL_ENDER_INGOT);
	public static final ItemPickaxe ENDER_PICKAXE = new ToolPickaxe("ender_pickaxe", MATERIAL_ENDER_INGOT);
	public static final ItemAxe ENDER_AXE = new ToolAxe("ender_axe", MATERIAL_ENDER_INGOT);
	public static final ItemHoe ENDER_HOE = new ToolHoe("ender_hoe", MATERIAL_ENDER_INGOT);
}
