package X_Blocks1.firstmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EnderOre extends BlockBase
{
	
	public EnderOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
		//setLightOpacity(0.1);
		//setBlockUnbreakable();
	}

}
