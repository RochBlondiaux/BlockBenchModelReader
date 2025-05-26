package me.rochblondiaux.blockbench.animation;

import java.util.Map;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

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

    Map<UUID, ? extends BlockbenchAnimator> animators();

    @Nullable BlockbenchAnimator effectAnimator();

    @Nullable BlockbenchAnimator animator(UUID uniqueId);
}
