package com.jeffyjamzhd.emeraldtools.registry;

import api.achievement.AchievementEvents;
import api.achievement.AchievementProvider;
import btw.achievement.BTWAchievements;
import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;
import net.minecraft.src.ResourceLocation;

public class ETAchievements {
    public static void register() {
        EmeraldToolsAddon.info("Registering achievements");

        AchievementProvider.getBuilder(AchievementEvents.ItemEvent.class)
                .name(new ResourceLocation("emeraldtools", "craft_alloy"))
                .icon(ETItems.EMERALD_ALLOY)
                .displayLocation(14, -4)
                .triggerCondition(itemStack -> itemStack.itemID == ETItems.EMERALD_ALLOY.itemID)
                .parents(BTWAchievements.CRAFT_CRUCIBLE)
                .build()
                .registerAchievement(BTWAchievements.TAB_IRON_AGE);
    }
}
