package com.Eternal_plasma.BlueBricks.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class warped_brick_block extends BlockBase
{

	public warped_brick_block(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(900.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
	}

}
