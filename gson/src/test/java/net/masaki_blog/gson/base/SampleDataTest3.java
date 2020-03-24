package net.masaki_blog.gson.base;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;

public class SampleDataTest3 {

    private List<?> list = Arrays.asList(

            map()

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

}
