package net.masaki_blog.sample;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample_stream_3 {

    public List<String> sample(List<String> list) {
        return list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + ":test";
            }
        }).collect(Collectors.<String>toList());
    }
}
