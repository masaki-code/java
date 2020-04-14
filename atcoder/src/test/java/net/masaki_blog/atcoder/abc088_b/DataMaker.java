package net.masaki_blog.atcoder.abc088_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.masaki_blog.test.DataMakerBase;
import net.masaki_blog.test.StandardInputStream;

public class DataMaker extends DataMakerBase {

    private static final String DIR = "src/test/resources/abc088_b";

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

            int[] ai = new int[n];

            for (int i = 0; i < n; i++) {
                ai[i] = random(1, 100, 1);
            }

            String a = join(ai, " ");

            StandardInputStream in = StandardInputStream.get();
            in.inputLine(n);
            in.inputLine(a);

            System.setIn(in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ret = new Main(br).execute();

            params[0] = n;
            params[1] = a;
            params[2] = ret;

            set.add(join(params, ","));

            if (set.size() == num) {
                break;
            }
        }

        Files.write(PATH, set, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

}
