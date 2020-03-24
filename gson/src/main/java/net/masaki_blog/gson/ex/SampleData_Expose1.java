package net.masaki_blog.gson.ex;

import com.google.gson.annotations.Expose;

public class SampleData_Expose1 {

    String key = "test key";

    String val_1 = "val";

    @Expose
    String val_2 = "val";

    @Expose(serialize = false)
    String val_3 = "val";

    @Expose(serialize = true)
    String val_4 = "val";

    @Expose(deserialize = false)
    String val_5 = "val";

    @Expose(deserialize = true)
    String val_6 = "val";

}
