package deboni.potatologistics;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class PotatoRecipes implements RecipeEntrypoint {
    public static final RecipeNamespace RN = new RecipeNamespace();
    public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
    @Override
    public void onRecipesReady() {
        RN.register("workbench", WORKBENCH);
        Registries.RECIPES.register(PotatoLogisticsMod.MOD_ID, RN);
        DataLoader.loadRecipes("/assets/potatologistics/recipes/workbench.json");
        DataLoader.loadRecipes("/assets/potatologistics/recipes/furnace.json");
    }
}
