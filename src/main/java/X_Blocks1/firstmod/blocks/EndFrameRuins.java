package X_Blocks1.firstmod.blocks;

import java.util.Random;

import X_Blocks1.firstmod.Main;
import X_Blocks1.firstmod.init.ModBlocks;
import X_Blocks1.firstmod.init.ModItems;
import X_Blocks1.firstmod.util.IHasModel;
import X_Blocks1.firstmod.util.Reference;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EndFrameRuins extends BlockDirectional
{
	public static final AxisAlignedBB END_FRAME_RUINS_AABB = new AxisAlignedBB(0, 0, 0, 1, 0.8125D, 1);
	
	// Block General Properties
	public EndFrameRuins(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(5.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	// Block Hitbox and Texture
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
		
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return END_FRAME_RUINS_AABB;
	}
}
