package net.masaki_blog.atcoder.abs.abc087_b;

public class DataMakerBase {

    int count(int A, int B, int C, int x) {
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

    private int combinationNum(int x, int n1, int n2) {

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
