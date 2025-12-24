package com.jeffyjamzhd.emeraldtools.item;

import com.jeffyjamzhd.emeraldtools.EmeraldToolsAddon;
import net.minecraft.src.*;

public class ShearsItemEmerald extends ItemShears {
    public ShearsItemEmerald(int par1) {
        super(par1);
        this.setMaxDamage(250);
        this.setInfernalMaxEnchantmentCost(EmeraldToolsAddon.EMERALD_MATERIAL.getInfernalMaxEnchantmentCost());
        this.setInfernalMaxNumEnchants(EmeraldToolsAddon.EMERALD_MATERIAL.getInfernalMaxNumEnchants());
        this.setUnlocalizedName("emerald_shears");
        this.setTextureName("emeraldtools:emerald_shears");
    }

    public float getStrVsBlock(ItemStack var1, World var2, Block var3, int var4, int var5, int var6) {
        return super.isEfficientVsBlock(var1, var2, var3, var4, var5, var6) ? super.getStrVsBlock(var1, var2, var3, var4, var5, var6) * 1.33F : super.getStrVsBlock(var1, var2, var3, var4, var5, var6);
    }

    public boolean isDamagedInCrafting() {
        return false;
    }

    public boolean isConsumedInCrafting() {
        return false;
    }

    public int getItemEnchantability() {
        return EmeraldToolsAddon.EMERALD_MATERIAL.getEnchantability();
    }
}
