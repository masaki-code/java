package net.masaki_blog.sample;

import java.util.List;
import java.util.stream.Collectors;

public class Sample_java8 {

    public List<String> sample(List<String> list) {
        return list.stream().map(s -> s + ":test").collect(Collectors.toList());
    }

}
