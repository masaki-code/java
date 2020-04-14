package net.masaki_blog.atcoder.abc087_b;

import java.util.Scanner;

/**
 * 単純にreturn
 */
public class Main09 {

    public static void main(String... args) {
        int x, a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt(); // 500 * a
            b = sc.nextInt(); // 100 * b
            c = sc.nextInt(); // 50 * c
            x = sc.nextInt(); // = x
        }

        System.out.println(new Main09().count(x / 50, a, b, c));

    }

    int count(int x, int A, int B, int C) {
        int limit = Math.min(x / 10, A);

        int count = 0;
        for (int a = 0; a <= limit; a++) {
            count += count50(x, a, B, C);
        }

        return count;

    }

    int count50(int x, int a, int B, int C) {

        if (x % 2 == 0) {
            return evenCount(x, a, B, C);
        } else {
            return oddCount(x, a, B, C);
        }

    }

    int evenCount(int x, int a, int B, int C) {
        int _x = (x / 2) - (5 * a);
        int b_max = B;
        int c_max = C / 2;
        return combinationNum(_x, b_max, c_max);
    }

    int oddCount(int x, int a, int B, int C) {

        if (C == 0) { // C-1 < 0
            return 0;
        }

        int _x = ((x - 1) / 2) - (5 * a);
        int b_max = B;
        int c_max = (C - 1) / 2;

        return combinationNum(_x, b_max, c_max);
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
