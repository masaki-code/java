package net.masaki_blog.atcoder.abs.abc087_b;

import java.util.Scanner;

/**
 * 最初の作成物
 */
public class Main02 {

    public static void main(String... args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(new Main02().execute(input));
        }

    }

    private Object execute(Scanner sc) {
        int a = sc.nextInt(); // 500 * a
        int b = sc.nextInt(); // 100 * b
        int c = sc.nextInt(); // 50 * c
        int x = sc.nextInt(); // = x

        return count(x / 50, a, b, c);
    }

    private int count(int x, int a_max, int b_max, int c_max) {
        // x = 10a + 2b + c
        // x' = 2b + c
        // => x = 10a + x'

        int count = 0;
        for (int a = 0; a <= a_max; a++) {
            int _x = x - a * 10;

            if (_x < 0) {
                break;
            }

            count += count(_x, b_max, c_max);

        }

        return count;

    }

    private int count(int _x, int b_max, int c_max) {

        // x' = 2b +c
        int count = 0;
        for (int b = 0; b <= b_max; b++) {
            int c = _x - 2 * b;
            if (c < 0) {
                break;
            }

            if (c <= c_max) {
                count++;
            }
        }

        return count;
    }

}
