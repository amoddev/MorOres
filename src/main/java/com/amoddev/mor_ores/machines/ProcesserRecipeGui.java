package com.amoddev.mor_ores.machines;

import net.minecraft.client.gui.recipebook.AbstractRecipeBookGui;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Set;

@OnlyIn(Dist.CLIENT)
public class ProcesserRecipeGui extends AbstractRecipeBookGui {
    protected boolean func_212962_b() {
        return this.recipeBook.isFurnaceFilteringCraftable();
    }

    protected void func_212959_a(boolean p_212959_1_) {
        this.recipeBook.setFurnaceFilteringCraftable(p_212959_1_);
    }

    protected boolean func_212963_d() {
        return this.recipeBook.isFurnaceGuiOpen();
    }

    protected void func_212957_c(boolean p_212957_1_) {
        this.recipeBook.setFurnaceGuiOpen(p_212957_1_);
    }

    protected String func_212960_g() {
        return "gui.recipebook.toggleRecipes.smeltable";
    }

    protected Set<Item> func_212958_h() {
        return AbstractFurnaceTileEntity.getBurnTimes().keySet();
    }
}