package net.masaki_blog.atcoder.abs.abc085_c;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.params.provider.Arguments.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import net.masaki_blog.test.MainTestBase;

class MainTest extends MainTestBase {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void test(String input, String expected) throws Exception {
        in.inputLine(input);
        Main.main("");
        String result = out.readLine();
        assertThat(total(result), is(total(expected)));
    }

    private int total(String str) {
        String[] tmp = str.split(" ");
        int y10 = Integer.parseInt(tmp[0]);
        int y05 = Integer.parseInt(tmp[1]);
        int y01 = Integer.parseInt(tmp[2]);
        return y10 * 10000 + y05 * 5000 + y01 * 1000;
    }

    static List<Arguments> dataProvider() {
        List<Arguments> pattern = new ArrayList<>();
        pattern.add(arguments("9 45000", "4 0 5"));// 0 9 0 も正
        pattern.add(arguments("20 196000", "-1 -1 -1"));
        pattern.add(arguments("1000 1234000", "14 27 959"));// この他にも多くの候補
        pattern.add(arguments("2000 20000000", "2000 0 0"));

        return pattern;
    }
}
