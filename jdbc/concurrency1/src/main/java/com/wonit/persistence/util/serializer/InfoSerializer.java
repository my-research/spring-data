package com.wonit.persistence.util.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.wonit.core.user.Info;
import java.lang.reflect.Type;

public class InfoSerializer implements JsonSerializer<Info> {
    @Override
    public JsonElement serialize(Info src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("name", src.getName());
        return jsonObject;
    }
}
