package me.rochblondiaux.blockbench.element;

import java.util.Map;
import java.util.UUID;

import me.rochblondiaux.blockbench.element.face.BlockBenchElementFace;
import me.rochblondiaux.blockbench.element.uv.BlockBenchUv;
import team.unnamed.creative.base.CubeFace;

public interface BlockBenchElement {

    UUID uniqueId();

    String type();

    String name();

    boolean boxUv();

    boolean rescale();

    boolean locked();

    boolean visibility();

    String renderOrder();

    boolean allowMirrorModeling();

    int autoUv();

    int color();

    float inflate();

    float[] from();

    float[] to();

    float[] origin();

    float[] rotation();

    BlockBenchElementFace faces();

    Map<CubeFace, BlockBenchUv> facesMap();
}
