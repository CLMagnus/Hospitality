package putridnonsense.hospitality.block;
import putridnonsense.hospitality.Hospitality;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static void registerBlockLog() {
        Hospitality.LOGGER.info("HOSPITALITY: Registering blocks...");
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Hospitality.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, new Identifier(Hospitality.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    //Brewery
    public static final Block DISTILLER = registerBlock("distiller", new DistillerBlock(FabricBlockSettings.copy(COPPER_BLOCK)));

    //Chairs
    public static final Block OAK_CHAIR = registerBlock("oak_chair", new ChairBlock(FabricBlockSettings.copy(OAK_PLANKS)));

    //Tables
    public static final Block OAK_TABLE = registerBlock("oak_table", new TableBlock(FabricBlockSettings.copy(OAK_PLANKS)));
    public static final Block SPRUCE_TABLE = registerBlock("spruce_table", new TableBlock(FabricBlockSettings.copy(SPRUCE_PLANKS)));
    public static final Block BIRCH_TABLE = registerBlock("birch_table", new TableBlock(FabricBlockSettings.copy(BIRCH_PLANKS)));
    public static final Block JUNGLE_TABLE = registerBlock("jungle_table", new TableBlock(FabricBlockSettings.copy(JUNGLE_PLANKS)));
    public static final Block ACACIA_TABLE = registerBlock("acacia_table", new TableBlock(FabricBlockSettings.copy(ACACIA_PLANKS)));
    public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table", new TableBlock(FabricBlockSettings.copy(DARK_OAK_PLANKS)));
    public static final Block MANGROVE_TABLE = registerBlock("mangrove_table", new TableBlock(FabricBlockSettings.copy(MANGROVE_PLANKS)));
    public static final Block CRIMSON_TABLE = registerBlock("crimson_table", new TableBlock(FabricBlockSettings.copy(CRIMSON_PLANKS)));
    public static final Block WARPED_TABLE = registerBlock("warped_table", new TableBlock(FabricBlockSettings.copy(WARPED_PLANKS)));

    //Register blocks
    //Silver
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_BLUE).strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool()));
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(SILVER_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_BLUE).requiresTool().strength(5.0F, 6.0F)));
    public static final Block SILVER_BARS = registerBlock("silver_bars", new PaneBlock(FabricBlockSettings.copy(SILVER_BLOCK).nonOpaque()));
    public static final Block SILVER_DOOR = registerBlock("silver_door", new DoorBlock(FabricBlockSettings.copy(SILVER_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block SILVER_TRAPDOOR = registerBlock("silver_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(SILVER_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block SILVER_CHAIN = registerBlock("silver_chain", new ChainBlock(FabricBlockSettings.copy(SILVER_BLOCK).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block SILVER_LANTERN = registerBlock("silver_lantern", new LanternBlock(FabricBlockSettings.copy(SILVER_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 15).nonOpaque()));
    public static final Block SILVER_SOUL_LANTERN = registerBlock("silver_soul_lantern", new LanternBlock(FabricBlockSettings.copy(SILVER_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 10).nonOpaque()));
    public static final Block SILVER_BLOCK_STAIRS = registerBlock("silver_block_stairs", new StairsBlock(SILVER_BLOCK.getDefaultState(), FabricBlockSettings.copy(SILVER_BLOCK)));
    public static final Block SILVER_BLOCK_SLAB = registerBlock("silver_block_slab", new SlabBlock(FabricBlockSettings.copy(SILVER_BLOCK)));

    //Gold
    public static final Block GOLD_BARS = registerBlock("gold_bars", new PaneBlock(FabricBlockSettings.copy(GOLD_BLOCK).nonOpaque()));
    public static final Block GOLD_DOOR = registerBlock("gold_door", new DoorBlock(FabricBlockSettings.copy(GOLD_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(GOLD_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block GOLD_CHAIN = registerBlock("gold_chain", new ChainBlock(FabricBlockSettings.copy(GOLD_BLOCK).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block GOLD_LANTERN = registerBlock("gold_lantern", new LanternBlock(FabricBlockSettings.copy(GOLD_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 15).nonOpaque()));
    public static final Block GOLD_SOUL_LANTERN = registerBlock("gold_soul_lantern", new LanternBlock(FabricBlockSettings.copy(GOLD_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 10).nonOpaque()));
    public static final Block GOLD_BLOCK_STAIRS = registerBlock("gold_block_stairs", new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copy(GOLD_BLOCK)));
    public static final Block GOLD_BLOCK_SLAB = registerBlock("gold_block_slab", new SlabBlock(FabricBlockSettings.copy(GOLD_BLOCK)));

    //Iron
    public static final Block IRON_BLOCK_STAIRS = registerBlock("iron_block_stairs", new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copy(IRON_BLOCK)));
    public static final Block IRON_BLOCK_SLAB = registerBlock("iron_block_slab", new SlabBlock(FabricBlockSettings.copy(IRON_BLOCK)));

    //Netherite
    public static final Block NETHERITE_BARS = registerBlock("netherite_bars", new PaneBlock(FabricBlockSettings.copy(NETHERITE_BLOCK).nonOpaque()));
    public static final Block NETHERITE_DOOR = registerBlock("netherite_door", new DoorBlock(FabricBlockSettings.copy(NETHERITE_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block NETHERITE_TRAPDOOR = registerBlock("netherite_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(NETHERITE_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block NETHERITE_CHAIN = registerBlock("netherite_chain", new ChainBlock(FabricBlockSettings.copy(NETHERITE_BLOCK).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block NETHERITE_LANTERN = registerBlock("netherite_lantern", new LanternBlock(FabricBlockSettings.copy(NETHERITE_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 15).nonOpaque()));
    public static final Block NETHERITE_SOUL_LANTERN = registerBlock("netherite_soul_lantern", new LanternBlock(FabricBlockSettings.copy(NETHERITE_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 10).nonOpaque()));
    public static final Block NETHERITE_BLOCK_STAIRS = registerBlock("netherite_block_stairs", new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.copy(NETHERITE_BLOCK)));
    public static final Block NETHERITE_BLOCK_SLAB = registerBlock("netherite_block_slab", new SlabBlock(FabricBlockSettings.copy(NETHERITE_BLOCK)));

    //Emerald
    public static final Block EMERALD_BLOCK_STAIRS = registerBlock("emerald_block_stairs", new StairsBlock(EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copy(EMERALD_BLOCK)));
    public static final Block EMERALD_BLOCK_SLAB = registerBlock("emerald_block_slab", new SlabBlock(FabricBlockSettings.copy(EMERALD_BLOCK)));

    //Diamond
    public static final Block DIAMOND_BLOCK_STAIRS = registerBlock("diamond_block_stairs", new StairsBlock(DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copy(DIAMOND_BLOCK)));
    public static final Block DIAMOND_BLOCK_SLAB = registerBlock("diamond_block_slab", new SlabBlock(FabricBlockSettings.copy(DIAMOND_BLOCK)));

    //Copper
    //Chains
    //Not-Waxed
    public static final Block COPPER_CHAIN = registerBlock("copper_chain", new OxidizableChain(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain", new OxidizableChain(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain", new OxidizableChain(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain", new OxidizableChain(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    //Waxed
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain", new ChainBlock(FabricBlockSettings.copy(COPPER_CHAIN)));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain", new ChainBlock(FabricBlockSettings.copy(EXPOSED_COPPER_CHAIN)));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain", new ChainBlock(FabricBlockSettings.copy(WEATHERED_COPPER_CHAIN)));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain", new ChainBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_CHAIN)));
    //Lanterns
    //Not-Waxed
    public static final Block COPPER_LANTERN = registerBlock("copper_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 15).nonOpaque()));
    public static final Block COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 10).nonOpaque()));
    public static final Block EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 12).nonOpaque()));
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 7).nonOpaque()));
    public static final Block WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 8).nonOpaque()));
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 4).nonOpaque()));
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 4).nonOpaque()));
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern", new OxidizableLantern(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 2).nonOpaque()));
    //Waxed
    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern", new LanternBlock(FabricBlockSettings.copy(COPPER_LANTERN)));
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(COPPER_SOUL_LANTERN)));
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern", new LanternBlock(FabricBlockSettings.copy(EXPOSED_COPPER_LANTERN)));
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(EXPOSED_COPPER_SOUL_LANTERN)));
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern", new LanternBlock(FabricBlockSettings.copy(WEATHERED_COPPER_LANTERN)));
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(WEATHERED_COPPER_SOUL_LANTERN)));
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern", new LanternBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_LANTERN)));
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_SOUL_LANTERN)));
    //Bars
    //Not-Waxed
    public static final Block COPPER_BARS = registerBlock("copper_bars", new OxidizablePane(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK).nonOpaque()));
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars", new OxidizablePane(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER).nonOpaque()));
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars", new OxidizablePane(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER).nonOpaque()));
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars", new OxidizablePane(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER).nonOpaque()));
    //Waxed
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars", new PaneBlock(FabricBlockSettings.copy(COPPER_BARS)));
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars", new PaneBlock(FabricBlockSettings.copy(WAXED_COPPER_BARS)));
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars", new PaneBlock(FabricBlockSettings.copy(WEATHERED_COPPER_BARS)));
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars", new PaneBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_BARS)));
    //Doors
    //Not-Waxed
    public static final Block COPPER_DOOR = registerBlock("copper_door", new OxidizableDoor(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block EXPOSED_COPPER_DOOR = registerBlock("exposed_copper_door", new OxidizableDoor(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER).nonOpaque(), BlockSetType.IRON));
    public static final Block WEATHERED_COPPER_DOOR = registerBlock("weathered_copper_door", new OxidizableDoor(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER).nonOpaque(), BlockSetType.IRON));
    public static final Block OXIDIZED_COPPER_DOOR = registerBlock("oxidized_copper_door", new OxidizableDoor(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER).nonOpaque(), BlockSetType.IRON));
    //Waxed
    public static final Block WAXED_COPPER_DOOR = registerBlock("waxed_copper_door", new DoorBlock(FabricBlockSettings.copy(COPPER_DOOR), BlockSetType.IRON));
    public static final Block WAXED_EXPOSED_COPPER_DOOR = registerBlock("waxed_exposed_copper_door", new DoorBlock(FabricBlockSettings.copy(EXPOSED_COPPER_DOOR), BlockSetType.IRON));
    public static final Block WAXED_WEATHERED_COPPER_DOOR = registerBlock("waxed_weathered_copper_door", new DoorBlock(FabricBlockSettings.copy(WEATHERED_COPPER_DOOR), BlockSetType.IRON));
    public static final Block WAXED_OXIDIZED_COPPER_DOOR = registerBlock("waxed_oxidized_copper_door", new DoorBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_DOOR), BlockSetType.IRON));
    //Trapdoors
    //Not-Waxed
    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor", new OxidizableTrapdoor(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block EXPOSED_COPPER_TRAPDOOR = registerBlock("exposed_copper_trapdoor", new OxidizableTrapdoor(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER).nonOpaque(), BlockSetType.IRON));
    public static final Block WEATHERED_COPPER_TRAPDOOR = registerBlock("weathered_copper_trapdoor", new OxidizableTrapdoor(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER).nonOpaque(), BlockSetType.IRON));
    public static final Block OXIDIZED_COPPER_TRAPDOOR = registerBlock("oxidized_copper_trapdoor", new OxidizableTrapdoor(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER).nonOpaque(), BlockSetType.IRON));
    //Waxed
    public static final Block WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(COPPER_TRAPDOOR), BlockSetType.IRON));
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(EXPOSED_COPPER_TRAPDOOR), BlockSetType.IRON));
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(WEATHERED_COPPER_TRAPDOOR), BlockSetType.IRON));
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_TRAPDOOR), BlockSetType.IRON));
    //Stairs
    //Not-Waxed
    public static final Block COPPER_BLOCK_STAIRS = registerBlock("copper_block_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(COPPER_BLOCK)));
    public static final Block EXPOSED_COPPER_BLOCK_STAIRS = registerBlock("exposed_copper_block_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(EXPOSED_COPPER)));
    public static final Block WEATHERED_COPPER_BLOCK_STAIRS = registerBlock("weathered_copper_block_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(WEATHERED_COPPER)));
    public static final Block OXIDIZED_COPPER_BLOCK_STAIRS = registerBlock("oxidized_copper_block_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(OXIDIZED_COPPER)));
    //Waxed
    public static final Block WAXED_COPPER_BLOCK_STAIRS = registerBlock("waxed_copper_block_stairs", new StairsBlock(Blocks.WAXED_COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(WAXED_COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_COPPER_BLOCK_STAIRS = registerBlock("waxed_exposed_copper_block_stairs", new StairsBlock(Blocks.WAXED_EXPOSED_COPPER.getDefaultState(), FabricBlockSettings.copy(WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BLOCK_STAIRS = registerBlock("waxed_weathered_copper_block_stairs", new StairsBlock(Blocks.WAXED_WEATHERED_COPPER.getDefaultState(), FabricBlockSettings.copy(WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BLOCK_STAIRS = registerBlock("waxed_oxidized_copper_block_stairs", new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER.getDefaultState(), FabricBlockSettings.copy(WAXED_OXIDIZED_COPPER)));
    //Slabs
    //Not-Waxed
    public static final Block COPPER_BLOCK_SLAB = registerBlock("copper_block_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK)));
    public static final Block EXPOSED_COPPER_BLOCK_SLAB = registerBlock("exposed_copper_block_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER)));
    public static final Block WEATHERED_COPPER_BLOCK_SLAB = registerBlock("weathered_copper_block_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER)));
    public static final Block OXIDIZED_COPPER_BLOCK_SLAB = registerBlock("oxidized_copper_block_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER)));
    //Waxed
    public static final Block WAXED_COPPER_BLOCK_SLAB = registerBlock("waxed_copper_block_slab", new SlabBlock(FabricBlockSettings.copy(WAXED_COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_COPPER_BLOCK_SLAB = registerBlock("waxed_exposed_copper_block_slab", new SlabBlock(FabricBlockSettings.copy(WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BLOCK_SLAB = registerBlock("waxed_weathered_copper_block_slab", new SlabBlock(FabricBlockSettings.copy(WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BLOCK_SLAB = registerBlock("waxed_oxidized_copper_block_slab", new SlabBlock(FabricBlockSettings.copy(WAXED_OXIDIZED_COPPER)));
}