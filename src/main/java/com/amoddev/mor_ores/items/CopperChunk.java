package com.amoddev.mor_ores.items;

import com.amoddev.mor_ores.handlers.KeyboardHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CopperChunk extends Item {

    public CopperChunk(Properties properties) {
        super(new Item.Properties().group(ItemGroup.MISC));
    }

    @Override
    public void addInformation(ItemStack stack,World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        if(KeyboardHandler.isHoldingAlt()){
            tooltip.add(new StringTextComponent("Quality:"+"\u00A7f"+" High"+"\u00A7a"));
        }else{
            tooltip.add(new StringTextComponent("Press ALT for more info"));
        }

        super.addInformation(stack,worldIn,tooltip,flagIn);
    }
}
