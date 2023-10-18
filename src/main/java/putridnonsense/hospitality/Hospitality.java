package putridnonsense.hospitality;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.networking.v1.*;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.*;
import putridnonsense.hospitality.block.*;
import putridnonsense.hospitality.economy.Pool;
import putridnonsense.hospitality.item.*;
import putridnonsense.hospitality.world.ModBiomeModification;

import static net.minecraft.registry.tag.BiomeTags.*;
import static putridnonsense.hospitality.world.ModBiomeModification.*;

public class Hospitality implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("hospitality");
	public static final String MOD_ID = "hospitality";

	@Override
	public void onInitialize() {
		//For Logs
		ModBlocks.registerBlockLog();

		ModItems.registerItemLog();

		CreativeTabs.registerTabItems();

		ModBiomeModification.registerBiomeModificationLog();

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SILVER_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.tag(IS_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, EXTRA_SILVER_ORE_PLACED_KEY);
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