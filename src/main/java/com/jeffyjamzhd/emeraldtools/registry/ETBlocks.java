package com.jeffyjamzhd.emeraldtools.registry;

import btw.block.blocks.OreStorageBlock;
import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;

import static btw.block.BTWBlocks.gemStepSound;

public class ETBlocks {
    public static Block EMERALD_INGOT_BLOCK;

    public static void register() {
        EmeraldToolsAddon.info("Registering blocks");

        EMERALD_INGOT_BLOCK = new OreStorageBlock(777) // lucky!
                .setHardness(5F)
                .setResistance(10F)
                .setStepSound(gemStepSound)
                .setUnlocalizedName("emeraldIngotBlock")
                .setTextureName("emeraldtools:emerald_ingot_block");
        Item.itemsList[777] = new ItemBlock(777 - 256);
    }
}
