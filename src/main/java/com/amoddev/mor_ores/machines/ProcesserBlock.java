package com.amoddev.mor_ores.machines;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.FurnaceTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class ProcesserBlock extends AbstractFurnaceBlock {
    public ProcesserBlock(Block.Properties builder) {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f,2.0f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE));
    }


    @Override
    protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if (tileentity instanceof FurnaceTileEntity) {
          // put stuff here if you want to have stuff activated when interacted with
        }
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new ProcesserTileEntity();
    }

}
