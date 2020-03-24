package net.masaki_blog.gson.base;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SampleDataTest2 {

    private List<?> list = Arrays.asList(

            new SampleData1(), //
            new SampleData2(), //
            new SampleData3(), //
            new SampleData4(), //

            map(), //

            ""

    );

    private Map<String, Map<String, String>> map() {
        Map<String, String> innerMap = new LinkedHashMap<>();
        innerMap.put("innerKey", "innerVal");

        Map<String, Map<String, String>> map = new LinkedHashMap<>();
        map.put("key", innerMap);

        return map;

    }

    @Test
    public void test_1() {
        System.out.println("-----------");
        System.out.println("Gson");
        System.out.println("-----------");
        for (Object data : list) {
            Gson gson = new Gson();
            String json = gson.toJson(data);
            System.out.println(json);

        }
    }

    @Test
    public void test_2() {
        System.out.println("-----------");
        System.out.println("excludeFieldsWithoutExposeAnnotation");
        System.out.println("-----------");

        for (Object data : list) {
            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
            String json = gson.toJson(data);

            System.out.println(json);

        }
    }

    @Test
    public void test_3() {
        System.out.println("-----------");
        System.out.println("enableComplexMapKeySerialization");
        System.out.println("-----------");

        for (Object data : list) {
            Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
            String json = gson.toJson(data);

            System.out.println(json);

        }
    }

    @Test
    public void test_4() {
        System.out.println("-----------");
        System.out.println("generateNonExecutableJson");
        System.out.println("-----------");
        for (Object data : list) {
            Gson gson = new GsonBuilder().generateNonExecutableJson().create();
            String json = gson.toJson(data);
            System.out.println(json);

        }
    }

    @Test
    public void test_5() {
        System.out.println("-----------");
        System.out.println("excludeFieldsWithModifiers");
        System.out.println("-----------");
        for (Object data : list) {
            Gson gson = new GsonBuilder().excludeFieldsWithModifiers(0).create();
            String json = gson.toJson(data);
            System.out.println(json);

        }
    }

    @Test
    public void test_6() {
        System.out.println("-----------");
        System.out.println("disableInnerClassSerialization");
        System.out.println("-----------");
        for (Object data : list) {
            Gson gson = new GsonBuilder().disableInnerClassSerialization().create();
            String json = gson.toJson(data);
            System.out.println(json);

        }
    }

}
