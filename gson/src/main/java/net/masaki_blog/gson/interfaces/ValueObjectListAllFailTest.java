package net.masaki_blog.gson.interfaces;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ValueObjectListAllFailTest {

    @Test
    public void typeMatchTest() {

        List<IValueObject> list = Arrays.asList(

                new ValueObjectA("vo1"), new ValueObjectA("vo2"), new ValueObjectA("vo3")

        );

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(IValueObject.class, IValueObject.JSON_SERIALIZER)
                .create();

        String json = gson.toJson(list);
        System.out.println(json);
    }

    @Test
    public void typeUnmatchTest() {

        List<ValueObjectA> list = Arrays.asList(

                new ValueObjectA("vo1"), new ValueObjectA("vo2"), new ValueObjectA("vo3")

        );

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(IValueObject.class, IValueObject.JSON_SERIALIZER)
                .create();

        String json = gson.toJson(list);
        System.out.println(json);
    }

    @Test
    public void multiTypeTest() {

        List<IValueObject> list = Arrays.asList(

                new ValueObjectA("vo1"), new ValueObjectB("vo2"), new ValueObjectA("vo3")

        );

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(IValueObject.class, IValueObject.JSON_SERIALIZER)
                .create();

        String json = gson.toJson(list);
        System.out.println(json);
    }

}
