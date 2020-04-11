package net.masaki_blog.atcoder.abc087_b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DataMakerCheap2 {

    private static final String DIR = "src/test/resources/abc087_b";

    private static final String FILE_NAME = "sample.txt";

    private static final Path PATH = Paths.get(DIR, FILE_NAME);

    private static final Random R = new Random();

    @BeforeAll
    static void clear() throws IOException {
        Files.deleteIfExists(PATH);
    }

    @Test
    void test() throws IOException {

        List<Integer> as = range(0, 50, 1, 10);
        List<Integer> bs = range(0, 50, 1, 10);
        List<Integer> cs = range(0, 50, 1, 10);
        List<Integer> xs = range(0, 100, 50, 20);

        String[] params = new String[5];

        for (Integer a : as) {
            params[0] = a.toString();

            for (Integer b : bs) {
                params[1] = b.toString();

                for (Integer c : cs) {
                    params[2] = c.toString();

                    for (Integer x : xs) {
                        params[3] = x.toString();

                        {
                            params[4] = String.valueOf(new Main().count(x, a, b, c));
                            List<String> line = Arrays.asList(String.join(",", params));
                            Files.write(PATH, line, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                        }
                    }
                }
            }

        }

    }

    private List<Integer> range(int min, int max, int multiple, int count) {
        List<Integer> list = new ArrayList<>();

        while (true) {
            Integer i = (R.nextInt(max - min) + min) * multiple;

            if (!list.contains(i)) {
                list.add(i);
                if (list.size() == count) {
                    return list;
                }
            }
        }
    }
}
