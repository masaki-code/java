package net.masaki_blog.atcoder.abc087_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReaderに変更（すごく速くなった）
 */
public class Main13 {

    public static void main(String... args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(count(
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine())));
    }

    static int count(int A, int B, int C, int x) {
        x = x / 50;
        A = Math.min(x / 10, A);

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

        for (int a = 0; a <= A; a++) {
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
