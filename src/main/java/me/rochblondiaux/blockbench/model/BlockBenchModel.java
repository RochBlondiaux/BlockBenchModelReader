package me.rochblondiaux.blockbench.model;

import java.util.List;
import java.util.Map;

import org.jetbrains.annotations.Nullable;

import me.rochblondiaux.blockbench.animation.BlockbenchAnimation;
import me.rochblondiaux.blockbench.element.BlockBenchElement;
import me.rochblondiaux.blockbench.element.Resolution;
import me.rochblondiaux.blockbench.model.metadata.Metadata;
import me.rochblondiaux.blockbench.outliner.Outliner;
import me.rochblondiaux.blockbench.texture.BlockbenchTexture;
import team.unnamed.creative.model.ItemTransform;

public interface BlockBenchModel {

    String name();

    String identifier();

    @Nullable
    String parent();

    @Nullable
    String credit();

    @Nullable
    String modelIdentifier();

    Metadata metadata();

    Resolution resolution();

    boolean ambientOcclusion();

    boolean frontGuiLight();

    float[] visibleBox();

    String variablePlaceholders();

    List<String> variablePlaceholderButtons();

    List<? extends BlockbenchTexture> textures();

    List<? extends BlockBenchElement> elements();

    Map<String, ? extends ItemTransform> display();

    List<? extends Outliner> outliner();

    List<? extends BlockbenchAnimation> animations();
}
