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
    public static Block BAUXITE_BLOCK;
    public static Block WHITE_PHOSPHOROUS_BLOCK;

    public static Block WORKBENCH;

    public static void registerModBlocks() {
        BAUXITE_BLOCK = registerBlock("bauxite_block", Block::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE));
        WHITE_PHOSPHOROUS_BLOCK = registerBlock("white_phosphorous_block", WhitePhosphorousBlock::new, Block.Settings.create().strength(4.0f).luminance(state -> 1).sounds(BlockSoundGroup.RESIN));

        WORKBENCH = registerBlock("workbench", WorkbenchBlock::new, Block.Settings.create().strength(4.0f).sounds(BlockSoundGroup.STONE).nonOpaque());

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
