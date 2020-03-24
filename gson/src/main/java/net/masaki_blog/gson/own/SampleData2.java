package net.masaki_blog.gson.own;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SampleData2 {

    @SerializedName("k")
    @Expose
    String key = "key";

    @SerializedName("m")
    @Expose
    Map<String, Inner> map = new LinkedHashMap<>();
    {
        map.put("k1", new Inner());
        map.put("k2", new Inner());
        map.put("k3", new Inner());

    }

    static class Inner {

        String key = "key";

        @SerializedName("v")
        @Expose(serialize = true)
        String val = "val";

        String option = "option";

    }

}
