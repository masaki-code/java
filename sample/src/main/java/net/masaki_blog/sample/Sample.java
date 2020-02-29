package net.masaki_blog.sample;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample {

// 本当はこれで良い。
//    public List<String> sample(List<String> list) {
//        return list.stream().map(s -> s + ":test").collect(Collectors.toList());
//    }

    /**
     * java8のメソッド（stream api）は使えるが、java8の構文（ラムダ式など）は使えない状態でのメソッド
     */
    public List<String> sample(List<String> list) {
        Collector<String, ?, List<String>> toList = Collectors.toList();

        return list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + ":test";
            }
        }).collect(toList);
    }

}
