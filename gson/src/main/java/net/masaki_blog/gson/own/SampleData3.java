package net.masaki_blog.gson.own;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class SampleData3 {

    String key = "key";

    @Expose
    Map<String, Inner> map = new LinkedHashMap<>();
    {
        map.put("k1", new Inner());
        map.put("k2", new Inner());
        map.put("k3", new Inner());
    }

    public static final TypeAdapter<Inner> InnerTypeAdapter = new TypeAdapter<Inner>() {
        @Override
        public Inner read(JsonReader in) throws IOException {
            return null;
        }

        @Override
        public void write(JsonWriter out, Inner value) throws IOException {
            out.value(value.val);
        }

    };

    public static final JsonSerializer<Inner> InnerJsonSerializer = new JsonSerializer<Inner>() {

        @Override
        public JsonElement serialize(Inner src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src.val);
        }

    };

    static class Inner {

        String key = "key";

        @Expose(serialize = true)
        String val = "val";

        String option = "option";

    }

}
