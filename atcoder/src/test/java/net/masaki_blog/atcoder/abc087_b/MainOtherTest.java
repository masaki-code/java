package net.masaki_blog.atcoder.abc087_b;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.params.provider.Arguments.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import net.masaki_blog.test.MainTestBase;

class MainOtherTest extends MainTestBase {

    private MainOther target = new MainOther();

    @ParameterizedTest
    @CsvFileSource(resources = "/abc087_b/sampleInfinity.txt")
    void test(String a, String b, String c, String x, String expected) throws Exception {

        in.inputLine(a);
        in.inputLine(b);
        in.inputLine(c);
        in.inputLine(x);

        MainOther.main("");

        assertThat(out.readLine(), is(expected));
    }

    @ParameterizedTest
    @MethodSource(value = "testData")
    void test(int x, int expected) {
        assertThat(target.f(x), is(expected));
    }

    @ParameterizedTest
    @MethodSource(value = "testData")
    void test_f2(int x, int expected) {
        assertThat(target.f_2(x), is(expected));
    }

    @ParameterizedTest
    @MethodSource(value = "testData")
    void test_f3(int x, int expected) {
        assertThat(target.f_3(x), is(expected));
    }

    static List<Arguments> testData() {
        List<Arguments> p = new ArrayList<>();

//        p.add(arguments(0, 0));

        p.add(arguments(1, 1));
        p.add(arguments(2, 2));
        p.add(arguments(3, 2));
        p.add(arguments(4, 3));
        p.add(arguments(5, 3));
        p.add(arguments(6, 4));
        p.add(arguments(7, 4));
        p.add(arguments(8, 5));
        p.add(arguments(9, 5));

        p.add(arguments(10, 7));
        p.add(arguments(11, 7));
        p.add(arguments(12, 9));
        p.add(arguments(13, 9));
        p.add(arguments(14, 11));
        p.add(arguments(15, 11));

        p.add(arguments(20, 18));
        p.add(arguments(21, 18));
        p.add(arguments(22, 21));
        p.add(arguments(23, 21));

        p.add(arguments(30, 34));
        p.add(arguments(31, 34));
        p.add(arguments(32, 38));

        p.add(arguments(40, 55));

        return p;
    }

}
