package net.masaki_blog.gson.ex;

import java.util.Arrays;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SampleData_SerializedName3 {

    String key = "test key";

    @SerializedName(value = "")
    List<String> valList = Arrays.asList("val1", "val2");

}
