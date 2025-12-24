package com.jeffyjamzhd.emeraldtools.registry;

import btw.item.BTWTags;
import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;

import static com.jeffyjamzhd.emeraldtools.registry.ETItems.*;

public class ETTags {
    public static void register() {
        EmeraldToolsAddon.info("Appending items to tags");

        BTWTags.metalIngots.add(EMERALD_ALLOY);
        BTWTags.highQualityPickaxes.add(EMERALD_PICKAXE);
        BTWTags.highQualityAxes.add(EMERALD_AXE);
        BTWTags.highQualityShovels.add(EMERALD_SHOVEL);
        BTWTags.highQualityHoes.add(EMERALD_HOE);
        BTWTags.swords.add(EMERALD_SWORD);
        BTWTags.shears.add(EMERALD_SHEARS);
    }
}
