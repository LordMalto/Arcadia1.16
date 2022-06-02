//package com.entisy.arcadia.core.jei;
//
//import com.entisy.arcadia.Arcadia;
//import com.entisy.arcadia.core.init.ModBlocks;
//import com.entisy.techniq.Techniq;
//import com.entisy.techniq.common.block.alloySmelter.AlloySmelterContainer;
//import com.entisy.techniq.common.block.alloySmelter.AlloySmelterScreen;
//import com.entisy.techniq.common.block.refinery.RefineryTileEntity;
//import com.entisy.techniq.core.init.ModBlocks;
//import com.entisy.techniq.core.init.ModItems;
//import com.entisy.techniq.core.init.ModRecipes;
//import com.entisy.techniq.core.init.ModTags;
//import mezz.jei.api.IModPlugin;
//import mezz.jei.api.JeiPlugin;
//import mezz.jei.api.constants.VanillaRecipeCategoryUid;
//import mezz.jei.api.ingredients.IIngredientType;
//import mezz.jei.api.registration.*;
//import mezz.jei.api.runtime.IIngredientManager;
//import net.minecraft.block.Block;
//import net.minecraft.client.Minecraft;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.crafting.IRecipe;
//import net.minecraft.item.crafting.IRecipeType;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.text.StringTextComponent;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@JeiPlugin
//public class JEIPlugin implements IModPlugin {
//
//    @Override
//    public ResourceLocation getPluginUid() {
//        return new ResourceLocation(Arcadia.MOD_ID, "jei_plugin");
//    }
//
//    @Override
//    public void registerCategories(IRecipeCategoryRegistration registration) {
//        registration.addRecipeCategories(new ExampleRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
//    }
//
//    @Override
//    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
//        registration.addRecipeCatalyst(new ItemStack(ModBlocks.EXAMPLE_BLOCK.get()),
//                ExampleRecipeCategory.UID);
//    }
//
//    @Override
//    public void registerRecipes(IRecipeRegistration registration) {
//        IIngredientManager ingredientManager = registration.getIngredientManager();
//        registration.addRecipes(Collections.singleton(new ExampleTileEntity()), ExampleRecipeCategory.UID);
//    }
//
//    private List<IRecipe<?>> getAllRecipesFor(IRecipeType<?> type) {
//        assert Minecraft.getInstance().level != null;
//        return Minecraft.getInstance().level.getRecipeManager().getRecipes().stream()
//                .filter(r -> r.getType() == type)
//                .collect(Collectors.toList());
//    }
//
//    private void addInfo(IRecipeRegistration registration, Item item, String info) {
//        ItemStack stack = new ItemStack(item);
//        IIngredientManager ingredientManager = registration.getIngredientManager();
//        IIngredientType<ItemStack> ingredientType = ingredientManager.getIngredientType(ItemStack.class);
//        registration.addIngredientInfo(stack, ingredientType, new StringTextComponent(info));
//    }
//
//    private void addInfo(IRecipeRegistration registration, Block block, String info) {
//        ItemStack stack = new ItemStack(block);
//        IIngredientManager ingredientManager = registration.getIngredientManager();
//        IIngredientType<ItemStack> ingredientType = ingredientManager.getIngredientType(ItemStack.class);
//        registration.addIngredientInfo(stack, ingredientType, new StringTextComponent(info));
//    }
//
//    @Override
//    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
//        registration.addRecipeClickArea(ExampleScreen.class,0,0,28,23, ExampleRecipeCategory.UID);
//    }
//
//    @Override
//    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
//        registration.addRecipeTransferHandler(ExampleContainer.class, ExampleRecipeCategory.UID, 0, 3, 3, 36);
//    }
//}
