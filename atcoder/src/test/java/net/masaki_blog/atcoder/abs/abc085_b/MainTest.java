package net.masaki_blog.atcoder.abs.abc085_b;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.params.provider.Arguments.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import net.masaki_blog.test.MainTestBase;

class MainTest extends MainTestBase {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void test(List<String> input, String outputExample) throws Exception {
        in.inputLines(input);
        Main.main("");
        assertThat(out.readLine(), is(outputExample));
    }

    static List<Arguments> dataProvider() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments(Arrays.asList("4", "10", "8", "8", "6"), "3"));
        pattern.add(arguments(Arrays.asList("3", "15", "15", "15"), "1"));
        pattern.add(arguments(Arrays.asList("7", "50", "30", "50", "100", "50", "80", "30"), "4"));
        return pattern;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/abc085_b/sample.txt")
    void testTxt(String n, String d, String expected) throws Exception {
        in.inputLine(n);
        in.inputLines(d.split("CR"));
        Main.main("");
        assertThat(out.readLine(), is(expected));
    }
}
