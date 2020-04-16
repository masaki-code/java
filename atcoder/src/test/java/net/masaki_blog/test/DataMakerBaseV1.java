package net.masaki_blog.test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DataMakerBaseV1 {

    private static final InputStream SYSTEM_IN = System.in;
    private static final PrintStream SYSTEM_OUT = System.out;

    protected StandardPrintStream out = StandardPrintStream.has(SYSTEM_OUT);
    protected StandardInputStream in = StandardInputStream.get();

    private static final Random R = new Random();

    @BeforeEach
    public void before() {
        System.setIn(in);
        System.setOut(out);
    }

    @AfterEach
    public void after() {
        System.setIn(SYSTEM_IN);
        System.setOut(SYSTEM_OUT);
    }

    protected String join(int[] params, CharSequence delimiter) {
        return IntStream.of(params).boxed().map(String::valueOf).collect(Collectors.joining(delimiter));
    }

    protected <T> String join(T[] params, CharSequence delimiter) {
        return Stream.of(params).map(Objects::toString).collect(Collectors.joining(delimiter));
    }

    protected int random(int min, int max, int multiple) {
        return (R.nextInt(max - min) + min) * multiple;
    }

}
