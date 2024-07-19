package me.rochblondiaux.blockbench.outliner;

import java.util.List;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

import com.google.gson.annotations.SerializedName;

public record OutlinerImpl(
        @SerializedName("uuid") UUID uniqueId,
        String name,
        int color,
        boolean export,
        @SerializedName("mirror_uv") boolean mirrorUV,
        @Nullable String nbt,
        float[] origin,
        boolean visible,
        List<OutlinerImpl> children) implements Outliner {
}
