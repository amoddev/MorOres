package com.amoddev.mor_ores.registers;

import com.amoddev.mor_ores.MorOres;
import com.amoddev.mor_ores.blocks.BlockItemBase;
import com.amoddev.mor_ores.blocks.StoneHigh;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

    public static final RegistryObject<Item> STONE_HIGH_ITEM = ITEMS.register("stone_high",()-> new BlockItemBase(STONE_HIGH.get()));
}
