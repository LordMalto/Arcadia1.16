package com.entisy.arcadia.data.client;

import com.entisy.arcadia.Arcadia;
import com.entisy.arcadia.core.init.ModBlocks;
import com.entisy.arcadia.core.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen) {
        super(gen, Arcadia.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + Arcadia.MOD_ID + "_tab", "Techniq");

        ModItems.getItems().forEach(item -> addItem(item));
        ModBlocks.getBlocks().forEach(block -> addBlock(block));
    }

    private void addBlock(Block block) {
        add(block, getName(block));
    }

    private void addFluid(FlowingFluid fluid) {
        add(fluid, getName(fluid));
    }

    private void addItem(Item item) {
        add(item, getName(item));
    }

    private String getName(Item item) {
        String itemId = item.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "");
        String[] args = itemId.split("_");
        String ret = "";
        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1) {
                ret += upperCaseWord(args[i]) + " ";
            } else {
                ret += upperCaseWord(args[i]);
            }
        }
        return ret;
    }

    private String getName(FlowingFluid fluid) {
        String itemId = fluid.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "");
        String[] args = itemId.split("_");
        String ret = "";
        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1) {
                ret += upperCaseWord(args[i]) + " ";
            } else {
                ret += upperCaseWord(args[i]);
            }
        }
        return ret;
    }

    private String getName(Block block) {
        String itemId = block.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "");
        String[] args = itemId.split("_");
        String ret = "";
        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1) {
                ret += upperCaseWord(args[i]) + " ";
            } else {
                ret += upperCaseWord(args[i]);
            }
        }
        return ret;
    }

    private String upperCaseWord(String word) {
        String ret = word.substring(0, 1).toUpperCase() + word.substring(1);
        return ret;
    }

    public void add(FlowingFluid key, String name) {
        add("fluid." + Arcadia.MOD_ID + "." + key.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", ""), name);
    }
}
