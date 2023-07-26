package putridnonsense.hospitality.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import putridnonsense.hospitality.Hospitality;

public class ModBiomeModification {
    public static void registerBiomeModificationLog() {Hospitality.LOGGER.info("HOSPITALITY: Registering Biome Modifications...");}

    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Hospitality.MOD_ID,"ore_silver"));
    public static final RegistryKey<PlacedFeature> EXTRA_SILVER_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Hospitality.MOD_ID,"ore_silver_extra"));
}
