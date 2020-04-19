package net.masaki_blog.atcoder.arc089_a;

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
    void test(List<String> input, String expected) throws Exception {
        executeTest(input, expected);
    }

    static List<Arguments> dataProvider() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments(input("2", "3 1 2", "6 1 1"), output("Yes")));
        pattern.add(arguments(input("1", "2 100 100"), output("No")));
        pattern.add(arguments(input("2", "5 1 1", "100 1 1"), output("No")));

        return pattern;
    }

    @ParameterizedTest
    @MethodSource("dataProviderEx")
    void testEx(List<String> input, String expected) throws Exception {
        executeTest(input, expected);
    }

    static List<Arguments> dataProviderEx() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments(input("1", "5 5 0"), output("Yes")));
        pattern.add(arguments(input("1", "5 0 5"), output("Yes")));
        pattern.add(arguments(input("1", "5 2 3"), output("Yes")));

        pattern.add(arguments(input("2", "5 5 0", "10 5 5"), output("Yes")));
        pattern.add(arguments(input("2", "5 0 5", "10 5 5"), output("Yes")));
        pattern.add(arguments(input("2", "5 2 3", "10 5 5"), output("Yes")));

        pattern.add(arguments(input("1", "5 5 1"), output("No")));
        pattern.add(arguments(input("1", "5 1 5"), output("No")));
        pattern.add(arguments(input("1", "5 3 3"), output("No")));

        pattern.add(arguments(input("2", "5 5 0", "10 6 5"), output("No")));
        pattern.add(arguments(input("2", "5 0 5", "10 5 6"), output("No")));
        pattern.add(arguments(input("2", "5 2 3", "10 6 5"), output("No")));

        pattern.add(arguments(input("1", "5 4 0"), output("No")));
        pattern.add(arguments(input("1", "5 0 4"), output("No")));
        pattern.add(arguments(input("1", "5 2 2"), output("No")));

        return pattern;
    }

    @ParameterizedTest
    @CsvFileSource(resources = DataMaker.CLASS_PATH)
    void testTxt(String input, String expected) throws Exception {
        executeTest(Arrays.asList(input.split("CR")), expected);
    }

    private void executeTest(List<String> input, String expected) throws Exception {
        in.inputLines(input);
        Main.main("");
        assertThat(out.readLine(), is(expected));

    }
}
