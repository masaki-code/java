package net.masaki_blog.atcoder.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import net.masaki_blog.test.DataMakerBaseV2;

public class DataMaker extends DataMakerBaseV2 {

    private static final String DIR = "src/test/resources/xxxxx/";

    private static final String FILE_NAME = "sample.txt";

    private static int SAMPLE_NUM = 50;

    static final String PATH_STRING = DIR + FILE_NAME;

    @Override
    protected Path path() {
        return Paths.get(PATH_STRING);
    }

    private Input input;

    private static class Input {
        String n;
    }

    private int execute() throws Exception {
        int n = random(0, 10000, 1);

        input = new Input();
        input.n = String.valueOf(n);
        in.inputLine(input.n);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return new Main(br).execute();
    }

    private String[] params(int result) {
        String[] params = new String[2];
        params[0] = input.n;
        params[1] = String.valueOf(result);
        return params;
    }

    @Test
    void test() throws Exception {

        Set<String> set = new HashSet<>();

        while (true) {
            set.add(join(params(execute()), ","));

            if (set.size() == SAMPLE_NUM) {
                break;
            }
        }

        Files.write(path(), set, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

}
