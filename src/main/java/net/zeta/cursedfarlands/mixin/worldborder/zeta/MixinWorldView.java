package net.zeta.cursedfarlands.mixin.worldborder.zeta;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WorldView.class)
public interface MixinWorldView extends BlockRenderView {
    /**
     * @author
     */
    @Overwrite
    default int getLightLevel(BlockPos pos, int ambientDarkness) {
        return pos.getX() >= -2147483647 && pos.getZ() >= -2147483647 && pos.getX() < 2147483647 && pos.getZ() < 2147483647 ? this.getBaseLightLevel(pos, ambientDarkness) : 15;
    }
}
