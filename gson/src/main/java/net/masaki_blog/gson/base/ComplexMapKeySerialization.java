package net.masaki_blog.gson.base;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ComplexMapKeySerialization {

    private static class Key {

    }

    Map<Object, String> a = new LinkedHashMap<>();
    {
        a.put(new Key(), "value");
    }

    @Test
    public void test_1() {
        Gson gson = new Gson();
        String json = gson.toJson(a);
        System.out.println(json);
    }

    @Test
    public void test_2() {
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gson.toJson(a);
        System.out.println(json);
    }

}
