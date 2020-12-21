package X_Blocks1.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import X_Blocks1.firstmod.blocks.BlockBase;
import X_Blocks1.firstmod.blocks.EnderOre;
import X_Blocks1.firstmod.blocks.RigidEndstone;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RIGID_ENDSTONE = new RigidEndstone("rigid_endstone", Material.IRON);
	
	public static final Block ENDER_ORE = new EnderOre("ender_ore", Material.ROCK);
	
}
