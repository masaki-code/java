package net.masaki_blog.gson.base;

import org.junit.Test;

import com.google.gson.Gson;

import net.masaki_blog.gson.base.SampleData1;
import net.masaki_blog.gson.base.SampleData2;
import net.masaki_blog.gson.base.SampleData3;
import net.masaki_blog.gson.base.SampleData4;

public class SampleDataTest1 {

    @Test
    public void test_1() {
        Gson gson = new Gson();
        Object data = new SampleData1();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_2() {
        Gson gson = new Gson();
        Object data = new SampleData2();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_3() {
        Gson gson = new Gson();
        Object data = new SampleData3();
        String json = gson.toJson(data);
        System.out.println(json);
    }

    @Test
    public void test_4() {
        Gson gson = new Gson();
        Object data = new SampleData4();
        String json = gson.toJson(data);
        System.out.println(json);
    }

}
