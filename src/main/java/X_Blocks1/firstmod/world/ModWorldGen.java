package X_Blocks1.firstmod.world;

import java.util.Random;

import X_Blocks1.firstmod.init.ModBlocks;
import X_Blocks1.firstmod.world.WorldGenEndMinable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
		case 0:
			break;
		case 1:
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			break;
		case -1:
			break;
		}
		/*
		if (world.provider.getDimension() == 0)
		{
			//generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
<<<<<<< HEAD
			//generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		if (world.provider.getDimension() == 1)
		{
=======
>>>>>>> 5e524f0 (WIP10.0: created WorldGenEndMinable class in attempt to get ender ore to generate in the end)
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		*/
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.ENDER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 15, random.nextInt(4) + 1, 4);
	}
	
	//NEW
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateEndOre(ModBlocks.ENDER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 255, random.nextInt(4) + 1, 100);
	}
	
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	
	//NEW
	private void generateEndOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			//WorldGenEndMinable generator = new WorldGenEndMinable(ore, size);
			WorldGenMinable endGenerator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.END_STONE));
			endGenerator.generate(world, random, pos);
		}
	}
	
}
