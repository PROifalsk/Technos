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
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", Item::new, new Item.Settings());
    public static final Item BERYLLIUM_INGOT = registerItem("beryllium_ingot", Item::new, new Item.Settings());
    public static final Item BORON_INGOT = registerItem("boron_ingot", Item::new, new Item.Settings());
    public static final Item GRAPHITE_INGOT = registerItem("graphite_ingot", Item::new, new Item.Settings());
    public static final Item SODIUM_INGOT = registerItem("sodium_ingot", Item::new, new Item.Settings());
    public static final Item MAGNESIUM_INGOT = registerItem("magnesium_ingot", Item::new, new Item.Settings());
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", Item::new, new Item.Settings());
    public static final Item POTASSIUM_INGOT = registerItem("potassium_ingot", Item::new, new Item.Settings());
    public static final Item CALCIUM_INGOT = registerItem("calcium_ingot", Item::new, new Item.Settings());
    public static final Item SCANDIUM_INGOT = registerItem("scandium_ingot", Item::new, new Item.Settings());
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", Item::new, new Item.Settings());
    public static final Item VANADIUM_INGOT = registerItem("vanadium_ingot", Item::new, new Item.Settings());
    public static final Item CHROMIUM_INGOT = registerItem("chromium_ingot", Item::new, new Item.Settings());
    public static final Item MANGANESE_INGOT = registerItem("manganese_ingot", Item::new, new Item.Settings());
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", Item::new, new Item.Settings());
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", Item::new, new Item.Settings());
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", Item::new, new Item.Settings());
    public static final Item GALLIUM_INGOT = registerItem("gallium_ingot", Item::new, new Item.Settings());
    public static final Item GERMANIUM_INGOT = registerItem("germanium_ingot", Item::new, new Item.Settings());
    public static final Item ARSENIC_INGOT = registerItem("arsenic_ingot", Item::new, new Item.Settings());
    public static final Item RUBIDIUM_INGOT = registerItem("arsenic_ingot", Item::new, new Item.Settings());
    public static final Item STRONTIUM_INGOT = registerItem("strontium_ingot", Item::new, new Item.Settings());
    public static final Item YTTRIUM_INGOT = registerItem("yttrium_ingot", Item::new, new Item.Settings());
    public static final Item ZIRCONIUM_INGOT = registerItem("zirconium_ingot", Item::new, new Item.Settings());
    public static final Item NIOBIUM_INGOT = registerItem("niobium_ingot", Item::new, new Item.Settings());
    public static final Item MOLYBDENUM_INGOT = registerItem("molybdenum_ingot", Item::new, new Item.Settings());
    public static final Item TECHNETIUM_98_INGOT = registerItem("technetium_98_ingot", Item::new, new Item.Settings());
    public static final Item RUTHENIUM_INGOT = registerItem("ruthenium_ingot", Item::new, new Item.Settings());
    public static final Item RHODIUM_INGOT = registerItem("rhodium_ingot", Item::new, new Item.Settings());
    public static final Item PALLADIUM_INGOT = registerItem("palladium_ingot", Item::new, new Item.Settings());
    public static final Item SILVER_INGOT = registerItem("silver_ingot", Item::new, new Item.Settings());
    public static final Item CADMIUM_INGOT = registerItem("cadmium_ingot", Item::new, new Item.Settings());
    public static final Item INDIUM_INGOT = registerItem("indium_ingot", Item::new, new Item.Settings());
    public static final Item TIN_INGOT = registerItem("tin_ingot", Item::new, new Item.Settings());
    public static final Item ANTIMONY_INGOT = registerItem("antimony_ingot", Item::new, new Item.Settings());
    public static final Item TELLURIUM_INGOT = registerItem("tellurium_ingot", Item::new, new Item.Settings());
    public static final Item CESIUM_INGOT = registerItem("cesium_ingot", Item::new, new Item.Settings());
    public static final Item BARIUM_INGOT = registerItem("barium_ingot", Item::new, new Item.Settings());
    public static final Item LANTHANUM_INGOT = registerItem("lanthanum_ingot", Item::new, new Item.Settings());
    public static final Item CERIUM_INGOT = registerItem("cerium_ingot", Item::new, new Item.Settings());
    public static final Item PRASEODYMIUM_INGOT = registerItem("praseodymium_ingot", Item::new, new Item.Settings());
    public static final Item NEODYMIUM_INGOT = registerItem("neodymium_ingot", Item::new, new Item.Settings());
    public static final Item PROMETHIUM_145_INGOT = registerItem("promethium_145_ingot", Item::new, new Item.Settings());
    public static final Item SAMARIUM_INGOT = registerItem("samarium_ingot", Item::new, new Item.Settings());
    public static final Item EUROPIUM_INGOT = registerItem("europium_ingot", Item::new, new Item.Settings());
    public static final Item GADOLINIUM_INGOT = registerItem("gadolinium_ingot", Item::new, new Item.Settings());
    public static final Item TERBIUM_INGOT = registerItem("terbium_ingot", Item::new, new Item.Settings());
    public static final Item DYSPROSIUM_INGOT = registerItem("dysprosium_ingot", Item::new, new Item.Settings());
    public static final Item HOLMIUM_INGOT = registerItem("holmium_ingot", Item::new, new Item.Settings());
    public static final Item ERBIUM_INGOT = registerItem("erbium_ingot", Item::new, new Item.Settings());
    public static final Item THULIUM_INGOT = registerItem("thulium_ingot", Item::new, new Item.Settings());
    public static final Item YTTERBIUM_INGOT = registerItem("ytterbium_ingot", Item::new, new Item.Settings());
    public static final Item LUTETIUM_INGOT = registerItem("lutetium_ingot", Item::new, new Item.Settings());
    public static final Item HAFNIUM_INGOT = registerItem("hafnium_ingot", Item::new, new Item.Settings());
    public static final Item TANTALUM_INGOT = registerItem("tantalum_ingot", Item::new, new Item.Settings());
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", Item::new, new Item.Settings());
    public static final Item RHENIUM_INGOT = registerItem("rhenium_ingot", Item::new, new Item.Settings());
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", Item::new, new Item.Settings());
    public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", Item::new, new Item.Settings());
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", Item::new, new Item.Settings());
    public static final Item THALLIUM_INGOT = registerItem("thallium_ingot", Item::new, new Item.Settings());
    public static final Item LEAD_INGOT = registerItem("lead_ingot", Item::new, new Item.Settings());
    public static final Item BISMUTH_INGOT = registerItem("bismuth_ingot", Item::new, new Item.Settings());
    public static final Item POLONIUM_210_INGOT = registerItem("polonium_210_ingot", Item::new, new Item.Settings());
    public static final Item RADIUM_226_INGOT = registerItem("radium_226_ingot", Item::new, new Item.Settings());
    public static final Item ACTINIUM_225_INGOT = registerItem("actinium_225_ingot", Item::new, new Item.Settings());
    public static final Item ACTINIUM_227_INGOT = registerItem("actinium_227_ingot", Item::new, new Item.Settings());
    public static final Item THORIUM_232_INGOT = registerItem("thorium_232_ingot", Item::new, new Item.Settings());
    public static final Item PROTACTINIUM_231_INGOT = registerItem("thorium_232_ingot", Item::new, new Item.Settings());
    public static final Item URANIUM_233_INGOT = registerItem("uranium_233_ingot", Item::new, new Item.Settings());
    public static final Item URANIUM_234_INGOT = registerItem("uranium_234_ingot", Item::new, new Item.Settings());
    public static final Item URANIUM_235_INGOT = registerItem("uranium_235_ingot", Item::new, new Item.Settings());
    public static final Item URANIUM_236_INGOT = registerItem("uranium_236_ingot", Item::new, new Item.Settings());
    public static final Item URANIUM_238_INGOT = registerItem("uranium_238_ingot", Item::new, new Item.Settings());
    public static final Item NEPTUNIUM_236_INGOT = registerItem("neptunium_236_ingot", Item::new, new Item.Settings());
    public static final Item NEPTUNIUM_237_INGOT = registerItem("neptunium_237_ingot", Item::new, new Item.Settings());
    public static final Item PLUTONIUM_238_INGOT = registerItem("plutonium_238_ingot", Item::new, new Item.Settings());
    public static final Item PLUTONIUM_239_INGOT = registerItem("plutonium_239_ingot", Item::new, new Item.Settings());
    public static final Item PLUTONIUM_240_INGOT = registerItem("plutonium_240_ingot", Item::new, new Item.Settings());
    public static final Item PLUTONIUM_241_INGOT = registerItem("plutonium_241_ingot", Item::new, new Item.Settings());
    public static final Item PLUTONIUM_242_INGOT = registerItem("plutonium_242_ingot", Item::new, new Item.Settings());
    public static final Item PLUTONIUM_244_INGOT = registerItem("plutonium_244_ingot", Item::new, new Item.Settings());
    public static final Item AMERICIUM_241_INGOT = registerItem("plutonium_241_ingot", Item::new, new Item.Settings());
    public static final Item AMERICIUM_243_INGOT = registerItem("plutonium_243_ingot", Item::new, new Item.Settings());
    public static final Item CURIUM_244_INGOT = registerItem("curium_244_ingot", Item::new, new Item.Settings());
    public static final Item CURIUM_245_INGOT = registerItem("curium_245_ingot", Item::new, new Item.Settings());
    public static final Item CURIUM_246_INGOT = registerItem("curium_246_ingot", Item::new, new Item.Settings());
    public static final Item CURIUM_247_INGOT = registerItem("curium_247_ingot", Item::new, new Item.Settings());
    public static final Item CURIUM_248_INGOT = registerItem("curium_248_ingot", Item::new, new Item.Settings());
    public static final Item CURIUM_250_INGOT = registerItem("curium_250_ingot", Item::new, new Item.Settings());
    public static final Item BERKELIUM_247_INGOT = registerItem("berkelium_247_ingot", Item::new, new Item.Settings());
    public static final Item CALIFORNIUM_250_INGOT = registerItem("californium_250_ingot", Item::new, new Item.Settings());
    public static final Item CALIFORNIUM_251_INGOT = registerItem("californium_251_ingot", Item::new, new Item.Settings());
    public static final Item CALIFORNIUM_252_INGOT = registerItem("californium_252_ingot", Item::new, new Item.Settings());
    public static final Item EINSTEINIUM_252_INGOT = registerItem("einsteinium_252_ingot", Item::new, new Item.Settings());
    public static final Item EINSTEINIUM_254_INGOT = registerItem("einsteinium_254_ingot", Item::new, new Item.Settings());
    public static final Item FERMIUM_257_INGOT = registerItem("fermium_257_ingot", Item::new, new Item.Settings());

    public static final Item SCREWDRIVER =
            registerItem("screwdriver", Item::new, new Item.Settings());

    public static final Item WHITE_PHOSPHOROUS_BRICK =
            registerItem("white_phosphorous_brick", HazardousItem::new, new Item.Settings());

    public static void registerModItems() {
        Technos.LOGGER.info("Technos Item Registry: SUCCESS");
    }


    private static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Technos.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }
}
