package net.masaki_blog.atcoder.abc087_b;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import net.masaki_blog.test.MainTestBase;

class MainTestEx extends MainTestBase {

    @ParameterizedTest
    @CsvFileSource(resources = "/abc087_b/sample.txt")
    void test(String a, String b, String c, String x, String expected) throws Exception {

        in.inputLine(a);
        in.inputLine(b);
        in.inputLine(c);
        in.inputLine(x);

        Main.main("");

        assertThat(out.readLine(), is(expected));
    }

}
