package me.rochblondiaux.blockbench.outliner;

import java.util.ArrayList;
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
        Float[] origin,
        Float[] rotation,
        boolean visible,
        List<OutlinerImpl> children) implements Outliner {

    @Override
    public boolean redirection() {
        return this.name == null;
    }

    public static OutlinerImpl redirect(UUID uniqueId) {
        return new OutlinerImpl(uniqueId, null, 0, false, false, null, new Float[]{0f, 0f, 0f}, new Float[]{0f, 0f, 0f}, true, new ArrayList<>());
    }
}
