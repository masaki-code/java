package net.masaki_blog.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {

//    public List<String> sample(List<String> list) {
//        return list.stream().map(s -> s + ":test").collect(Collectors.toList());
//    }

    public List<String> sample(List<String> list) {

        List<String> ret = new ArrayList<>();
        for (String s : list) {
            ret.add(s + ":test");
        }
        return ret;
    }
}
