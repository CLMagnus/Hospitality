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
        });
    }
}
