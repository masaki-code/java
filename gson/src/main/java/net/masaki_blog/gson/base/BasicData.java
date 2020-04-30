package net.masaki_blog.gson.base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;

public class BasicData {

    @Test
    public void test_String() {
        String data = "test";
        String json = new Gson().toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_int() {
        int data = 100;
        String json = new Gson().toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_Integer() {
        Integer data = 200;
        String json = new Gson().toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_Integer_null() {
        Integer data = null;
        String json = new Gson().toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_list() {
        List<Object> data = Arrays.asList("a", "1", 1);
        String json = new Gson().toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_map() {
        Map<String, Object> data = new HashMap<>();
        data.put("a", "hoge");
        data.put("b", "100");
        data.put("c", 100);
        data.put("d", null);
        String json = new Gson().toJson(data);
        System.out.println(json);
    }

}
