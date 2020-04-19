package net.masaki_blog.atcoder.arc065_a;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.params.provider.Arguments.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
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
        pattern.add(arguments(input("erasedream"), output("YES")));
        pattern.add(arguments(input("dreameraser"), output("YES")));
        pattern.add(arguments(input("dreamerer"), output("NO")));
        return pattern;
    }

    @ParameterizedTest
    @MethodSource("dataProviderEx")
    void testEx(List<String> input, String expected) throws Exception {
        executeTest(input, expected);
    }

    static List<Arguments> dataProviderEx() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments(input(""), output("YES")));

        // YES combination
        {
            List<String> list = Arrays.asList("dream", "dreamer", "erase", "eraser");

            for (String f : list) {
                for (String s : list) {
                    pattern.add(arguments(input(f + s), output("YES")));
                }
            }

            for (int i = 0; i < 10; i++) {
                String s_1 = list.get(new Random().nextInt(3));
                String s_2 = list.get(new Random().nextInt(3));
                String s_3 = list.get(new Random().nextInt(3));
                String s_4 = list.get(new Random().nextInt(3));

                pattern.add(arguments(input(s_1 + s_2 + s_3 + s_4), output("YES")));

            }
        }
        // big size
        {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 50; i++) {
                sb.append("dream");
            }

            sb.append("dreamer");

            for (int i = 0; i < 50; i++) {
                sb.append("erase");
            }

            sb.append("dream");

            pattern.add(arguments(input(sb.toString()), output("YES")));
        }

        return pattern;
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = DataMaker.PATH_STRING)
    void testTxt(String csv_p1, String csv_p2) throws Exception {
        List<String> input = Arrays.asList(csv_p1);
        String expected = csv_p2;
        executeTest(input, expected);
    }

    private void executeTest(List<String> input, String expected) throws Exception {
        in.inputLines(input);
        Main.main("");
        assertThat(out.readLine(), is(expected));

    }
}
