package net.masaki_blog.sample;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

//    public List<String> sample(List<String> list) {
//
//        Collector<String, ?, List<String>> c = Collectors.toList();
//
//        return list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String t) {
//                return t + ":test";
//            }
//        }).collect(c);
//
//    }

    public List<String> sample(List<String> list) {
        return list.stream().map(this.convert()).collect(this.toList());
    }

    private Function<String, String> convert() {
        return new Function<String, String>() {
            @Override
            public String apply(String t) {
                return t + ":test";
            }
        };
    }

    private Collector<String, ?, List<String>> toList() {
        return Collectors.toList();
    }

}
