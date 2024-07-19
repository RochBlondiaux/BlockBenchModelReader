package me.rochblondiaux.blockbench.animation.keyframe;

import java.util.List;
import java.util.UUID;

public interface BlockbenchKeyFrame {

    UUID uniqueId();

    String channel();

    List<DataPoint> dataPoints();

    float time();

    int color();

    String interpolation();

    boolean bezierLinked();

    float[] bezierLeftTime();

    float[] bezierLeftValue();

    float[] bezierRightTime();

    float[] bezierRightValue();
}
