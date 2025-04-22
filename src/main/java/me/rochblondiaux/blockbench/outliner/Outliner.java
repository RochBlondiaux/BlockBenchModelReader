package me.rochblondiaux.blockbench.outliner;

import java.util.List;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

public interface Outliner {

    UUID uniqueId();

    String name();

    boolean export();

    boolean mirrorUV();

    boolean visible();

    Float[] origin();

    int color();

    @Nullable
    String nbt();

    List<? extends Outliner> children();

    boolean redirection();
}
