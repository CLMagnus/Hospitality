package putridnonsense.hospitality.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

import static net.minecraft.item.Items.*;
import static putridnonsense.hospitality.block.ModBlocks.*;
import static putridnonsense.hospitality.item.ModItems.*;

public class CreativeTabs {
    public static void registerTabItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            //Tables and Chairs
            content.addAfter(OAK_BUTTON, OAK_CHAIR);
            content.addAfter(OAK_CHAIR, OAK_TABLE);
            content.addAfter(SPRUCE_BUTTON, SPRUCE_TABLE);
            content.addAfter(BIRCH_BUTTON, BIRCH_TABLE);
            content.addAfter(JUNGLE_BUTTON, JUNGLE_TABLE);
            content.addAfter(ACACIA_BUTTON, ACACIA_TABLE);
            content.addAfter(DARK_OAK_BUTTON, DARK_OAK_TABLE);
            content.addAfter(MANGROVE_BUTTON, MANGROVE_TABLE);
            content.addAfter(CRIMSON_BUTTON, CRIMSON_TABLE);
            content.addAfter(WARPED_BUTTON, WARPED_TABLE);

            //Parity
            content.addAfter(CHAIN, LANTERN);
            content.addAfter(LANTERN, SOUL_LANTERN);

            //Netherite
            content.addAfter(NETHERITE_BLOCK, NETHERITE_BLOCK_STAIRS);
            content.addAfter(NETHERITE_BLOCK_STAIRS, NETHERITE_BLOCK_SLAB);
            content.addAfter(NETHERITE_BLOCK_SLAB, NETHERITE_BARS);
            content.addAfter(NETHERITE_BARS, NETHERITE_DOOR);
            content.addAfter(NETHERITE_DOOR, NETHERITE_TRAPDOOR);
            content.addAfter(NETHERITE_TRAPDOOR, NETHERITE_CHAIN);
            content.addAfter(NETHERITE_CHAIN, NETHERITE_LANTERN);
            content.addAfter(NETHERITE_LANTERN, NETHERITE_SOUL_LANTERN);

            //Gold
            content.addAfter(GOLD_BLOCK, GOLD_BLOCK_STAIRS);
            content.addAfter(GOLD_BLOCK_STAIRS, GOLD_BLOCK_SLAB);
            content.addAfter(GOLD_BLOCK_SLAB, GOLD_BARS);
            content.addAfter(GOLD_BARS, GOLD_DOOR);
            content.addAfter(GOLD_DOOR, GOLD_TRAPDOOR);
            content.addAfter(LIGHT_WEIGHTED_PRESSURE_PLATE, GOLD_CHAIN);
            content.addAfter(GOLD_CHAIN, GOLD_LANTERN);
            content.addAfter(GOLD_LANTERN, GOLD_SOUL_LANTERN);

            //Silver
            content.addAfter(GOLD_SOUL_LANTERN, SILVER_BLOCK);
            content.addAfter(SILVER_BLOCK, SILVER_BLOCK_STAIRS);
            content.addAfter(SILVER_BLOCK_STAIRS, SILVER_BLOCK_SLAB);
            content.addAfter(SILVER_BLOCK_SLAB, SILVER_BARS);
            content.addAfter(SILVER_BARS, SILVER_DOOR);
            content.addAfter(SILVER_DOOR, SILVER_TRAPDOOR);
            content.addAfter(SILVER_TRAPDOOR, SILVER_CHAIN);
            content.addAfter(SILVER_CHAIN, SILVER_LANTERN);
            content.addAfter(SILVER_LANTERN, SILVER_SOUL_LANTERN);

            //Iron
            content.addAfter(IRON_BLOCK, IRON_BLOCK_STAIRS);
            content.addAfter(IRON_BLOCK_STAIRS, IRON_BLOCK_SLAB);

            //Diamond
            content.addAfter(DIAMOND_BLOCK, DIAMOND_BLOCK_STAIRS);
            content.addAfter(DIAMOND_BLOCK_STAIRS, DIAMOND_BLOCK_SLAB);

            //Emerald
            content.addAfter(EMERALD_BLOCK, EMERALD_BLOCK_STAIRS);
            content.addAfter(EMERALD_BLOCK_STAIRS, EMERALD_BLOCK_SLAB);

            //Copper
            content.addAfter(COPPER_BLOCK, COPPER_BLOCK_STAIRS);
            content.addAfter(COPPER_BLOCK_STAIRS, COPPER_BLOCK_SLAB);
            content.addAfter(CUT_COPPER_SLAB, COPPER_BARS);
            content.addAfter(CUT_COPPER_SLAB, COPPER_BARS);
            content.addAfter(COPPER_BARS, COPPER_DOOR);
            content.addAfter(COPPER_DOOR, COPPER_TRAPDOOR);
            content.addAfter(COPPER_TRAPDOOR, COPPER_CHAIN);
            content.addAfter(COPPER_CHAIN, COPPER_LANTERN);
            content.addAfter(COPPER_LANTERN, COPPER_SOUL_LANTERN);

            //Exposed Copper
            content.addAfter(EXPOSED_COPPER, EXPOSED_COPPER_BLOCK_STAIRS);
            content.addAfter(EXPOSED_COPPER_BLOCK_STAIRS, EXPOSED_COPPER_BLOCK_SLAB);
            content.addAfter(EXPOSED_CUT_COPPER_SLAB, EXPOSED_COPPER_BARS);
            content.addAfter(EXPOSED_COPPER_BARS, EXPOSED_COPPER_DOOR);
            content.addAfter(EXPOSED_COPPER_DOOR, EXPOSED_COPPER_TRAPDOOR);
            content.addAfter(EXPOSED_COPPER_TRAPDOOR, EXPOSED_COPPER_CHAIN);
            content.addAfter(EXPOSED_COPPER_CHAIN, EXPOSED_COPPER_LANTERN);
            content.addAfter(EXPOSED_COPPER_LANTERN, EXPOSED_COPPER_SOUL_LANTERN);

            //Weathered Copper
            content.addAfter(WEATHERED_COPPER, WEATHERED_COPPER_BLOCK_STAIRS);
            content.addAfter(WEATHERED_COPPER_BLOCK_STAIRS, WEATHERED_COPPER_BLOCK_SLAB);
            content.addAfter(WEATHERED_CUT_COPPER_SLAB, WEATHERED_COPPER_BARS);
            content.addAfter(WEATHERED_COPPER_BARS, WEATHERED_COPPER_DOOR);
            content.addAfter(WEATHERED_COPPER_DOOR, WEATHERED_COPPER_TRAPDOOR);
            content.addAfter(WEATHERED_COPPER_TRAPDOOR, WEATHERED_COPPER_CHAIN);
            content.addAfter(WEATHERED_COPPER_CHAIN, WEATHERED_COPPER_LANTERN);
            content.addAfter(WEATHERED_COPPER_LANTERN, WEATHERED_COPPER_SOUL_LANTERN);

            //Oxidised Copper
            content.addAfter(OXIDIZED_COPPER, OXIDIZED_COPPER_BLOCK_STAIRS);
            content.addAfter(OXIDIZED_COPPER_BLOCK_STAIRS, OXIDIZED_COPPER_BLOCK_SLAB);
            content.addAfter(OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_COPPER_BARS);
            content.addAfter(OXIDIZED_COPPER_BARS, OXIDIZED_COPPER_DOOR);
            content.addAfter(OXIDIZED_COPPER_DOOR, OXIDIZED_COPPER_TRAPDOOR);
            content.addAfter(OXIDIZED_COPPER_TRAPDOOR, OXIDIZED_COPPER_CHAIN);
            content.addAfter(OXIDIZED_COPPER_CHAIN, OXIDIZED_COPPER_LANTERN);
            content.addAfter(OXIDIZED_COPPER_LANTERN, OXIDIZED_COPPER_SOUL_LANTERN);

            //Waxed Copper
            content.addAfter(WAXED_COPPER_BLOCK, WAXED_COPPER_BLOCK_STAIRS);
            content.addAfter(WAXED_COPPER_BLOCK_STAIRS, WAXED_COPPER_BLOCK_SLAB);
            content.addAfter(WAXED_CUT_COPPER_SLAB, WAXED_COPPER_BARS);
            content.addAfter(WAXED_COPPER_BARS, WAXED_COPPER_DOOR);
            content.addAfter(WAXED_COPPER_DOOR, WAXED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_COPPER_TRAPDOOR, WAXED_COPPER_CHAIN);
            content.addAfter(WAXED_COPPER_CHAIN, WAXED_COPPER_LANTERN);
            content.addAfter(WAXED_COPPER_LANTERN, WAXED_COPPER_SOUL_LANTERN);

            //Waxed Exposed Copper
            content.addAfter(WAXED_EXPOSED_COPPER, WAXED_EXPOSED_COPPER_BLOCK_STAIRS);
            content.addAfter(WAXED_EXPOSED_COPPER_BLOCK_STAIRS, WAXED_EXPOSED_COPPER_BLOCK_SLAB);
            content.addAfter(WAXED_EXPOSED_CUT_COPPER_SLAB, WAXED_EXPOSED_COPPER_BARS);
            content.addAfter(WAXED_EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_DOOR);
            content.addAfter(WAXED_EXPOSED_COPPER_DOOR, WAXED_EXPOSED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_EXPOSED_COPPER_TRAPDOOR, WAXED_EXPOSED_COPPER_CHAIN);
            content.addAfter(WAXED_EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_LANTERN);
            content.addAfter(WAXED_EXPOSED_COPPER_LANTERN, WAXED_EXPOSED_COPPER_SOUL_LANTERN);

            //Waxed Weathered Copper
            content.addAfter(WAXED_WEATHERED_COPPER, WAXED_WEATHERED_COPPER_BLOCK_STAIRS);
            content.addAfter(WAXED_WEATHERED_COPPER_BLOCK_STAIRS, WAXED_WEATHERED_COPPER_BLOCK_SLAB);
            content.addAfter(WAXED_WEATHERED_CUT_COPPER_SLAB, WAXED_WEATHERED_COPPER_BARS);
            content.addAfter(WAXED_WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_DOOR);
            content.addAfter(WAXED_WEATHERED_COPPER_DOOR, WAXED_WEATHERED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_WEATHERED_COPPER_TRAPDOOR, WAXED_WEATHERED_COPPER_CHAIN);
            content.addAfter(WAXED_WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_LANTERN);
            content.addAfter(WAXED_WEATHERED_COPPER_LANTERN, WAXED_WEATHERED_COPPER_SOUL_LANTERN);

            //Waxed Oxidised Copper
            content.addAfter(WAXED_OXIDIZED_COPPER, WAXED_OXIDIZED_COPPER_BLOCK_STAIRS);
            content.addAfter(WAXED_OXIDIZED_COPPER_BLOCK_STAIRS, WAXED_OXIDIZED_COPPER_BLOCK_SLAB);
            content.addAfter(WAXED_OXIDIZED_CUT_COPPER_SLAB, WAXED_OXIDIZED_COPPER_BARS);
            content.addAfter(WAXED_OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_DOOR);
            content.addAfter(WAXED_OXIDIZED_COPPER_DOOR, WAXED_OXIDIZED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_OXIDIZED_COPPER_TRAPDOOR, WAXED_OXIDIZED_COPPER_CHAIN);
            content.addAfter(WAXED_OXIDIZED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_LANTERN);
            content.addAfter(WAXED_OXIDIZED_COPPER_LANTERN, WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(DEEPSLATE_COPPER_ORE, SILVER_ORE);
            content.addAfter(SILVER_ORE, DEEPSLATE_SILVER_ORE);
            content.addAfter(RAW_COPPER_BLOCK, RAW_SILVER_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(RAW_COPPER, RAW_SILVER);
            content.addAfter(COPPER_INGOT, SILVER_INGOT);
            content.addAfter(IRON_NUGGET, COPPER_NUGGET);
            content.addAfter(COPPER_NUGGET, SILVER_NUGGET);
            content.addAfter(SILVER_NUGGET, NETHERITE_NUGGET);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            //Lanterns
            content.addAfter(LANTERN, WAXED_COPPER_LANTERN);
            content.addAfter(WAXED_COPPER_LANTERN, SILVER_LANTERN);
            content.addAfter(SILVER_LANTERN, GOLD_LANTERN);

            //Soul lantern
            content.addAfter(SOUL_LANTERN, WAXED_COPPER_SOUL_LANTERN);
            content.addAfter(WAXED_COPPER_SOUL_LANTERN, SILVER_SOUL_LANTERN);
            content.addAfter(SILVER_SOUL_LANTERN, GOLD_SOUL_LANTERN);

            //Chains
            content.addAfter(CHAIN, WAXED_COPPER_CHAIN);
            content.addAfter(WAXED_COPPER_CHAIN, SILVER_CHAIN);
            content.addAfter(SILVER_CHAIN, GOLD_CHAIN);

            //Distiller
            content.addAfter(BLAST_FURNACE, DISTILLER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(SPIDER_EYE, BREWERS_BLUDGEON);

            //Crushed foods
        });
    }
}
