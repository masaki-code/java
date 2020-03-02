package net.masaki_blog.sample;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample_stream_2 {

    public List<String> sample(List<String> list) {
        return list.stream().map(this.convert()).collect(Collectors.<String>toList());
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
