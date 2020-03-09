package com.Eternal_plasma.BlueBricks.blocks;

import java.util.Random;

import com.Eternal_plasma.BlueBricks.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class Warped_ore extends BlockBase
{
public Warped_ore(String name, Material material) 
   {
	super(name, material);
	setSoundType(SoundType.STONE);
	setHardness(2.0f);
	setResistance(900.0F);
	setHarvestLevel("pickaxe", 2);
	setLightLevel(1.0f);
   }

   @Override
   public Item getItemDropped(IBlockState state, Random rand, int fortune) 
   {
	   return ModItems.WARPED_BRICK;
   }
   
   @Override
   public int quantityDropped(Random rand) 
   {
	 return 3;
	   
   }
   
   
   

}
