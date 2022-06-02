package com.entisy.arcadia.data.client;

import com.entisy.arcadia.Arcadia;
import com.entisy.arcadia.core.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Arcadia.MOD_ID, exFileHelper);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void registerStatesAndModels() {
        ModBlocks.getBlocks().forEach(b -> simpleBlock(b));
    }

    private void semiComplexBlock(Block block) {
        horizontalBlock(block, models().orientableWithBottom(block.getRegistryName().getPath(),
                getSide(block), getSide(block), getBottom(block), getTop(block)));
    }

    private void complexBlock(Block block) {
        horizontalBlock(block, models().orientableWithBottom(block.getRegistryName().getPath(),
                getSide(block), getFront(block), getBottom(block), getTop(block)));
    }

    private ResourceLocation getSide(Block block) {
        System.out.println(block.getRegistryName());
        return modLoc("block/" + block.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "") + "/side");
    }

    private ResourceLocation getFront(Block block) {
        return modLoc("block/" + block.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "") + "/front");
    }

    private ResourceLocation getBottom(Block block) {
        return modLoc("block/" + block.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "") + "/bottom");
    }

    private ResourceLocation getTop(Block block) {
        return modLoc("block/" + block.getRegistryName().toString().replace(Arcadia.MOD_ID + ":", "") + "/top");
    }
}
