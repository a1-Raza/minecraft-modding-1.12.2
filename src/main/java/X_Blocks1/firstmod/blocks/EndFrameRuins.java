package X_Blocks1.firstmod.blocks;

import java.util.Random;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EndFrameRuins extends BlockBase
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public static final AxisAlignedBB END_FRAME_RUINS_AABB = new AxisAlignedBB(0, 0, 0, 0, 0, 0);
	
	public EndFrameRuins(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(5.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 3);
		//this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	// Pulled this directly from the end portal frame class
	/*public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }*/
    
}
