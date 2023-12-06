package putridnonsense.hospitality;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.*;
import putridnonsense.hospitality.block.*;
import putridnonsense.hospitality.economy.Pool;
import putridnonsense.hospitality.item.*;

public class Hospitality implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("hospitality");
	public static final String MOD_ID = "hospitality";

	public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"ore_silver"));
	public static final RegistryKey<PlacedFeature> SILVER_ORE_BURIED_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"ore_silver_extra"));

	@Override
	public void onInitialize() {
		//For Logs
		ModBlocks.registerBlockLog();

		ModItems.registerItemLog();

		CreativeTabs.registerTabItems();

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SILVER_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SILVER_ORE_BURIED_PLACED_KEY);

/*
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			// You can see we use the function getServer() that's on the player.
			Pool serverState = Pool.getServerState(handler.player.world.getServer());


			// Sending the packet to the player (look at the networking page for more information)
			PacketByteBuf data = PacketByteBufs.create();
			data.writeInt(Pool.ServerPool);
			ServerPlayNetworking.send(handler.player, NetworkingMessages.CRAFTED_FURNACES, data);
		});
 */
	}
}