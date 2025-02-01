package net.proifalsk.technos.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.proifalsk.technos.Technos;
import net.proifalsk.technos.block.ModBlocks;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> TECHNOS_MATERIALS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Technos.MOD_ID, "item_group"));
    public static final ItemGroup TECHNOS_MATERIALS = registerItemGroup(ModItems.WHITE_PHOSPHOROUS, "itemGroup.technos_materials");

    public static final RegistryKey<ItemGroup> TECHNOS_TOOLS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Technos.MOD_ID, "item_group"));
    public static final ItemGroup TECHNOS_TOOLS = registerItemGroup(ModItems.SCREWDRIVER, "itemGroup.technos_tools");

    public static final RegistryKey<ItemGroup> TECHNOS_BLOCKS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Technos.MOD_ID, "item_group"));
    public static final ItemGroup TECHNOS_BLOCKS = registerItemGroup(ModBlocks.MARBLE_BLOCK.asItem(), "itemGroup.technos_blocks");

    public static void registerModItemGroups()
    {
        Registry.register(Registries.ITEM_GROUP, TECHNOS_MATERIALS_KEY, TECHNOS_MATERIALS);
        Registry.register(Registries.ITEM_GROUP, TECHNOS_TOOLS_KEY, TECHNOS_TOOLS);
        Registry.register(Registries.ITEM_GROUP, TECHNOS_BLOCKS_KEY, TECHNOS_BLOCKS);

        ItemGroupEvents.modifyEntriesEvent(TECHNOS_MATERIALS_KEY).register(entries -> {
            entries.add(ModItems.WHITE_PHOSPHOROUS);
        });

        ItemGroupEvents.modifyEntriesEvent(TECHNOS_TOOLS_KEY).register(entries -> {
            entries.add(ModItems.SCREWDRIVER);
        });

        ItemGroupEvents.modifyEntriesEvent(TECHNOS_BLOCKS_KEY).register(entries -> {
            entries.add(ModBlocks.MARBLE_BLOCK);
        });
    }

    private static ItemGroup registerItemGroup(Item icon, String displayName) {
        return FabricItemGroup.builder()
                .icon(() -> new ItemStack(icon))
                .displayName(Text.translatable(displayName))
                .build();
    }
}
