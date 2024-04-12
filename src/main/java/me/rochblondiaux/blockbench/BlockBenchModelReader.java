package me.rochblondiaux.blockbench;

import java.io.InputStream;
import java.nio.file.Path;

import org.jetbrains.annotations.NotNull;

import me.rochblondiaux.blockbench.model.BlockBenchModel;

public interface BlockBenchModelReader {

    static @NotNull BlockBenchModelReader reader() {
        return new BlockBenchModelReaderImpl();
    }

    @NotNull BlockBenchModel read(@NotNull InputStream input);

    @NotNull BlockBenchModel read(@NotNull Path path);
}
