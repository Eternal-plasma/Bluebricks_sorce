package com.Eternal_plasma.BlueBricks.init;

import java.util.ArrayList;
import java.util.List;

import com.Eternal_plasma.BlueBricks.blocks.Warped_ore;
import com.Eternal_plasma.BlueBricks.blocks.warped_brick_block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block WARPED_BRICK_BLOCK = new warped_brick_block("warped_brick_block", Material.ROCK);
	public static final Block WARPED_ORE = new Warped_ore("warped_ore", Material.ROCK); //Warped_ore
	
}
