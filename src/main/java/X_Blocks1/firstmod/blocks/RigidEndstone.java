package X_Blocks1.firstmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RigidEndstone extends BlockBase
{

	public RigidEndstone(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(75.0F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(7.5F);
		//setLightOpacity(0.1);
		//setBlockUnbreakable();
	}
	
}
