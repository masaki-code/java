package net.masaki_blog.atcoder.abc085_b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.masaki_blog.test.DataMakerBase;

public class DataMaker extends DataMakerBase {

    private static final String DIR = "src/test/resources/abc085_b";

    private static final String FILE_NAME = "sample.txt";

    private static final Path PATH = Paths.get(DIR, FILE_NAME);

    @BeforeAll
    static void clear() throws IOException {
        Files.deleteIfExists(PATH);
    }

    @Test
    void test() throws Exception {

        int num = 20;

        Set<String> set = new HashSet<>();

        Object[] params = new Object[3];

        while (true) {
            int n = random(1, 100, 1);

            int[] di = new int[n];

            for (int i = 0; i < n; i++) {
                di[i] = random(1, 100, 1);
            }

            in.inputLine(n);
            in.inputLines(di);

            Main.main("");

            int ret = Integer.parseInt(out.readLine());

            params[0] = n;
            params[1] = join(di, "CR");
            params[2] = ret;

            set.add(join(params, ","));

            if (set.size() == num) {
                break;
            }
        }

        Files.write(PATH, set, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

}
