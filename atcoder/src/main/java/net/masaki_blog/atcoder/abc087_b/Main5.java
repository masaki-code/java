package net.masaki_blog.atcoder.abc087_b;

import java.util.Scanner;

/**
 * breakでループ抜けるんじゃなく、ループ変数で制御（その２）
 *
 */
public class Main5 {

    public static void main(String... args) {
        int x, a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt(); // 500 * a
            b = sc.nextInt(); // 100 * b
            c = sc.nextInt(); // 50 * c
            x = sc.nextInt(); // = x
        }

        System.out.println(new Main5().count(x / 50, a, b, c));

    }

    private int count(int x, int a_max, int b_max, int c_max) {
        // x = 10a + 2b + c
        // x' = 2b + c
        // => x = 10a + x'
        int limit = Math.min(x / 10, a_max);
        int count = 0;
        for (int a = 0; a <= limit; a++) {
            count += count(x - a * 10, b_max, c_max);
        }
        return count;
    }

    private int count(int x, int b_max, int c_max) {
        // x' = 2b +c
        int limit = Math.min(x / 2, b_max);
        int count = 0;
        for (int b = 0; b <= limit; b++) {
            if (x - 2 * b <= c_max) {
                count++;
            }
        }
        return count;
    }
}