package net.masaki_blog.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample_java7 {

    public List<String> sample(List<String> list) {

        List<String> ret = new ArrayList<>();
        for (String s : list) {
            ret.add(s + ":test");
        }
        return ret;

    }

}
