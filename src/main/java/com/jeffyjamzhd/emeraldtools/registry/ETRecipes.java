package com.jeffyjamzhd.emeraldtools.registry;

import api.item.tag.TagOrStack;
import btw.crafting.manager.CauldronStokedCraftingManager;
import btw.crafting.manager.CrucibleStokedCraftingManager;
import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;
import net.minecraft.src.CraftingManager;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class ETRecipes {
    public static void register() {
        EmeraldToolsAddon.info("Registering recipes");

        registerCrucibleRecipes();
        registerCauldronRecipes();
        registerToolRecipes();
    }

    private static void registerCrucibleRecipes() {
        CrucibleStokedCraftingManager manager = CrucibleStokedCraftingManager.getInstance();

        // Alloying
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY),
                new TagOrStack[]{new ItemStack(Item.ingotGold), new ItemStack(Item.emerald, 2)}
        );

        // Recycling
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY, 1),
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_SHOVEL)},
                false
        );
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY, 1),
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_HOE)},
                false
        );
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY, 2),
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_SWORD)},
                false
        );
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY, 2),
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_SHEARS)},
                false
        );
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY, 2),
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_AXE)},
                false
        );
        manager.addRecipe(
                new ItemStack(ETItems.EMERALD_ALLOY, 3),
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_PICKAXE)},
                false
        );
    }

    private static void registerCauldronRecipes() {
        CauldronStokedCraftingManager manager = CauldronStokedCraftingManager.getInstance();

        // Decraft
        manager.addRecipe(
                new ItemStack[]{new ItemStack(Item.emerald, 2), new ItemStack(Item.goldNugget, 3)},
                new TagOrStack[]{new ItemStack(ETItems.EMERALD_ALLOY)});
    }

    private static void registerToolRecipes() {
        CraftingManager.getInstance().addRecipe(new ItemStack(ETItems.EMERALD_SWORD),
                "e",
                "e",
                "|",
                'e', ETItems.EMERALD_ALLOY,
                '|', Item.stick);
        CraftingManager.getInstance().addRecipe(new ItemStack(ETItems.EMERALD_PICKAXE),
                "eee",
                " | ",
                " | ",
                'e', ETItems.EMERALD_ALLOY,
                '|', Item.stick);
        CraftingManager.getInstance().addRecipe(new ItemStack(ETItems.EMERALD_HOE),
                "e| ",
                " | ",
                " | ",
                'e', ETItems.EMERALD_ALLOY,
                '|', Item.stick);
        CraftingManager.getInstance().addRecipe(new ItemStack(ETItems.EMERALD_AXE),
                "e  ",
                "e| ",
                " | ",
                'e', ETItems.EMERALD_ALLOY,
                '|', Item.stick);
        CraftingManager.getInstance().addRecipe(new ItemStack(ETItems.EMERALD_SHOVEL),
                "e",
                "|",
                "|",
                'e', ETItems.EMERALD_ALLOY,
                '|', Item.stick);
        CraftingManager.getInstance().addRecipe(new ItemStack(ETItems.EMERALD_SHEARS),
                "e ",
                " e",
                'e', ETItems.EMERALD_ALLOY);
    }
}
