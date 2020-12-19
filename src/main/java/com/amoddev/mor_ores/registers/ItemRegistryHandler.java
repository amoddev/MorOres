package com.amoddev.mor_ores.registers;

import com.amoddev.mor_ores.MorOres;
import com.amoddev.mor_ores.items.*;
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
    public static final RegistryObject<Item> COPPER_NUG = ITEMS.register("copper_nug", ItemBase::new);

    //tin
    public static final RegistryObject<Item> TIN = ITEMS.register("tin", ItemBase::new);
    public static final RegistryObject<Item> TIN_CHUNK = ITEMS.register("tin_chunk",()-> new TinChunk(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> TIN_CHUNK_MID = ITEMS.register("tin_chunk_mid", ()-> new TinChunkMid(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> TIN_CHUNK_LOW = ITEMS.register("tin_chunk_low", ()-> new TinChunkLow(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> TIN_NUG = ITEMS.register("tin_nug", ItemBase::new);

    public static final RegistryObject<Item> ZINC = ITEMS.register("zinc", ItemBase::new);
    public static final RegistryObject<Item> ZINC_CHUNK = ITEMS.register("zinc_chunk", ()-> new ZincChunk(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ZINC_CHUNK_MID = ITEMS.register("zinc_chunk_mid", ()-> new ZincChunkMid(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ZINC_CHUNK_LOW = ITEMS.register("zinc_chunk_low", ()-> new ZincChunkLow(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ZINC_NUG = ITEMS.register("zinc_nug", ItemBase::new);

    //high
    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth", ItemBase::new);
    public static final RegistryObject<Item> BISMUTH_CHUNK = ITEMS.register("bismuth_chunk", ()-> new BismuthChunk(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BISMUTH_CHUNK_MID = ITEMS.register("bismuth_chunk_mid",  ()-> new BismuthChunkMid(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BISMUTH_CHUNK_LOW = ITEMS.register("bismuth_chunk_low",  ()-> new BismuthChunkLow(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BISMUTH_NUG = ITEMS.register("bismuth_nug", ItemBase::new);

    //high
    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium", ItemBase::new);
    public static final RegistryObject<Item> ALUMINIUM_CHUNK = ITEMS.register("aluminium_chunk",  ()-> new AluminiumChunk(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_CHUNK_MID = ITEMS.register("aluminium_chunk_mid", ()-> new AluminiumChunkMid(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_CHUNK_LOW = ITEMS.register("aluminium_chunk_low", ()-> new AluminiumChunkLow(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_NUG = ITEMS.register("aluminium_nug", ItemBase::new);

    //grind coal for graphite
    public static final RegistryObject<Item> GRAPHITE  = ITEMS.register("graphite", ItemBase::new);

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", ItemBase::new);
//high
    public static final RegistryObject<Item> MAGNETITE = ITEMS.register("magnetite", ItemBase::new);
    public static final RegistryObject<Item> MAGNETITE_CHUNK = ITEMS.register("magnetite_chunk", ()-> new MagnetiteChunk(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MAGNETITE_CHUNK_MID = ITEMS.register("magnetite_chunk_mid", ()-> new MagnetiteChunkMid(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MAGNETITE_CHUNK_LOW = ITEMS.register("magnetite_chunk_low", ()-> new MagnetiteChunkLow(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MAGNETITE_NUG = ITEMS.register("magnetite_nug", ItemBase::new);

}
