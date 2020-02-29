package net.masaki_blog.sample;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void test() {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> actual = new Sample().sample(list);
        List<String> expected = Arrays.asList("a:test", "b:test", "c:test");
        assertThat(actual, is(expected));
    }

}
