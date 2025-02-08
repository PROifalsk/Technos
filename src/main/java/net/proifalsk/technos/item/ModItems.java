package net.proifalsk.technos.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import net.proifalsk.technos.Technos;
import net.proifalsk.technos.item.custom.HazardousItem;

import java.util.function.Function;

public class ModItems {
    public static Item SCREWDRIVER;

    public static Item WHITE_PHOSPHOROUS_BRICK;

    public static void registerModItems() {
        SCREWDRIVER = registerItem("screwdriver", Item::new, new Item.Settings());

        WHITE_PHOSPHOROUS_BRICK = registerItem("white_phosphorous_brick", HazardousItem::new, new Item.Settings());

        Technos.LOGGER.info("Technos Item Registry: SUCCESS");
    }


    private static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Technos.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }
}
