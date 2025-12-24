package com.jeffyjamzhd.emeraldtools.registry;

import api.item.items.*;
import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;
import com.jeffyjamzhd.emeraldtools.item.ShearsItemEmerald;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ETItems {
    private static final int START_ID = 31011;

    public static final Item EMERALD_ALLOY = new Item(START_ID)
            .setCreativeTab(CreativeTabs.tabMaterials)
            .setTextureName("emeraldtools:emerald_ingot")
            .setUnlocalizedName("emerald_ingot");
    public static final Item EMERALD_SHOVEL = new ShovelItem(START_ID + 1, EmeraldToolsAddon.EMERALD_MATERIAL)
            .setFull3D()
            .setCreativeTab(CreativeTabs.tabTools)
            .setTextureName("emeraldtools:emerald_shovel")
            .setUnlocalizedName("emerald_shovel");
    public static final Item EMERALD_PICKAXE = new PickaxeItem(START_ID + 2, EmeraldToolsAddon.EMERALD_MATERIAL)
            .setFull3D()
            .setCreativeTab(CreativeTabs.tabTools)
            .setTextureName("emeraldtools:emerald_pickaxe")
            .setUnlocalizedName("emerald_pickaxe");
    public static final Item EMERALD_AXE = new AxeItem(START_ID + 3, EmeraldToolsAddon.EMERALD_MATERIAL)
            .setFull3D()
            .setCreativeTab(CreativeTabs.tabTools)
            .setTextureName("emeraldtools:emerald_axe")
            .setUnlocalizedName("emerald_axe");
    public static final Item EMERALD_HOE = new HoeItem(START_ID + 4, EmeraldToolsAddon.EMERALD_MATERIAL)
            .setFull3D()
            .setCreativeTab(CreativeTabs.tabTools)
            .setTextureName("emeraldtools:emerald_hoe")
            .setUnlocalizedName("emerald_hoe");
    public static final Item EMERALD_SHEARS = new ShearsItemEmerald(START_ID + 5)
            .setFull3D()
            .setCreativeTab(CreativeTabs.tabTools);
    public static final Item EMERALD_SWORD = new SwordItem(START_ID + 6, EmeraldToolsAddon.EMERALD_MATERIAL)
            .setFull3D()
            .setCreativeTab(CreativeTabs.tabCombat)
            .setTextureName("emeraldtools:emerald_sword")
            .setUnlocalizedName("emerald_sword");

    public static void register() {
        EmeraldToolsAddon.info("Registering items");
    }
}
