package com.amoddev.mor_ores.world.gen;

import com.amoddev.mor_ores.MorOres;
import com.amoddev.mor_ores.registers.BlockRegistryHandler;
import com.google.common.eventbus.Subscribe;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MorOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorOreGen {
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){
        for (Biome biome : ForgeRegistries.BIOMES){
            genOre(biome,32, 1,5,155,OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistryHandler.STONE_HIGH.get().getDefaultState(),16);
        }
    }
    private static void genOre(Biome biome, int count,int bottomOffset ,int topOffset, int max, OreFeatureConfig.FillerBlockType fillerBlockType, BlockState defautBlockstate,int size){
        CountRangeConfig rangeConfig = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(fillerBlockType, defautBlockstate, size);
        ConfiguredPlacement configuredPlacement = Placement.COUNT_RANGE.configure(rangeConfig);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement));

    }
}
