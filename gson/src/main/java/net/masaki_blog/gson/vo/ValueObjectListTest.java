package net.masaki_blog.gson.vo;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ValueObjectListTest {

    @Test
    public void toJsonTest() {

        List<ValueObject> list = Arrays.asList(

                new ValueObject("vo1"), new ValueObject("vo2"), new ValueObject("vo3")

        );

        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }

    @Test
    public void toJsonFromJsonSerializerTest() {

        List<ValueObject> list = Arrays.asList(

                new ValueObject("vo1"), new ValueObject("vo2"), new ValueObject("vo3")

        );

        Gson gson = new GsonBuilder().registerTypeAdapter(

                ValueObject.class, ValueObject.JSON_SERIALIZER).create();

        String json = gson.toJson(list);
        System.out.println(json);
    }

}
