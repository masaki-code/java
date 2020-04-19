package net.masaki_blog.atcoder.arc089_a;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

import net.masaki_blog.test.DataMakerBaseV2;

public class DataMaker extends DataMakerBaseV2 {

    static final String CLASS_PATH = "/arc089_a/sample.txt";

    private static int SAMPLE_NUM = 10;

    private static final String PATH_STRING = DIR + CLASS_PATH;

    @Override
    protected Path path() {
        return Paths.get(PATH_STRING);
    }

    private String[] params() {
        List<String> input = new ArrayList<>();

        int n = random(1, 100, 1);
        input.add(String.valueOf(n));

        Point point = new Point();
        for (int i = 0; i < n; i++) {

            int distance = random(0, 100, 1);

            for (int j = 0; j < distance; j++) {
                point.walk();
            }

            input.add(point.toString());

        }

        return new String[] { String.join("CR", input), "Yes" };
    }

    private static class Point {

        private static final Random R = new Random();

        int t = 0;
        int x = 0;
        int y = 0;

        Point walk() {
            t++;
            if (R.nextBoolean()) {
                workX();
            } else {
                workY();
            }

            return this;

        }

        private void workX() {
            if (x == 0 || R.nextBoolean()) {
                x++;
            } else {
                x--;
            }
        }

        private void workY() {
            if (y == 0 || R.nextBoolean()) {
                y++;
            } else {
                y--;
            }

        }

        @Override
        public String toString() {
            return t + " " + x + " " + y;
        }
    }

    @Test
    void test() throws Exception {

        Set<String> set = new HashSet<>();

        while (true) {
            set.add(join(params(), ","));

            if (set.size() == SAMPLE_NUM) {
                break;
            }
        }

        Files.write(path(), set, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

}
