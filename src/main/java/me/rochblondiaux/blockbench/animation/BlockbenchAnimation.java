package me.rochblondiaux.blockbench.animation;

import java.util.List;
import java.util.UUID;

import me.rochblondiaux.blockbench.animation.animators.BlockbenchAnimator;

public interface BlockbenchAnimation {

    UUID uniqueId();

    String name();

    String loop();

    boolean override();

    float length();

    int snapping();

    String animationTimeUpdate();

    String blendWeight();

    String startDelay();

    String loopDelay();

    List<? extends BlockbenchAnimator> animators();
}
