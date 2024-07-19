package me.rochblondiaux.blockbench.animation.animators;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.rochblondiaux.blockbench.animation.keyframe.BlockbenchKeyFrame;

public record BlockbenchAnimatorImpl(
        String name,
        String type,
        @SerializedName("keyframes") List<? extends BlockbenchKeyFrame> keyFrames) implements BlockbenchAnimator {
}
