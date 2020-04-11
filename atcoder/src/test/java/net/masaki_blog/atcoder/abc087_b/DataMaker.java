package net.masaki_blog.atcoder.abc087_b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DataMaker {

    private static final String DIR = "src/test/resources/abc087_b";

    private static final String FILE_NAME = "sample.txt";

    private static final Path PATH = Paths.get(DIR, FILE_NAME);

    @BeforeAll
    static void clear() throws IOException {
        Files.deleteIfExists(PATH);
    }

    @Test
    void test() throws IOException {

        Iterable<String> as = rangeClosed(0, 50);
        Iterable<String> bs = rangeClosed(0, 50);
        Iterable<String> cs = rangeClosed(0, 50);

        for (String x : rangeOfX(0, 100)) {
            loop(x, as, bs, cs);
        }

    }

    private void loop(String x, Iterable<String> as, Iterable<String> bs, Iterable<String> cs) throws IOException {

        String[] params = new String[5];
        params[3] = x;

        int intX = Integer.parseInt(x);
        for (String a : as) {
            int intA = Integer.parseInt(a);
            for (String b : bs) {
                int intB = Integer.parseInt(b);

                for (String c : cs) {
                    int intC = Integer.parseInt(c);
                    int intR = new Main().count(intX, intA, intB, intC);

                    params[0] = a;
                    params[1] = b;
                    params[2] = c;
                    params[4] = String.valueOf(intR);

                    Files.write(PATH, Arrays
                            .asList(String.join(",", params)), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

                }
            }
        }

    }

    private Iterable<String> rangeOfX(int s, int e) {
        return IntStream.rangeClosed(s, e).map(i -> i * 50).boxed().map(Objects::toString).collect(Collectors.toList());
    }

    private Iterable<String> rangeClosed(int s, int e) {
        return IntStream.rangeClosed(s, e).boxed().map(Objects::toString).collect(Collectors.toList());
    }

}
