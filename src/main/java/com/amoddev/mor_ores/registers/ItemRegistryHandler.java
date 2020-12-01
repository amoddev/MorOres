package com.amoddev.mor_ores.registers;

import com.amoddev.mor_ores.MorOres;
import com.amoddev.mor_ores.items.CopperChunk;
import com.amoddev.mor_ores.items.CopperChunkLow;
import com.amoddev.mor_ores.items.CopperChunkMid;
import com.amoddev.mor_ores.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MorOres.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //items
    //copper
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", ItemBase::new);
    public static final RegistryObject<CopperChunk> COPPER_CHUNK = ITEMS.register("copper_chunk",()-> new CopperChunk(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> COPPER_CHUNK_MID = ITEMS.register("copper_chunk_mid", ()-> new CopperChunkMid(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> COPPER_CHUNK_LOW = ITEMS.register("copper_chunk_low", ()-> new CopperChunkLow(new Item.Properties().group(ItemGroup.MISC)));
    //tin
    public static final RegistryObject<Item> TIN = ITEMS.register("tin", ItemBase::new);
    public static final RegistryObject<Item> TIN_CHUNK = ITEMS.register("tin_chunk", ItemBase::new);
    public static final RegistryObject<Item> TIN_CHUNK_MID = ITEMS.register("tin_chunk_mid", ItemBase::new);
    public static final RegistryObject<Item> TIN_CHUNK_LOW = ITEMS.register("tin_chunk_low", ItemBase::new);


    public static final RegistryObject<Item> ZINC = ITEMS.register("zinc", ItemBase::new);
    public static final RegistryObject<Item> ZINC_CHUNK = ITEMS.register("zinc_chunk", ItemBase::new);
    public static final RegistryObject<Item> ZINC_CHUNK_MID = ITEMS.register("zinc_chunk_mid", ItemBase::new);
    public static final RegistryObject<Item> ZINC_CHUNK_LOW = ITEMS.register("zinc_chunk_low", ItemBase::new);
//high
    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth", ItemBase::new);
    public static final RegistryObject<Item> BISMUTH_CHUNK = ITEMS.register("bismuth_chunk", ItemBase::new);
    public static final RegistryObject<Item> BISMUTH_CHUNK_MID = ITEMS.register("bismuth_chunk_mid", ItemBase::new);
    public static final RegistryObject<Item> BISMUTH_CHUNK_LOW = ITEMS.register("bismuth_chunk_low", ItemBase::new);
//high
    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium", ItemBase::new);
    public static final RegistryObject<Item> ALUMINIUM_CHUNK = ITEMS.register("aluminium_chunk", ItemBase::new);
    public static final RegistryObject<Item> ALUMINIUM_CHUNK_MID = ITEMS.register("aluminium_chunk_mid", ItemBase::new);
    public static final RegistryObject<Item> ALUMINIUM_CHUNK_LOW = ITEMS.register("aluminium_chunk_low", ItemBase::new);

    //grind coal for graphite
    public static final RegistryObject<Item> GRAPHITE  = ITEMS.register("graphite", ItemBase::new);

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", ItemBase::new);
//high
    public static final RegistryObject<Item> MAGNETITE = ITEMS.register("magnetite", ItemBase::new);
    public static final RegistryObject<Item> MAGNETITE_CHUNK = ITEMS.register("magnetite_chunk", ItemBase::new);
    public static final RegistryObject<Item> MAGNETITE_CHUNK_MID = ITEMS.register("magnetite_chunk_mid", ItemBase::new);
    public static final RegistryObject<Item> MAGNETITE_CHUNK_LOW = ITEMS.register("magnetite_chunk_low", ItemBase::new);


}
