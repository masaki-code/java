package net.masaki_blog.gson.base;

import java.util.LinkedHashMap;
import java.util.Map;

public class SampleData4 {

    String key = "test key";

    Map<String, String> valMap = new LinkedHashMap<>();

    {
        valMap.put("key 1", "val 1");
        valMap.put("key 2", "val 2");
    }

}
