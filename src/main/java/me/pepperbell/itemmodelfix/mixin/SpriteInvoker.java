package me.pepperbell.itemmodelfix.mixin;

import net.minecraft.client.texture.Sprite;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Sprite.class)
public interface SpriteInvoker {
    @Invoker("getFrameCount")
    public int getFrames();
}
