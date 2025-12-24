package com.jeffyjamzhd.emeraldtools.mixin;

import com.jeffyjamzhd.emeraldtools.impl.IEnumToolMaterial;
import net.minecraft.src.EnumToolMaterial;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Special thanks to Jespacito, in which I have extrapolated some of his
 * code on Refamished (which may have been sourced elsewhere itself, not sure)
 */

@Mixin(EnumToolMaterial.class)
public class EnumToolMaterialMixin implements IEnumToolMaterial {
    @Shadow
    @Final
    @Mutable
    private static EnumToolMaterial[] $VALUES;

    @Unique
    private static final EnumToolMaterial EMERALD = addCustomMaterial("BTW_EMERALD", 3, 500, 10F, 2F, 22, 30, 2);

    @Invoker("<init>")
    public static EnumToolMaterial init(String internalName,
                                        int ordinal, int miningLevel, int durability,
                                        float efficiency, float damage, int enchantability,
                                        int infernalLevel, int infernalCount) {
        throw new AssertionError();
    }

    @Unique
    private static EnumToolMaterial addCustomMaterial(String internalName,
                                                      int level, int uses, float eff,
                                                      float attack, int enchant, int ic, int im) {
        ArrayList<EnumToolMaterial> variants = new ArrayList<>(Arrays.asList($VALUES));
        EnumToolMaterial material = init(internalName, variants.get(variants.size() - 1).ordinal() + 1, level,uses,eff,attack,enchant,ic,im);
        variants.add(material);
        EnumToolMaterialMixin.$VALUES = variants.toArray(new EnumToolMaterial[0]);
        return material;
    }

    /*
            IEnumToolMaterial
     */

    @Override
    public EnumToolMaterial et$getEmeraldMaterial() {
        return EMERALD;
    }
}
