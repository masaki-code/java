package net.masaki_blog.atcoder.abc087_b;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        int x, a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt(); // 500 * a
            b = sc.nextInt(); // 100 * b
            c = sc.nextInt(); // 50 * c
            x = sc.nextInt(); // = x
        }

        System.out.println(execute(x / 50, a, b, c));

    }

    private static int execute(int x, int a_max, int b_max, int c_max) {
        int limit = Math.min(x / 10, a_max);

        int count = 0;

        for (int a = 0; a <= limit; a++) {
            count += count(x - a * 10, b_max, c_max);
        }

        return count;

    }

    private static int count(int x, int b_max, int c_max) {
        return (Math.min(x, 2 * b_max) - Math.max(x - c_max, 0) + 2) / 2;
    }

}
