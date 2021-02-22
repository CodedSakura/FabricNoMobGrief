package eu.codedsakura.fabricnocreepergrief.mixin;

import net.minecraft.entity.projectile.FireballEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(FireballEntity.class)
public class FireballExplosionMixin {
    @ModifyVariable(method = "onCollision", at = @At("STORE"), ordinal = 0)
    private boolean noGrief(boolean ignored) {
        return false;
    }
}
