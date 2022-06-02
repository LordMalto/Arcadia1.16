//package com.entisy.arcadia.core.init;
//
//import net.minecraft.item.crafting.IRecipe;
//import net.minecraft.item.crafting.IRecipeSerializer;
//import net.minecraft.item.crafting.IRecipeType;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.registry.Registry;
//import net.minecraftforge.fml.RegistryObject;
//
//public class ModRecipes {
//
//    // ELECTRICAL FURNACE
//    public static final IRecipeSerializer<ExampleRecipe> ELECTRICAL_FURNACE_RECIPE_SERIALIZER = new ExampleRecipeSerializer();
//    public static final IRecipeType<IExampleRecipe> ELECTRICAL_FURNACE_TYPE = registerType(
//            IExampleRecipe.RECIPE_TYPE_ID);
//
//    // SERIALIZERS
//    public static final RegistryObject<IRecipeSerializer<?>> EXAMPLE_SERIALIZER = RECIPE_SERIALIZERS
//            .register("example", () -> EXAMPLE_RECIPE_SERIALIZER);
//
//    @SuppressWarnings({"unchecked", "rawtypes"})
//    private static <T extends IRecipeType> T registerType(ResourceLocation recipeTypeId) {
//        return (T) Registry.register(Registry.RECIPE_TYPE, recipeTypeId, new RecipeType<>());
//    }
//
//    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T> {
//        @Override
//        public String toString() {
//            return Registry.RECIPE_TYPE.getKey(this).toString();
//        }
//    }
//}
