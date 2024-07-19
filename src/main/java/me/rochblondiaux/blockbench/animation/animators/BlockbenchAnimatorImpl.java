package me.rochblondiaux.blockbench.animation.animators;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.rochblondiaux.blockbench.animation.keyframe.BlockbenchKeyFrameImpl;

public record BlockbenchAnimatorImpl(
        String name,
        String type,
        @SerializedName("keyframes") List<BlockbenchKeyFrameImpl> keyFrames) implements BlockbenchAnimator {
}
