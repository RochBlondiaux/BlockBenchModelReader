package me.rochblondiaux.blockbench.animation;

import java.util.Map;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

import com.google.gson.annotations.SerializedName;

import me.rochblondiaux.blockbench.animation.animators.BlockbenchAnimator;
import me.rochblondiaux.blockbench.animation.animators.BlockbenchAnimatorImpl;

public record BlockbenchAnimationImpl(
        @SerializedName("uuid") UUID uniqueId,
        String name,
        String loop,
        boolean override,
        float length,
        int snapping,
        @SerializedName("anim_time_update") String animationTimeUpdate,
        @SerializedName("blend_weight") String blendWeight,
        @SerializedName("start_delay") String startDelay,
        @SerializedName("loop_delay") String loopDelay,
        Map<UUID, BlockbenchAnimatorImpl> animators,
        @Nullable BlockbenchAnimatorImpl effectAnimator) implements BlockbenchAnimation {

    @Override
    public @Nullable BlockbenchAnimator animator(UUID uniqueId) {
        return this.animators.get(uniqueId);
    }
}
