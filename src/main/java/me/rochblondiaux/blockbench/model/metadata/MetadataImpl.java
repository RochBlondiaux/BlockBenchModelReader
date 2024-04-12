package me.rochblondiaux.blockbench.model.metadata;

public record MetadataImpl(
        String formatVersion,
        String modelFormat,
        boolean boxUv) implements Metadata {
}
