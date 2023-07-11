package putridnonsense.hospitality;

import net.fabricmc.api.ModInitializer;

import org.slf4j.*;
import putridnonsense.hospitality.block.*;
import putridnonsense.hospitality.item.*;

public class Hospitality implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("hospitality");
	public static final String MOD_ID = "hospitality";

	//TODO: MAKE CHAIRS A CUSTOM CLASS https://fabricmc.net/wiki/tutorial:blocks#creating_a_custom_block_class

	@Override
	public void onInitialize() {
		//For Logs
		ModBlocks.registerBlockLog();

		ModItems.registerItemLog();

		CreativeTabs.registerTabItems();
	}
}