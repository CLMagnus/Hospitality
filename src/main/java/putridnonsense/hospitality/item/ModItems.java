package putridnonsense.hospitality.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import putridnonsense.hospitality.Hospitality;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static void registerItemLog() {
        Hospitality.LOGGER.info("HOSPITALITY: Registering items...");
    }

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hospitality.MOD_ID, name), item);
    }

    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));

    public static final Item BREWERS_BLUDGEON = registerItem("brewers_bludgeon", new Item(new FabricItemSettings().maxCount(1).maxDamage(250)));
}
