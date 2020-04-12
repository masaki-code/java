package net.masaki_blog.atcoder.abc087_b;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.params.provider.Arguments.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import net.masaki_blog.test.MainTestBase;

class MainTest extends MainTestBase {

    private static List<String> inputExample_1 = Arrays.asList("2", "2", "2", "100");
    private static List<String> inputExample_2 = Arrays.asList("5", "1", "0", "150");
    private static List<String> inputExample_3 = Arrays.asList("30", "40", "50", "6000");

    private static String outputExample_1 = "2";
    private static String outputExample_2 = "0";
    private static String outputExample_3 = "213";

    @ParameterizedTest
    @MethodSource("dataProvider")
    void test(List<String> inputExample, String outputExample) throws Exception {
        in.inputLines(inputExample);
        Main.main("");
        assertThat(out.readLine(), is(outputExample));
    }

    static List<Arguments> dataProvider() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments(inputExample_1, outputExample_1));
        pattern.add(arguments(inputExample_2, outputExample_2));
        pattern.add(arguments(inputExample_3, outputExample_3));
        return pattern;
    }

}
