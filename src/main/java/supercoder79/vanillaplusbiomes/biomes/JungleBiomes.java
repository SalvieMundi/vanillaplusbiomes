package supercoder79.vanillaplusbiomes.biomes;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import supercoder79.vanillaplusbiomes.biomes.api.BiomeTemplate;
import supercoder79.vanillaplusbiomes.biomes.api.TerraformBiomeBuilder;
import supercoder79.vanillaplusbiomes.feature.VanillaPlusConfiguredFeatures;
import supercoder79.vanillaplusbiomes.util.BiomeHelper;

import static supercoder79.vanillaplusbiomes.biomes.api.DefaultFeature.*;

public class JungleBiomes {
    public static BiomeTemplate template = new BiomeTemplate(TerraformBiomeBuilder.create()
            .surfaceBuilder(ConfiguredSurfaceBuilders.GRASS)
            .precipitation(Biome.Precipitation.RAIN)
            .category(Biome.Category.FOREST)
            .depth(0.1F)
            .scale(0.2F)
            .temperature(0.95F)
            .downfall(0.9F)
            .effects(new BiomeEffects.Builder()
                    .waterColor(0x14A2C5)
                    .waterFogColor(0x14A2C5)
                    .foliageColor(0x30BB0B)
                    .grassColor(0x59C93C)
                    .fogColor(12638463)
                    .skyColor(BiomeHelper.getSkyColor(0.95f))
            )
            .addDefaultFeatures(LAND_CARVERS, DEFAULT_UNDERGROUND_STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, JUNGLE_VEGETATION,
                    DEFAULT_FLOWERS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, JUNGLE_GRASS, SPRINGS, BAMBOO, EXTRA_DEFAULT_FLOWERS)
            .addDefaultSpawnEntries()
    );

    public static void register() {
        Biome jungle_clearing = template.builder()
                .addFeature(GenerationStep.Feature.VEGETAL_DECORATION, VanillaPlusConfiguredFeatures.JUNGLE_CLEARING_VEGETATION)
                .build();
        OverworldBiomes.addHillsBiome(BiomeKeys.JUNGLE, BiomeRegistry.register("jungle_clearing", jungle_clearing), 0.5F);
    }
}
