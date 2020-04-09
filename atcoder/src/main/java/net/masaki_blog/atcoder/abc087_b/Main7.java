package net.masaki_blog.atcoder.abc087_b;

import java.util.Scanner;

public class Main7 {

    public static void main(String... args) {
        int x, a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt(); // 500 * a
            b = sc.nextInt(); // 100 * b
            c = sc.nextInt(); // 50 * c
            x = sc.nextInt(); // = x
        }

        System.out.println(new Main7().count(x / 50, a, b, c));

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

        if (0 < x - c_max && x - c_max < 2 * limit) {
            int count = 0;

            for (int b = 0; b <= limit; b++) {

                if (x - c_max <= 2 * b) {
                    count++;
                }

            }

            return count;

        }

        if (x - c_max == 2 * limit) {
            return 1;
        }

        // x - c_max > 2 * limit
        return 0;

    }

}
