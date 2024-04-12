package me.rochblondiaux.blockbench.element.face;

import me.rochblondiaux.blockbench.element.uv.BlockBenchUvImpl;

public record BlockBenchElementFace(
        BlockBenchUvImpl north,
        BlockBenchUvImpl east,
        BlockBenchUvImpl south,
        BlockBenchUvImpl west,
        BlockBenchUvImpl up,
        BlockBenchUvImpl down) {
}
