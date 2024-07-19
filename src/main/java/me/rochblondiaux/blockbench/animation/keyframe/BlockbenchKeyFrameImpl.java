package me.rochblondiaux.blockbench.animation.keyframe;

import java.util.List;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

public record BlockbenchKeyFrameImpl(
        @SerializedName("uuid") UUID uniqueId,
        String name,
        String type,
        String channel,
        float time,
        int color,
        String interpolation,
        @SerializedName("bezier_linked") boolean bezierLinked,
        @SerializedName("bezier_left_time") float[] bezierLeftTime,
        @SerializedName("bezier_left_value") float[] bezierLeftValue,
        @SerializedName("bezier_right_time") float[] bezierRightTime,
        @SerializedName("bezier_right_value") float[] bezierRightValue,
        @SerializedName("data_points") List<DataPoint> dataPoints) implements BlockbenchKeyFrame {
}
