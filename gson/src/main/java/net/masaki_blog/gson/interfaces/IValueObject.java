package net.masaki_blog.gson.interfaces;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public interface IValueObject {

    public String getValue();

    public static final JsonSerializer<IValueObject> JSON_SERIALIZER = new JsonSerializer<IValueObject>() {

        @Override
        public JsonElement serialize(IValueObject src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src.getValue());
        }

    };

}
