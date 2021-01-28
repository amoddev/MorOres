package com.amoddev.mor_ores.machines;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ProcesserTileEntity extends AbstractFurnaceTileEntity {

    protected ProcesserTileEntity() {
        super(TileEntityType.FURNACE, IRecipeType.SMELTING);
    }

    @Override
    protected ITextComponent getDefaultName() {                     // \/ or .furnace
        return new TranslationTextComponent("container.processer");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new FurnaceContainer(id, player, this, this.furnaceData);
    }
}
