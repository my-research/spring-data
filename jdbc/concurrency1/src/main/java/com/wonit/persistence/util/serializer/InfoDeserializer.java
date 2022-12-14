package com.wonit.persistence.util.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.wonit.core.user.Info;
import java.lang.reflect.Type;

public class InfoDeserializer implements JsonDeserializer<Info> {
    @Override
    public Info deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        String name = Serializer.getInstance()
                .deserialize(json.getAsJsonObject().get("name").getAsString(), String.class);

        return Info.of(name);
    }
}
