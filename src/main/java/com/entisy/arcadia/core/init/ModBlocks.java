package com.entisy.arcadia.core.init;

import com.entisy.arcadia.Arcadia;
import com.entisy.arcadia.core.tab.ArcadiaTab;
import com.entisy.arcadia.core.util.entisy.SimpleList;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Arcadia.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }


    public static SimpleList<Block> getBlocks() {
        SimpleList<Block> ret = new SimpleList<>();
        BLOCKS.getEntries().forEach(b -> {
            if (!(b.get() instanceof FlowingFluidBlock)) {
                ret.append(b.get());
            }
        });
        return ret;
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block) {
        RegistryObject<T> obj = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(
                obj.get(),
                new Item.Properties().tab(ArcadiaTab.ARCADIA_TAB)));
        return obj;
    }
}
