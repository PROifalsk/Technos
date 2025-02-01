package net.proifalsk.technos.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.proifalsk.technos.Technos;

import java.util.function.Function;

public class ModBlocks {
    public static Block MARBLE_BLOCK;

    public static void registerModBlocks() {
        MARBLE_BLOCK = registerBlock("marble_block", Block::new, Block.Settings.create().strength(4.0f));

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
