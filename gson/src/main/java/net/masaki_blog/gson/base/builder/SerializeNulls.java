package net.masaki_blog.gson.base.builder;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializeNulls {

    Map<Object, String> a = new LinkedHashMap<>();
    {
        a.put("a1", "b");
        a.put("a2", null);
    }

    @Test
    public void test_1() {
        Gson gson = new Gson();
        String json = gson.toJson(a);
        System.out.println(json);
    }

    @Test
    public void test_2() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(a);
        System.out.println(json);
    }

}
