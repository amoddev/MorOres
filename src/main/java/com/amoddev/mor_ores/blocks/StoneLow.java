package com.amoddev.mor_ores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StoneLow extends Block {

    public StoneLow() {
        super(
                Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f,2.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );
    }


}
