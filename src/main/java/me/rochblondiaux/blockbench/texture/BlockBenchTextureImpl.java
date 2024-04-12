package me.rochblondiaux.blockbench.texture;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Base64;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

import com.google.gson.annotations.SerializedName;

import team.unnamed.creative.base.Writable;

public record BlockBenchTextureImpl(
        @SerializedName("uuid") UUID uniqueId,
        String path,
        String name,
        String folder,
        String namespace,
        int id,
        int width,
        int height,
        @SerializedName("uv_width") int uvWidth,
        @SerializedName("uv_height") int uvHeight,
        boolean particle,
        @SerializedName("layers_enabled") boolean layersEnabled,
        @SerializedName("render_mode") String renderMode,
        @SerializedName("render_sides") boolean renderSides,
        @SerializedName("frame_time") int frameTime,
        @SerializedName("frame_order_type") String frameOrderType,
        @SerializedName("frame_interpolate") boolean frameInterpolate,
        boolean visible,
        boolean internal,
        boolean saved,
        @SerializedName("relative_path") String relativePath,
        String source
) implements BlockbenchTexture {

    @Override
    public @Nullable Writable asWritable() {
        if (source == null)
            return null;

        return Writable.inputStream(() -> {
            String data = source.substring(source.indexOf(",") + 1);
            byte[] imageContent = Base64.getDecoder().decode(data);
            return new ByteArrayInputStream(imageContent);
        });
    }

    @Override
    public BufferedImage image() {
        if (source == null)
            return null;
        String data = source.substring(source.indexOf(",") + 1);
        byte[] imageContent = Base64.getDecoder().decode(data);
        try (ByteArrayInputStream stream = new ByteArrayInputStream(imageContent)) {
            return javax.imageio.ImageIO.read(stream);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read image from source", e);
        }
    }
}
