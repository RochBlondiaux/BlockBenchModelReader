package me.rochblondiaux.blockbench;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

import org.jetbrains.annotations.NotNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import me.rochblondiaux.blockbench.adapters.OutlinerGsonAdapter;
import me.rochblondiaux.blockbench.model.BlockBenchModel;
import me.rochblondiaux.blockbench.model.BlockBenchModelImpl;
import me.rochblondiaux.blockbench.outliner.OutlinerImpl;

public class BlockBenchModelReaderImpl implements BlockBenchModelReader {

    private static final Gson GSON = new GsonBuilder()
            .registerTypeHierarchyAdapter(OutlinerImpl.class, new OutlinerGsonAdapter())
            .create();

    @Override
    public @NotNull BlockBenchModel read(@NotNull InputStream input) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input))) {
            return GSON.fromJson(bufferedReader, BlockBenchModelImpl.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read BlockBench model from input stream", e);
        }
    }

    @Override
    public @NotNull BlockBenchModel read(@NotNull Path path) {
        try (InputStream input = Files.newInputStream(path)) {
            return read(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read BlockBench model from path: " + path, e);
        }
    }
}
