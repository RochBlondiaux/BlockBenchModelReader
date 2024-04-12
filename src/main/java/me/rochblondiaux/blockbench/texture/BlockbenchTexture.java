package me.rochblondiaux.blockbench.texture;

import java.awt.image.BufferedImage;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

import team.unnamed.creative.base.Writable;

public interface BlockbenchTexture {

    UUID uniqueId();

    int id();

    String path();

    String name();

    String folder();

    String namespace();

    int width();

    int height();

    int uvWidth();

    int uvHeight();

    boolean particle();

    boolean layersEnabled();

    String renderMode();

    boolean renderSides();

    int frameTime();

    String frameOrderType();

    boolean frameInterpolate();

    boolean visible();

    boolean internal();

    boolean saved();

    String relativePath();

    String source();

    @Nullable Writable asWritable();

    @Nullable BufferedImage image();
}
