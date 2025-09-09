package me.rochblondiaux.blockbench.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;
import me.rochblondiaux.blockbench.outliner.OutlinerImpl;

public class OutlinerGsonAdapter implements JsonDeserializer<OutlinerImpl> {

    @Override
    public OutlinerImpl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonPrimitive())
            return OutlinerImpl.redirect(UUID.fromString(jsonElement.getAsString()));
        UUID uuid = UUID.fromString(jsonElement.getAsJsonObject().get("uuid").getAsString());
        String name = jsonElement.getAsJsonObject().get("name").getAsString();
        int color = jsonElement.getAsJsonObject().get("color").getAsInt();
        boolean export = this.getIfPresent(jsonElement, "export");
        boolean mirrorUV = this.getIfPresent(jsonElement, "mirrorUV");
        String nbt = jsonElement.getAsJsonObject().has("nbt") ? jsonElement.getAsJsonObject().get("nbt").getAsString() : null;
        Float[] origin = jsonElement.getAsJsonObject().has("origin") ? jsonElement.getAsJsonObject().get("origin").getAsJsonArray().asList().stream().map(JsonElement::getAsFloat).toArray(Float[]::new) : new Float[]{0.0f, 0.0f, 0.0f};
        Float[] rotation = jsonElement.getAsJsonObject().has("rotation") ? jsonElement.getAsJsonObject().get("rotation").getAsJsonArray().asList().stream().map(JsonElement::getAsFloat).toArray(Float[]::new) : new Float[]{0.0f, 0.0f, 0.0f};
        boolean visible = this.getIfPresent(jsonElement, "visible");
        List<OutlinerImpl> children = jsonElement.getAsJsonObject()
                .get("children")
                .getAsJsonArray()
                .asList()
                .stream()
                .map(element -> deserialize(element, type, jsonDeserializationContext))
                .toList();

        return new OutlinerImpl(uuid, name, color, export, mirrorUV, nbt, toPrimitiveFloatArray(origin), toPrimitiveFloatArray(rotation), visible, children);
    }

    private boolean getIfPresent(JsonElement jsonElement, String key) {
        return jsonElement.getAsJsonObject().has(key) && jsonElement.getAsJsonObject().get(key).getAsBoolean();
    }

    private float[] toPrimitiveFloatArray(Float[] array) {
        float[] result = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

}
