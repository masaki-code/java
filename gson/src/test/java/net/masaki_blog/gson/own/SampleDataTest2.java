package net.masaki_blog.gson.own;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SampleDataTest2 {

    @Test
    public void test_1() {
        System.out.println("-----------");
        System.out.println("registerTypeAdapter");
        System.out.println("-----------");

        SampleData4 data = new SampleData4();

        Gson gson = new GsonBuilder().registerTypeAdapter(SampleData4.Inner.class, SampleData4.InnerJsonSerializer)
                .create();
        String json = gson.toJson(data);

        System.out.println(json);

    }

    @Test
    public void test_2() {
        System.out.println("-----------");
        System.out.println("registerTypeAdapter");
        System.out.println("-----------");

        SampleData4 data = new SampleData4();

        Gson gson = new GsonBuilder()//
                .registerTypeAdapter(SampleData4.Inner.class, SampleData4.InnerJsonSerializer)//
                .registerTypeAdapter(SampleData4.InnerEx.class, SampleData4.InnerJsonSerializer)//
                .registerTypeAdapter(SampleData4.InnerEx2.class, SampleData4.InnerJsonSerializer)//
                .create();
        String json = gson.toJson(data);

        System.out.println(json);

    }

}
