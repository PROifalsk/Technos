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
        MARBLE_BLOCK = register("marble_block", Block::new, Block.Settings.create().strength(4.0f));

        setModBlocksIntoGroups();

        Technos.LOGGER.info("Technos Block Registry: SUCCESS");
    }

    private static void setModBlocksIntoGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //Items in BUILDING BLOCKS group
            entries.add(MARBLE_BLOCK);
        });
    }

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(Technos.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }
}
