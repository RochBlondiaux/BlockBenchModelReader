package me.rochblondiaux.blockbench.animation.keyframe;

public record DataPoint(String x, String y, String z) {

    public float xAsFloat() {
        if (x == null)
            return 0;
        return Float.parseFloat(x);
    }

    public float yAsFloat() {
        if (y == null)
            return 0;
        return Float.parseFloat(y);
    }

    public float zAsFloat() {
        if (z == null)
            return 0;
        return Float.parseFloat(z);
    }
}
