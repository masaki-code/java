package net.masaki_blog.atcoder.abc083_b;

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
    void test(String input, String outputExample) throws Exception {
        in.inputLine(input);
        Main.main("");
        assertThat(out.readLine(), is(outputExample));
    }

    static List<Arguments> dataProvider() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments("20 2 5", "84"));
        pattern.add(arguments("10 1 2", "13"));
        pattern.add(arguments("100 4 16", "4554"));
        return pattern;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/abc083_b/sample.txt")
    void testTxt(String input, String expected) throws Exception {
        in.inputLine(input);
        Main.main("");
        assertThat(out.readLine(), is(expected));
    }

}
