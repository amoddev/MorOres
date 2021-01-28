package com.amoddev.mor_ores.machines;

import net.minecraft.client.gui.recipebook.AbstractRecipeBookGui;
import net.minecraft.client.gui.recipebook.FurnaceRecipeGui;
import net.minecraft.client.gui.screen.inventory.AbstractFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ProcesserScreen extends AbstractFurnaceScreen<FurnaceContainer> {
    private static final ResourceLocation PROCESSER_GUI_TEXTURES = new ResourceLocation("textures/gui/processer.png");

    public ProcesserScreen(FurnaceContainer p_i51089_1_, PlayerInventory p_i51089_2_, ITextComponent p_i51089_3_) {
        super(p_i51089_1_, new FurnaceRecipeGui(), p_i51089_2_, p_i51089_3_, PROCESSER_GUI_TEXTURES);
    }


}