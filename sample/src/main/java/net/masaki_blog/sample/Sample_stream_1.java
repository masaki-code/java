package net.masaki_blog.sample;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample_stream_1 {

    private static final Collector<String, ?, List<String>> TO_LIST = Collectors.toList();

    public List<String> sample(List<String> list) {
        return list.stream().map(this.convert()).collect(TO_LIST);
    }

    private Function<String, String> convert() {
        return new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + ":test";
            }
        };
    }

}
