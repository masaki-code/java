package net.masaki_blog.atcoder.abs.abc087_b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DataMaker {

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

        int zeroNum = 30;
        int nonZeroNum = 70;

        Set<String> zeroSet = new HashSet<>();
        Set<String> nonZeroSet = new HashSet<>();

        int[] params = new int[5];

        while (true) {
            int a = random(0, 100, 1);
            int b = random(0, 100, 1);
            int c = random(0, 100, 1);
            int x = random(0, 100, 50);

            int count = new DataMakerBase().count(a, b, c, x);

            params[0] = a;
            params[1] = b;
            params[2] = c;
            params[3] = x;
            params[4] = count;

            String line = IntStream.of(params).boxed().map(String::valueOf).collect(Collectors.joining(","));

            if (count == 0) {
                if (zeroSet.size() < zeroNum) {
                    zeroSet.add(line);
                }
            } else {
                if (nonZeroSet.size() < nonZeroNum) {
                    nonZeroSet.add(line);
                }
            }

            if (zeroSet.size() == zeroNum && nonZeroSet.size() == nonZeroNum) {
                break;
            }

        }

        Files.write(PATH, zeroSet, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        Files.write(PATH, nonZeroSet, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

    private int random(int min, int max, int multiple) {
        return (R.nextInt(max - min) + min) * multiple;
    }

}
