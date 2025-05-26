package me.rochblondiaux.blockbench.adapters;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import me.rochblondiaux.blockbench.animation.BlockbenchAnimationImpl;
import me.rochblondiaux.blockbench.animation.animators.BlockbenchAnimatorImpl;

public class BlockbenchAnimationAdapter implements JsonDeserializer<BlockbenchAnimationImpl> {

    @Override
    public BlockbenchAnimationImpl deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonObject())
            throw new JsonParseException("Expected a JSON object for BlockbenchAnimation");

        UUID uniqueId = UUID.fromString(json.getAsJsonObject().get("uuid").getAsString());
        String name = json.getAsJsonObject().get("name").getAsString();
        String loop = json.getAsJsonObject().get("loop").getAsString();
        boolean override = json.getAsJsonObject().get("override").getAsBoolean();
        float length = json.getAsJsonObject().get("length").getAsFloat();
        int snapping = json.getAsJsonObject().get("snapping").getAsInt();
        String animationTimeUpdate = json.getAsJsonObject().get("anim_time_update").getAsString();
        String blendWeight = json.getAsJsonObject().get("blend_weight").getAsString();
        String startDelay = json.getAsJsonObject().get("start_delay").getAsString();
        String loopDelay = json.getAsJsonObject().get("loop_delay").getAsString();

        Map<UUID, BlockbenchAnimatorImpl> animators = new HashMap<>();
        BlockbenchAnimatorImpl effectAnimator = null;
        if (json.getAsJsonObject().has("animators")) {
            for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().get("animators").getAsJsonObject().entrySet()) {
                String key = entry.getKey();
                JsonElement animatorElement = entry.getValue();

                if (key.equals("effects")) {
                    // Effect animators are stored with a special key
                    effectAnimator = context.deserialize(animatorElement, BlockbenchAnimatorImpl.class);
                    continue;
                }

                // Bone animators are stored with a special key
                UUID animatorId = UUID.fromString(key);
                BlockbenchAnimatorImpl animator = context.deserialize(animatorElement, BlockbenchAnimatorImpl.class);
                animators.put(animatorId, animator);
            }
        }

        return new BlockbenchAnimationImpl(
                uniqueId,
                name,
                loop,
                override,
                length,
                snapping,
                animationTimeUpdate,
                blendWeight,
                startDelay,
                loopDelay,
                animators,
                effectAnimator
        );
    }


}
