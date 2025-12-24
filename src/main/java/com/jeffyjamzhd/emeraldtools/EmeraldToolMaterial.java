package com.jeffyjamzhd.emeraldtools;

public enum EmeraldToolMaterial {
    EMERALD_TOOL(2, 800, 10F, 2F, 22, 30, 2);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final float damageVsEntity;
    private final int enchantability;
    private final int infernalMaxEnchantmentCost;
    private final int infernalMaxNumEnchants;

    EmeraldToolMaterial(int harvestLevel, int durability, float efficiency, float damage,
                                int enchantability, int infernalCost, int infernalMax) {
        this.harvestLevel = harvestLevel;
        this.maxUses = durability;
        this.efficiencyOnProperMaterial = efficiency;
        this.damageVsEntity = damage;
        this.enchantability = enchantability;
        this.infernalMaxEnchantmentCost = infernalCost;
        this.infernalMaxNumEnchants = infernalMax;
    }
}
