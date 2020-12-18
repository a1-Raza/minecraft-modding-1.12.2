package X_Blocks1.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import X_Blocks1.firstmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RIGID_ENDSTONE = new BlockBase("rigid_endstone", Material.IRON);
	
}
