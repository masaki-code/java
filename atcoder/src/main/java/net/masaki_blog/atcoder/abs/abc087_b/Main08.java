package net.masaki_blog.atcoder.abs.abc087_b;

import java.util.Scanner;

/**
 * 単純にreturnできないか検討中（途中）
 */
public class Main08 {

    public static void main(String... args) {
        int x, a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt(); // 500 * a
            b = sc.nextInt(); // 100 * b
            c = sc.nextInt(); // 50 * c
            x = sc.nextInt(); // = x
        }

        System.out.println(new Main08().count(x / 50, a, b, c));
    }

    private int count(int x, int a_max, int b_max, int c_max) {
        int limit = Math.min(x / 10, a_max);
        int count = 0;
        for (int a = 0; a <= limit; a++) {
            count += count(x - a * 10, b_max, c_max);
        }
        return count;
    }

    private int count(int x, int b_max, int c_max) {
        int limit = Math.min(x / 2, b_max);
        if (x - c_max <= 0) {
            return limit + 1;

        }
        if (x - c_max == 2 * limit) {
            return 1;
        }
        if (x - c_max > 2 * limit) {
            return 0;
        }
        // 0 < x - c_max < 2 * limit
        if ((x - c_max) % 2 == 0) {
            return limit - ((x - c_max) / 2) + 1;
        }
        int count = 0;
        for (int b = 0; b <= limit; b++) {
            if (x - c_max <= 2 * b) {
                count++;
            }
        }
        return count;
    }
}
