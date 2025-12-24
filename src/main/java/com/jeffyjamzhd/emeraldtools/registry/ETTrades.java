package com.jeffyjamzhd.emeraldtools.registry;

import api.entity.mob.villager.TradeProvider;
import api.entity.mob.villager.VillagerTrade;
import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;
import net.minecraft.src.Item;

public class ETTrades {
    public static void register() {
        EmeraldToolsAddon.info("Registering trades");

        TradeProvider.getBuilder().name("emeraldtools:enchant_emerald_tools")
                .profession(2)
                .level(2)
                .variants()
                .addTradeVariant(generateEnchantTrade("emeraldtools:enchant_emerald_pickaxe", ETItems.EMERALD_PICKAXE))
                .addTradeVariant(generateEnchantTrade("emeraldtools:enchant_emerald_sword", ETItems.EMERALD_SWORD))
                .addTradeVariant(generateEnchantTrade("emeraldtools:enchant_emerald_axe", ETItems.EMERALD_AXE))
                .finishVariants().weight(1.0F).addToTradeList();
    }

    private static VillagerTrade generateEnchantTrade(String name, Item tool) {
        return TradeProvider.getBuilder().name(name)
                .profession(2)
                .level(2)
                .enchant()
                .itemToEnchant(tool.itemID)
                .secondaryEmeraldCost(2, 4)
                .build();
    }
}
