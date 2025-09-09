package me.rochblondiaux.blockbench.element;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.UUID;
import me.rochblondiaux.blockbench.element.face.BlockBenchElementFace;
import me.rochblondiaux.blockbench.element.uv.BlockBenchUv;
import team.unnamed.creative.base.CubeFace;

public record BlockBenchElementImpl(
        @SerializedName("uuid") UUID uniqueId,
        String type,
        String name,
        boolean boxUv,
        boolean rescale,
        boolean locked,
        @SerializedName("render_order") String renderOrder,
        @SerializedName("allow_mirror_modeling") boolean allowMirrorModeling,
        @SerializedName("autouv") int autoUv,
        int color,
        float inflate,
        float[] from,
        float[] to,
        float[] origin,
        float[] rotation,
        BlockBenchElementFace faces
) implements BlockBenchElement {

    @Override
    public Map<CubeFace, BlockBenchUv> facesMap() {
        return Map.of(
                CubeFace.UP, faces.up(),
                CubeFace.DOWN, faces.down(),
                CubeFace.NORTH, faces.north(),
                CubeFace.SOUTH, faces.south(),
                CubeFace.EAST, faces.east(),
                CubeFace.WEST, faces.west()
        );
    }
}
