package net.masaki_blog.gson.ex;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SampleDataTest {

    private List<?> list = Arrays.asList(

            new SampleData_SerializedName1(), //
            new SampleData_SerializedName2(), //
            new SampleData_SerializedName3(), //

            new SampleData_Expose1(), //

            "-----"

    );

    @Test
    public void test_1() {
        for (Object data : list) {
            Gson gson = new Gson();
            String json = gson.toJson(data);

            System.out.println(json);

        }
    }

    @Test
    public void test_2() {
        for (Object data : list) {
            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
            String json = gson.toJson(data);

            System.out.println(json);

        }
    }

    @Test
    public void test_3() {
        for (Object data : list) {
            Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
            String json = gson.toJson(data);

            System.out.println(json);

        }
    }

}
