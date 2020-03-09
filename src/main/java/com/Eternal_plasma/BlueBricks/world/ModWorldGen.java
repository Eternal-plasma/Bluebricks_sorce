package com.Eternal_plasma.BlueBricks.world;

import java.util.Random;

import com.Eternal_plasma.BlueBricks.init.ModBlocks;

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
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider) 
	{
		
		if(world.provider.getDimension() == -1) 
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkgenerator, chunkprovider);
		}
		
		
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider) 
	{
		generateOre(ModBlocks.WARPED_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 10);
		
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances ) 
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) 
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generateor = new WorldGenMinable(ore,size,BlockMatcher.forBlock(Blocks.NETHERRACK));
			generateor.generate(world, random, pos);
		}
		
		
	}
	
	
	
	
}
