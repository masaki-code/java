package net.masaki_blog.gson.base;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DisableInnerClassSerialization {

    public static class Sample {

        InnerStaticClass a = new InnerStaticClass();

        InnerNonStaticClass b = new InnerNonStaticClass();

        static class InnerStaticClass {

            String c = "hoge";

        }

        class InnerNonStaticClass {

            String d = "hoge";

        }

    }

    @Test
    public void test_1() {
        Gson gson = new Gson();
        Object data = new Sample();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_2() {
        Gson gson = new GsonBuilder().disableInnerClassSerialization().create();
        Object data = new Sample();
        String json = gson.toJson(data);
        System.out.println(json);
    }

}
