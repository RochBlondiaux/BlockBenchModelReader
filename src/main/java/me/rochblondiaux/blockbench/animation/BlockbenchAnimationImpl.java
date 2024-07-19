package me.rochblondiaux.blockbench.animation;

import java.util.List;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

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
        List<BlockbenchAnimatorImpl> animators) implements BlockbenchAnimation {
}
