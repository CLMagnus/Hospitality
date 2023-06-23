package putridnonsense.hospitality.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import putridnonsense.hospitality.Hospitality;

public class ModBlocks {
    public static void registerBlockLog() {
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
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_BLUE).strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool()));
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(SILVER_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_BLUE).requiresTool().strength(5.0F, 6.0F)));
    public static final Block SILVER_BARS = registerBlock("silver_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).nonOpaque()));
    public static final Block SILVER_DOOR = registerBlock("silver_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.GOLD));
    public static final Block SILVER_TRAPDOOR = registerBlock("silver_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.GOLD));
    public static final Block SILVER_CHAIN = registerBlock("silver_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block SILVER_LANTERN = registerBlock("silver_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 15;}).nonOpaque()));
    public static final Block SILVER_SOUL_LANTERN = registerBlock("silver_soul_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 10;}).nonOpaque()));

    //Gold
    public static final Block GOLD_BARS = registerBlock("gold_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).nonOpaque()));
    public static final Block GOLD_DOOR = registerBlock("gold_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.GOLD));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.GOLD));
    public static final Block GOLD_CHAIN = registerBlock("gold_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block GOLD_LANTERN = registerBlock("gold_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 15;}).nonOpaque()));
    public static final Block GOLD_SOUL_LANTERN = registerBlock("gold_soul_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 10;}).nonOpaque()));
    
    //TODO: Make custom block class for oxidizable variants (OxidizableChainBlock, OxidizableLanternBlock, etc.)
    //Copper
    //Chains
    //Not-Waxed
    //Waxed
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
    //Lanterns
    //Not-Waxed
    //Waxed
    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 15;}).nonOpaque()));
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 10;}).nonOpaque()));
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 15;}).nonOpaque()));
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 10;}).nonOpaque()));
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 15;}).nonOpaque()));
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 10;}).nonOpaque()));
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 15;}).nonOpaque()));
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {return 10;}).nonOpaque()));
    //Bars
    //Not-Waxed
    //Waxed
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F).nonOpaque()));
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F).nonOpaque()));
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F).nonOpaque()));
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL, MapColor.CLEAR).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F).nonOpaque()));
    //Doors
    //Not-Waxed
    //Waxed
    //TODO: Make COPPER BlockSetType (BlockSetType.COPPER)
    public static final Block WAXED_COPPER_DOOR = registerBlock("waxed_copper_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    public static final Block WAXED_EXPOSED_COPPER_DOOR = registerBlock("waxed_exposed_copper_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    public static final Block WAXED_WEATHERED_COPPER_DOOR = registerBlock("waxed_weathered_copper_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    public static final Block WAXED_OXIDIZED_COPPER_DOOR = registerBlock("waxed_oxidized_copper_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    //Trapdoors
    //Not-Waxed
    //Waxed
    public static final Block WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F).nonOpaque(), BlockSetType.IRON));
}