package net.proifalsk.technos.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class HazardousItem extends Item {
    public boolean HOT;
    public float RADIOACTIVITY;

    public HazardousItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        //Tooltip adding
        if (HOT) tooltip.add(Text.translatable("item_tooltip.hot"));

        super.appendTooltip(stack, context, tooltip, type);
    }
}
