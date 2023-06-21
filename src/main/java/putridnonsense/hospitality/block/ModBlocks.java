package putridnonsense.hospitality.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import putridnonsense.hospitality.Hospitality;

public class ModBlocks {
    public static void registerBlocks() {
        Hospitality.LOGGER.info("HOSPITALITY: Registering blocks...");
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Hospitality.MOD_ID, name), block);

    }

    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Hospitality.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    //Register blocks
    //Silver
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool()));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(5.0F, 6.0F)));

    //Gold


    //Chains
    public static final Block GOLD_CHAIN = registerBlock("gold_chain.json", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block SILVER_CHAIN = registerBlock("silver_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block COPPER_CHAIN = registerBlock("copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
}