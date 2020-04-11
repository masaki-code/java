package net.masaki_blog.atcoder.abc087_b;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import net.masaki_blog.test.MainTestBase;

class MainTest extends MainTestBase {

    private static List<String> inputExample_1 = Arrays.asList("2", "2", "2", "100");
    private static List<String> inputExample_2 = Arrays.asList("5", "1", "0", "150");
    private static List<String> inputExample_3 = Arrays.asList("30", "40", "50", "6000");

    private static String outputExample_1 = "2";
    private static String outputExample_2 = "0";
    private static String outputExample_3 = "213";

    @Test
    void test_1() {
        in.inputLines(inputExample_1);
        Main.main("");
        assertThat(out.readLine(), is(outputExample_1));
    }

    @Test
    void test_2() {
        in.inputLines(inputExample_2);
        Main.main("");
        assertThat(out.readLine(), is(outputExample_2));
    }

    @Test
    void test_3() {
        in.inputLines(inputExample_3);
        Main.main("");
        assertThat(out.readLine(), is(outputExample_3));
    }
}
