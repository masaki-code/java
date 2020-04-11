package net.masaki_blog.atcoder.abc087_b;

import java.util.Scanner;

/**
 * 全体的に整備
 */
public class Main10 {

    public static void main(String... args) {
        int x, A, B, C;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt(); // 500 * a
            B = sc.nextInt(); // 100 * b
            C = sc.nextInt(); // 50 * c
            x = sc.nextInt(); // = x
        }

        System.out.println(new Main10().count(x / 50, A, B, C));

    }

    int count(int x, int A, int B, int C) {
        int limit = Math.min(x / 10, A);

        int x_base, b_max, c_max;
        if (x % 2 == 0) {
            x_base = x / 2;
            b_max = B;
            c_max = C / 2;

        } else {

            if (C == 0) {
                return 0;
            }

            x_base = (x - 1) / 2;
            b_max = B;
            c_max = (C - 1) / 2;
        }

        int count = 0;
        for (int a = 0; a <= limit; a++) {
            count += combinationNum(x_base - (5 * a), b_max, c_max);
        }
        return count;

    }

    private int combinationNum(int x, int _n1, int _n2) {

        // n1 >= n2
        int n1 = Math.max(_n1, _n2);
        int n2 = Math.min(_n1, _n2);

        if (n1 + n2 < x) {
            return 0;
        }

        if (n1 <= x) {
            return n1 + n2 - x + 1;
        }

        if (n2 <= x) {
            return n2 + 1;
        }

        return x + 1;

    }

}
