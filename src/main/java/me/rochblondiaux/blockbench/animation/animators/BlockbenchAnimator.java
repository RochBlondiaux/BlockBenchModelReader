package me.rochblondiaux.blockbench.animation.animators;

import java.util.List;

import me.rochblondiaux.blockbench.animation.keyframe.BlockbenchKeyFrame;

public interface BlockbenchAnimator {

    String name();

    String type();

    List<? extends BlockbenchKeyFrame> keyFrames();
}
