package net.masaki_blog.gson.own;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SampleDataTest {

    private List<?> list = Arrays.asList(

            new SampleData1(), //
            new SampleData2(), //
            new SampleData3(), //

            ""

    );

    @Test
    public void test() {
        System.out.println("-----------");
        System.out.println("excludeFieldsWithoutExposeAnnotation");
        System.out.println("-----------");

        for (Object data : list) {
            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
            String json = gson.toJson(data);

            System.out.println(json);

        }
    }

    @Test
    public void test_2() {
        System.out.println("-----------");
        System.out.println("registerTypeAdapter");
        System.out.println("-----------");

        SampleData3 data = new SampleData3();

        Gson gson = new GsonBuilder().registerTypeAdapter(SampleData3.Inner.class, SampleData3.InnerTypeAdapter)
                .create();
        String json = gson.toJson(data);

        System.out.println(json);

    }

    @Test
    public void test_3() {
        System.out.println("-----------");
        System.out.println("registerTypeAdapter");
        System.out.println("-----------");

        SampleData3 data = new SampleData3();

        Gson gson = new GsonBuilder().registerTypeAdapter(SampleData3.Inner.class, SampleData3.InnerJsonSerializer)
                .create();
        String json = gson.toJson(data);

        System.out.println(json);

    }

}
