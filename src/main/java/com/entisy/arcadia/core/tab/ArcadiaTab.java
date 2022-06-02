package com.entisy.arcadia.core.tab;

import com.entisy.arcadia.core.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ArcadiaTab extends ItemGroup {

    public static final ArcadiaTab ARCADIA_TAB = new ArcadiaTab(ItemGroup.getGroupCountSafe(), "techniq_tab");

    public ArcadiaTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.ACACIA_LEAVES); // TODO: ModItems/ModBlocks.WHATEVER.get()
    }
}
