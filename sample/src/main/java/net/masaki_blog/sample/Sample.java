package net.masaki_blog.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {

// 本当はこれで良い。
//    public List<String> sample(List<String> list) {
//        return list.stream().map(s -> s + ":test").collect(Collectors.toList());
//    }

//    /**
//     * java8のメソッド（stream api）は使えるが、java8の構文（ラムダ式など）は使えない状態でのメソッド
//     */
//    public List<String> sample(List<String> list) {
//        return list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s + ":test";
//            }
//        }).collect(TO_LIST);
//    }

//    public List<String> sample(List<String> list) {
//        return list.stream().map(this.convert()).collect(Collectors.toList());
//    }

//    private static final Collector<String, ?, List<String>> TO_LIST = Collectors.toList();
//
//    public List<String> sample(List<String> list) {
//        return list.stream().map(this.convert()).collect(TO_LIST);
//    }
//
//    private Function<String, String> convert() {
//        return new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s + ":test";
//            }
//        };
//    }

//    public List<String> sample(List<String> list) {
//        Collector<String, ?, List<String>> toList = Collectors.toList();
//
//        return list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s + ":test";
//            }
//        }).collect(toList);
//    }
    public List<String> sample(List<String> list) {

        List<String> ret = new ArrayList<>();
        for (String s : list) {
            ret.add(s + ":test");
        }
        return ret;

    }

}
