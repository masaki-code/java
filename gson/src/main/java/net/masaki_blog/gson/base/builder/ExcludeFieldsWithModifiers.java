package net.masaki_blog.gson.base.builder;

import java.lang.reflect.Modifier;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SuppressWarnings("unused")
public class ExcludeFieldsWithModifiers {

    public static class Sample {

        String a = "hoge";

        private String b = "fuga";

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
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PRIVATE).create();
        Object data = new Sample();
        String json = gson.toJson(data);
        System.out.println(json);
    }

}
