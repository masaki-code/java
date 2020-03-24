package net.masaki_blog.gson.own;

import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class SampleData4 {

    String key = "key";

    Map<String, Inner> map_1 = new LinkedHashMap<>();
    {
        map_1.put("k1", new InnerEx());
        map_1.put("k2", new InnerEx());
        map_1.put("k3", new InnerEx());
    }

    Map<String, InnerEx> map_2 = new LinkedHashMap<>();
    {
        map_2.put("k1", new InnerEx());
        map_2.put("k2", new InnerEx());
        map_2.put("k3", new InnerEx());
    }

    Map<String, Inner> map_3 = new LinkedHashMap<>();
    {
        map_3.put("k1", new InnerEx2());
        map_3.put("k2", new InnerEx2());
        map_3.put("k3", new InnerEx2());
    }

    Map<String, ?> map_4 = new LinkedHashMap<>();
    {
        map_3.put("k1", new InnerEx2());
        map_3.put("k2", new InnerEx2());
        map_3.put("k3", new InnerEx2());
    }


    public static final JsonSerializer<Inner> InnerJsonSerializer = new JsonSerializer<Inner>() {

        @Override
        public JsonElement serialize(Inner src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src.value());
        }

    };

    interface Inner {
        String value();

    }

    static class InnerEx implements Inner {

        String key = "key";

        String val = "val";

        String option = "option";

        @Override
        public String value() {
            return val;
        }

    }

    static class InnerEx2 implements Inner {

        String key = "key";

        String val = "val";

        String option = "option";

        @Override
        public String value() {
            return val;
        }

    }

}
