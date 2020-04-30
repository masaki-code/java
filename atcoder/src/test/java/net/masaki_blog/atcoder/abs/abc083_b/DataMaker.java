package net.masaki_blog.atcoder.abs.abc083_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.masaki_blog.test.MainTestBase;
import net.masaki_blog.test.StandardInputStream;

public class DataMaker extends MainTestBase {

    private static final String DIR = "src/test/resources/abc083_b";

    private static final String FILE_NAME = "sample.txt";

    private static final Path PATH = Paths.get(DIR, FILE_NAME);

    private static final Random R = new Random();

    @BeforeAll
    static void clear() throws IOException {
        Files.deleteIfExists(PATH);
    }

    @Test
    void test() throws Exception {

        int num = 50;

        Set<String> set = new HashSet<>();

        String[] params = new String[2];

        while (true) {
            int n = random(0, 10000, 1);
            int a = random(0, 36, 1);
            int b = random(0, 36, 1);

            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            String input = n + " " + a + " " + b;

            StandardInputStream in = StandardInputStream.get();

            in.inputLine(input);

            System.setIn(in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int ret = new Main_1(br).execute();

            params[0] = input;
            params[1] = String.valueOf(ret);

            String line = line(params);

            set.add(line);

            if (set.size() == num) {
                break;
            }

        }

        Files.write(PATH, set, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

    private String line(String[] params) {
        return Stream.of(params).collect(Collectors.joining(","));
    }

    private int random(int min, int max, int multiple) {
        return (R.nextInt(max - min) + min) * multiple;
    }

}
