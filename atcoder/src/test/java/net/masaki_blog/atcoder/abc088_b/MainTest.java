package net.masaki_blog.atcoder.abc088_b;

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

class MainTest extends MainTestBase {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void test(String n, String a, String expected) throws Exception {
        in.inputLine(n);
        in.inputLine(a);
        Main.main("");
        assertThat(out.readLine(), is(expected));
    }

    static List<Arguments> dataProvider() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments("2", "3 1", "2"));
        pattern.add(arguments("3", "2 7 4", "5"));
        pattern.add(arguments("4", "20 18 2 18", "18"));
        return pattern;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/abc088_b/sample.txt")
    void testTxt(String n, String a, String expected) throws Exception {
        in.inputLine(n);
        in.inputLine(a);
        Main.main("");
        assertThat(out.readLine(), is(expected));
    }

}
