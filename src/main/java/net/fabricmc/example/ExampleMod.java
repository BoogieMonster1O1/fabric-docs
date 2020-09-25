package net.fabricmc.example;

import net.minecraft.recipe.RecipeType;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.recipe.ExampleRecipe;

public class ExampleMod implements ModInitializer {
    public static final RecipeType<ExampleRecipe> RECIPE_TYPE = RecipeType.register("example:recipe_type");

    @Override
    public void onInitialize() {

    }
}
