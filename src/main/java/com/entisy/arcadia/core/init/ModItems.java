package com.entisy.arcadia.core.init;

import com.entisy.arcadia.Arcadia;
import com.entisy.arcadia.core.util.entisy.SimpleList;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Arcadia.MOD_ID);

    public static final SimpleList<Item> getItems() {
        SimpleList<Item> ret = new SimpleList<>();
        ITEMS.getEntries().forEach(i -> {
            ret.append(i.get());
        });
        return ret;
    }
}
