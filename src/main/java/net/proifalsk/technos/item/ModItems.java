package net.proifalsk.technos.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import net.proifalsk.technos.Technos;

import java.util.function.Function;

public class ModItems {
    public static Item SCREWDRIVER;

    public static void registerModItems() {
        SCREWDRIVER = register("screwdriver", Item::new, new Item.Settings());

        setModItemsIntoGroups();

        Technos.LOGGER.info("Technos Item Registry: SUCCESS");
    }

    private static void setModItemsIntoGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            //Items in TOOLS group
            entries.add(SCREWDRIVER);
        });
    }

    private static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Technos.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }
}
