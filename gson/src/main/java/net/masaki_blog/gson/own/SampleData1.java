package net.masaki_blog.gson.own;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SampleData1 {

    @SerializedName("k")
    @Expose
    String key = "key";

    @SerializedName("l")
    @Expose
    List<Inner> list = new ArrayList<Inner>();
    {
        list.add(new Inner());
        list.add(new Inner());
        list.add(new Inner());
    }

    static class Inner {

        String key = "key";

        @SerializedName("v")
        @Expose(serialize = true)
        String val = "val";

        String option = "option";

    }

}
