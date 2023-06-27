package putridnonsense.hospitality.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

import static net.minecraft.item.Items.*;
import static putridnonsense.hospitality.block.ModBlocks.*;
import static putridnonsense.hospitality.item.ModItems.*;

public class CreativeTabs {
    public static void registerTabItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            //Parity
            content.addAfter(CHAIN, LANTERN);
            content.addAfter(LANTERN, SOUL_LANTERN);

            //Gold
            content.addAfter(GOLD_BLOCK, GOLD_BARS);
            content.addAfter(GOLD_BARS, GOLD_DOOR);
            content.addAfter(GOLD_DOOR, GOLD_TRAPDOOR);
            content.addAfter(LIGHT_WEIGHTED_PRESSURE_PLATE, GOLD_CHAIN);
            content.addAfter(GOLD_CHAIN, GOLD_LANTERN);
            content.addAfter(GOLD_LANTERN, GOLD_SOUL_LANTERN);

            //Silver
            content.addAfter(GOLD_SOUL_LANTERN, SILVER_BLOCK);
            content.addAfter(SILVER_BLOCK, SILVER_BARS);
            content.addAfter(SILVER_BARS, SILVER_DOOR);
            content.addAfter(SILVER_DOOR, SILVER_TRAPDOOR);
            content.addAfter(SILVER_TRAPDOOR, SILVER_CHAIN);
            content.addAfter(SILVER_CHAIN, SILVER_LANTERN);
            content.addAfter(SILVER_LANTERN, SILVER_SOUL_LANTERN);

            //Iron
            content.addAfter(IRON_BLOCK, IRON_BLOCK_STAIRS);
            content.addAfter(IRON_BLOCK_STAIRS, IRON_BLOCK_SLAB);

            //Copper
            content.addAfter(CUT_COPPER_SLAB, COPPER_BARS);
            content.addAfter(COPPER_BARS, COPPER_DOOR);
            content.addAfter(COPPER_DOOR, COPPER_TRAPDOOR);
            content.addAfter(COPPER_TRAPDOOR, COPPER_CHAIN);
            content.addAfter(COPPER_CHAIN, COPPER_LANTERN);
            content.addAfter(COPPER_LANTERN, COPPER_SOUL_LANTERN);

            //Exposed Copper
            content.addAfter(EXPOSED_CUT_COPPER_SLAB, EXPOSED_COPPER_BARS);
            content.addAfter(EXPOSED_COPPER_BARS, EXPOSED_COPPER_DOOR);
            content.addAfter(EXPOSED_COPPER_DOOR, EXPOSED_COPPER_TRAPDOOR);
            content.addAfter(EXPOSED_COPPER_TRAPDOOR, EXPOSED_COPPER_CHAIN);
            content.addAfter(EXPOSED_COPPER_CHAIN, EXPOSED_COPPER_LANTERN);
            content.addAfter(EXPOSED_COPPER_LANTERN, EXPOSED_COPPER_SOUL_LANTERN);

            //Weathered Copper
            content.addAfter(WEATHERED_CUT_COPPER_SLAB, WEATHERED_COPPER_BARS);
            content.addAfter(WEATHERED_COPPER_BARS, WEATHERED_COPPER_DOOR);
            content.addAfter(WEATHERED_COPPER_DOOR, WEATHERED_COPPER_TRAPDOOR);
            content.addAfter(WEATHERED_COPPER_TRAPDOOR, WEATHERED_COPPER_CHAIN);
            content.addAfter(WEATHERED_COPPER_CHAIN, WEATHERED_COPPER_LANTERN);
            content.addAfter(WEATHERED_COPPER_LANTERN, WEATHERED_COPPER_SOUL_LANTERN);

            //Oxidised Copper
            content.addAfter(OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_COPPER_BARS);
            content.addAfter(OXIDIZED_COPPER_BARS, OXIDIZED_COPPER_DOOR);
            content.addAfter(OXIDIZED_COPPER_DOOR, OXIDIZED_COPPER_TRAPDOOR);
            content.addAfter(OXIDIZED_COPPER_TRAPDOOR, OXIDIZED_COPPER_CHAIN);
            content.addAfter(OXIDIZED_COPPER_CHAIN, OXIDIZED_COPPER_LANTERN);
            content.addAfter(OXIDIZED_COPPER_LANTERN, OXIDIZED_COPPER_SOUL_LANTERN);

            //Waxed Copper
            content.addAfter(WAXED_CUT_COPPER_SLAB, WAXED_COPPER_BARS);
            content.addAfter(WAXED_COPPER_BARS, WAXED_COPPER_DOOR);
            content.addAfter(WAXED_COPPER_DOOR, WAXED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_COPPER_TRAPDOOR, WAXED_COPPER_CHAIN);
            content.addAfter(WAXED_COPPER_CHAIN, WAXED_COPPER_LANTERN);
            content.addAfter(WAXED_COPPER_LANTERN, WAXED_COPPER_SOUL_LANTERN);

            //Waxed Exposed Copper
            content.addAfter(WAXED_EXPOSED_CUT_COPPER_SLAB, WAXED_EXPOSED_COPPER_BARS);
            content.addAfter(WAXED_EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_DOOR);
            content.addAfter(WAXED_EXPOSED_COPPER_DOOR, WAXED_EXPOSED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_EXPOSED_COPPER_TRAPDOOR, WAXED_EXPOSED_COPPER_CHAIN);
            content.addAfter(WAXED_EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_LANTERN);
            content.addAfter(WAXED_EXPOSED_COPPER_LANTERN, WAXED_EXPOSED_COPPER_SOUL_LANTERN);

            //Waxed Weathered Copper
            content.addAfter(WAXED_WEATHERED_CUT_COPPER_SLAB, WAXED_WEATHERED_COPPER_BARS);
            content.addAfter(WAXED_WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_DOOR);
            content.addAfter(WAXED_WEATHERED_COPPER_DOOR, WAXED_WEATHERED_COPPER_TRAPDOOR);
            content.addAfter(WAXED_WEATHERED_COPPER_TRAPDOOR, WAXED_WEATHERED_COPPER_CHAIN);
            content.addAfter(WAXED_WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_LANTERN);
            content.addAfter(WAXED_WEATHERED_COPPER_LANTERN, WAXED_WEATHERED_COPPER_SOUL_LANTERN);

            //Waxed Oxidised Copper
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
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            //Lanterns
            content.addAfter(LANTERN, WAXED_COPPER_LANTERN);
            content.addAfter(WAXED_COPPER_LANTERN, WAXED_EXPOSED_COPPER_LANTERN);
            content.addAfter(WAXED_EXPOSED_COPPER_LANTERN, WAXED_WEATHERED_COPPER_LANTERN);
            content.addAfter(WAXED_WEATHERED_COPPER_LANTERN, WAXED_OXIDIZED_COPPER_LANTERN);
            content.addAfter(WAXED_OXIDIZED_COPPER_LANTERN, SILVER_LANTERN);
            content.addAfter(SILVER_LANTERN, GOLD_LANTERN);

            //Soul lantern
            content.addAfter(SOUL_LANTERN, WAXED_COPPER_SOUL_LANTERN);
            content.addAfter(WAXED_COPPER_SOUL_LANTERN, WAXED_EXPOSED_COPPER_SOUL_LANTERN);
            content.addAfter(WAXED_EXPOSED_COPPER_SOUL_LANTERN, WAXED_WEATHERED_COPPER_SOUL_LANTERN);
            content.addAfter(WAXED_WEATHERED_COPPER_SOUL_LANTERN, WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
            content.addAfter(WAXED_OXIDIZED_COPPER_SOUL_LANTERN, SILVER_SOUL_LANTERN);
            content.addAfter(SILVER_SOUL_LANTERN, GOLD_SOUL_LANTERN);

            //Chains
            content.addAfter(CHAIN, WAXED_COPPER_CHAIN);
            content.addAfter(WAXED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_CHAIN);
            content.addAfter(WAXED_EXPOSED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_CHAIN);
            content.addAfter(WAXED_WEATHERED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_CHAIN);
            content.addAfter(WAXED_OXIDIZED_COPPER_CHAIN, SILVER_CHAIN);
            content.addAfter(SILVER_CHAIN, GOLD_CHAIN);
        });
    }
}
