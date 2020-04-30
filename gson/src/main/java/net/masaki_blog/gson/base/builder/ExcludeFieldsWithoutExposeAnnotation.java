package net.masaki_blog.gson.base.builder;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class ExcludeFieldsWithoutExposeAnnotation {

    public static class Sample_1 {

        String a = "hoge";

        String b = "fuga";

    }

    @Test
    public void test_Sample_1() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Object data = new Sample_1();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    public static class Sample_2 {

        String a = "hoge";

        @Expose
        String b = "fuga";

    }

    @Test
    public void test_Sample_2() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        Object data = new Sample_2();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    public static class Sample_3 {

        String a = "hoge";

        @Expose
        List<?> b = Arrays.asList("c1", "c2");

    }

    @Test
    public void test_Sample_3() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Object data = new Sample_3();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    public static class Sample_4 {

        String a = "hoge";

        @Expose
        Map<String, String> b = new LinkedHashMap<>();
        {
            b.put("c1", "d1");
            b.put("c2", "d2");
        }

    }

    @Test
    public void test_Sample_4() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Object data = new Sample_4();
        String json = gson.toJson(data);
        System.out.println(json);
    }

}
