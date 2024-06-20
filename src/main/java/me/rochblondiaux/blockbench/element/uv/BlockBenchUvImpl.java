package me.rochblondiaux.blockbench.element.uv;

import com.google.gson.annotations.SerializedName;

public record BlockBenchUvImpl(float[] uv,
                               @SerializedName("texture") String rawTexture) implements BlockBenchUv {

    @Override
    public int texture() {
        if (rawTexture == null)
            return -1;
        return Integer.parseInt(rawTexture);
    }

    @Override
    public boolean hasTexture() {
        return rawTexture != null;
    }

}
