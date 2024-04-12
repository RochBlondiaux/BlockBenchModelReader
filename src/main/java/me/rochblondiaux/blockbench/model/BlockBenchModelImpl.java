package me.rochblondiaux.blockbench.model;

import java.util.List;
import java.util.Map;

import org.jetbrains.annotations.Nullable;

import com.google.gson.annotations.SerializedName;

import me.rochblondiaux.blockbench.element.BlockBenchElementImpl;
import me.rochblondiaux.blockbench.element.Resolution;
import me.rochblondiaux.blockbench.model.metadata.MetadataImpl;
import me.rochblondiaux.blockbench.texture.BlockBenchTextureImpl;
import team.unnamed.creative.model.ItemTransformImpl;

public record BlockBenchModelImpl(
        String name,
        String identifier,
        @Nullable String parent,
        @Nullable String credit,
        @SerializedName("model_identifier") String modelIdentifier,
        @SerializedName("meta") MetadataImpl metadata,
        @SerializedName("ambientocclusion") boolean ambientOcclusion,
        @SerializedName("front_gui_light") boolean frontGuiLight,
        @SerializedName("visible_box") float[] visibleBox,
        @SerializedName("variable_placeholders") String variablePlaceholders,
        @SerializedName("variable_placeholder_buttons") List<String> variablePlaceholderButtons,
        Resolution resolution,
        List<BlockBenchElementImpl> elements,
        List<BlockBenchTextureImpl> textures,
        Map<String, ItemTransformImpl> display
) implements BlockBenchModel {

}
