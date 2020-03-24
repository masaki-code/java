package net.masaki_blog.gson.ex;

import com.google.gson.annotations.SerializedName;

public class SampleData_SerializedName1 {

    String key = "test key";

    @SerializedName(value = "v")
    String val = "test val";

}
