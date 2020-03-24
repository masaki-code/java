package net.masaki_blog.gson.vo;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValueObject {

    private String value;

    public static final JsonSerializer<ValueObject> JSON_SERIALIZER = new JsonSerializer<ValueObject>() {

        @Override
        public JsonElement serialize(ValueObject src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src.value);
        }

    };

}
