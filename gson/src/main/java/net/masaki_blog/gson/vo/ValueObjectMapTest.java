package net.masaki_blog.gson.vo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ValueObjectMapTest {

    @Test
    public void toJsonTest() {

        Map<String, ValueObject> map = new LinkedHashMap<>();

        map.put("k1", new ValueObject("vo1"));
        map.put("k2", new ValueObject("vo2"));
        map.put("k3", new ValueObject("vo3"));

        Gson gson = new Gson();
        String json = gson.toJson(map);
        System.out.println(json);
    }

    @Test
    public void toJsonFromJsonSerializerTest() {

        Map<String, ValueObject> map = new LinkedHashMap<>();

        map.put("k1", new ValueObject("vo1"));
        map.put("k2", new ValueObject("vo2"));
        map.put("k3", new ValueObject("vo3"));

        Gson gson = new GsonBuilder().registerTypeAdapter(

                ValueObject.class, ValueObject.JSON_SERIALIZER).create();

        String json = gson.toJson(map);
        System.out.println(json);

    }

}
