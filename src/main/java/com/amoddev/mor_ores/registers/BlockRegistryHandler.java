package com.amoddev.mor_ores.registers;

import com.amoddev.mor_ores.MorOres;
import com.amoddev.mor_ores.blocks.BlockItemBase;
import com.amoddev.mor_ores.blocks.StoneHigh;
import com.amoddev.mor_ores.blocks.StoneLow;
import com.amoddev.mor_ores.machines.ProcesserBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistryHandler {

    public static final DeferredRegister BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MorOres.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MorOres.MOD_ID);

    public static void init(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> STONE_HIGH = BLOCKS.register("stone_high", StoneHigh::new);
    public static final RegistryObject<Block> STONE_LOW = BLOCKS.register("stone_low", StoneLow::new);
    public static final RegistryObject<Block> PROCESSER = BLOCKS.register("processer", ()-> new ProcesserBlock(
            Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,2.0f)
            .sound(SoundType.STONE)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Item> STONE_HIGH_ITEM = ITEMS.register("stone_high",()-> new BlockItemBase(STONE_HIGH.get()));
    public static final RegistryObject<Item> STONE_LOW_ITEM = ITEMS.register("stone_low",()-> new BlockItemBase(STONE_LOW.get()));
    public static final RegistryObject<Item> PROCESSER_ITEM = ITEMS.register("processer",()-> new BlockItemBase(PROCESSER.get()));
}
