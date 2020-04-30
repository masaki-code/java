package net.masaki_blog.atcoder.abs.abc087_b;

import java.util.Scanner;

/**
 * 変数やら何やら削ってみた
 */
public class Main12 {

    public static void main(String... args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    static int count(int A, int B, int C, int x) {
        x = x / 50;
        int limit = Math.min(x / 10, A);

        if (x % 2 == 0) {
            x = x / 2;
            C = C / 2;

        } else {

            if (C == 0)
                return 0;

            x = (x - 1) / 2;
            C = (C - 1) / 2;
        }

        int count = 0;

        for (int a = 0; a <= limit; a++) {
            count += combinationNum(x - (5 * a), B, C);
        }
        return count;

    }

    static private int combinationNum(int x, int n1, int n2) {

        if (n1 < n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        if (n1 + n2 < x)
            return 0;

        if (n1 <= x)
            return n1 + n2 - x + 1;

        if (n2 <= x)
            return n2 + 1;

        return x + 1;

    }

}
