package net.masaki_blog.atcoder.practice.own;

import org.junit.jupiter.api.Test;

import net.masaki_blog.atcoder.practice.own.Main;

class MainTest {

    @Test
    void test_1() {
        String input = "1\n" + "2 3\n" + "test";
        Main.main(input);
    }

    @Test
    void test_2() {
        String input = "72\n" + "128 256\n" + "myonmyon";
        Main.main(input);
    }

}
