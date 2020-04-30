package net.masaki_blog.gson.base;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;

public class ClassData {

    public static class Sample_1 {

        String a = "hoge";

        String b = "fuga";

    }

    @Test
    public void test_Sample_1() {
        Gson gson = new Gson();
        Object data = new Sample_1();
        String json = gson.toJson(data);
        System.out.println("Sample_1 : " + json);
    }

    public static class Sample_2 {

        String b = "fuga";

        String a = "hoge";

    }

    @Test
    public void test_Sample_2() {
        Gson gson = new Gson();
        Object data = new Sample_2();
        String json = gson.toJson(data);
        System.out.println("Sample_2 : " + json);
    }

    public static class Sample_3 {

        String a = "hoge";

        List<?> b = Arrays.asList("c1", "c2");

    }

    @Test
    public void test_Sample_3() {
        Gson gson = new Gson();
        Object data = new Sample_3();
        String json = gson.toJson(data);
        System.out.println("Sample_3 : " + json);
    }

    public static class Sample_4 {

        String a = "hoge";

        Map<String, String> b = new LinkedHashMap<>();
        {
            b.put("c1", "d1");
            b.put("c2", "d2");
        }

    }

    @Test
    public void test_Sample_4() {
        Gson gson = new Gson();
        Object data = new Sample_4();
        String json = gson.toJson(data);
        System.out.println("Sample_4 : " + json);
    }

}
