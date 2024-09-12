package com.juiceybeans.juiceytech.common.data;

import com.juiceybeans.juiceytech.data.recipe.chain.SculkChainRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class JTRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        SculkChainRecipes.init(provider);
        miscRecipes(provider);
    }

    private static void miscRecipes(Consumer<FinishedRecipe> provider) {
    }
}
