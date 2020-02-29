package net.masaki_blog.sample;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

//    public List<String> sample(List<String> list) {
//        return list.stream().map(s -> s + ":test").collect(Collectors.toList());
//    }

//    public List<String> sample(List<String> list) {
//
//        List<String> ret = new ArrayList<>();
//        for (String s : list) {
//            ret.add(s + ":test");
//        }
//        return ret;
//    }

    public List<String> sample(List<String> list) {

        Stream<String> originStream = list.stream();
        Function<String, String> mapper = new Function<String, String>() {

            @Override
            public String apply(String t) {
                return t + ":test";
            }
        };

        Stream<String> mapedStream = originStream.map(mapper);
        Collector<String, ?, List<String>> c = Collectors.toList();
        return mapedStream.collect(c);
    }

}
