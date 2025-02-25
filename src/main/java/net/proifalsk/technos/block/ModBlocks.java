package net.proifalsk.technos.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.proifalsk.technos.Technos;
import net.proifalsk.technos.block.custom.WhitePhosphorousBlock;
import net.proifalsk.technos.block.custom.WorkbenchBlock;

import java.util.function.Function;

public class ModBlocks {
    public static final Block BERYL_BLOCK = registerBlock("beryl_block", Block::new, AbstractBlock.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // beryllium aluminium
    public static final Block BORAX_ORE = registerBlock("borax_ore", Block::new, AbstractBlock.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // boron sodium
    public static final Block SYLVINITE_BLOCK = registerBlock("sylvinite_block", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // sodium potassium
    public static final Block DOLOMITE_ORE = registerBlock("dolomite_ore", Block::new, AbstractBlock.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // magnesium calcium
    public static final Block BAUXITE_BLOCK = registerBlock("bauxite_block", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // aluminium iron titanium chromium
    public static final Block WOLFRAMITE_ORE = registerBlock("wolframite_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // scandium manganese tungsten
    public static final Block ILMENITE_ORE = registerBlock("ilmenite_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // titanium iron
    public static final Block CARNOTITE_ORE = registerBlock("carnotite_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // vanadium uranium
    public static final Block CHROMITE_ORE = registerBlock("chromite_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // chromium iron
    public static final Block MILLERITE_ORE = registerBlock("cobaltite_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // cobalt nickel iron copper
    public static final Block SPHALERITE_ORE = registerBlock("sphalerite_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // zinc gallium cadmium indium
    public static final Block GALENA_ORE = registerBlock("galena_ore", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE)); // lead silver selenium

    public static final Block WHITE_PHOSPHOROUS_BLOCK = registerBlock("white_phosphorous_block", WhitePhosphorousBlock::new, Block.Settings.create().strength(4.0f).luminance(state -> 1).sounds(BlockSoundGroup.RESIN));

    public static final Block WORKBENCH = registerBlock("workbench", WorkbenchBlock::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE).nonOpaque());

    public static void registerModBlocks() {
        Technos.LOGGER.info("Technos Block Registry: SUCCESS");
    }

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(Technos.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }
}
