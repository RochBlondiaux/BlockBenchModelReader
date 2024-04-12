package me.rochblondiaux.blockbench.element.uv;

public record BlockBenchUvImpl(float[] uv,
                               String rawTexture) implements BlockBenchUv {

    @Override
    public boolean hasTexture() {
        return rawTexture != null;
    }

}
