package com.jeffyjamzhd.emeraldtools;

import api.BTWAddon;
import api.block.beacon.BeaconEffectHandler;
import btw.block.tileentity.beacon.BTWBeaconEffects;
import com.jeffyjamzhd.emeraldtools.registry.*;
import net.minecraft.src.EnumToolMaterial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmeraldToolsAddon extends BTWAddon {
    private static EmeraldToolsAddon INSTANCE;
    private static Logger LOGGER;

    public static EnumToolMaterial EMERALD_MATERIAL = EnumToolMaterial.WOOD.et$getEmeraldMaterial();

    public EmeraldToolsAddon() {
        super();

        INSTANCE = this;
        LOGGER = LogManager.getLogger(this.getModID());
    }


    @Override
    public void initialize() {
        info("BTW Emerald Tools init phase!");

        ETBlocks.register();
        ETItems.register();
        ETTags.register();
        ETRecipes.register();
        ETTrades.register();
        ETAchievements.register();
        
        // Add beacon effect
        BeaconEffectHandler.addBeaconEffect(ETBlocks.EMERALD_INGOT_BLOCK.blockID, BTWBeaconEffects.LOOTING_EFFECT);
    }

    /**
     * Logs error to console, with args
     */
    public static void error(String message, Object... args) {
        if (LOGGER != null) {
            LOGGER.error(message, args);
        }
    }

    /**
     * Logs warning to console, with args
     */
    public static void warn(String message, Object... args) {
        if (LOGGER != null) {
            LOGGER.warn(message, args);
        }
    }

    /**
     * Logs info to console, with args
     */
    public static void info(String message, Object... args) {
        if (LOGGER != null) {
            LOGGER.info(message, args);
        }
    }

    /**
     * Logs error to console
     */
    public static void error(String message) {
        error(message, new Object[0]);
    }

    /**
     * Logs warning to console
     */
    public static void warn(String message) {
        warn(message, new Object[0]);
    }

    /**
     * Logs info to console
     */
    public static void info(String message) {
        info(message, new Object[0]);
    }
}