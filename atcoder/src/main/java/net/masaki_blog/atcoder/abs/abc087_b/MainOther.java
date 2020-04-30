package net.masaki_blog.atcoder.abs.abc087_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainOther {

    public static void main(String... args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new MainOther().count(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer
                .parseInt(br.readLine()), Integer.parseInt(br.readLine())));
        pw.flush();
    }

    int count(int A, int B, int C, int x) {
        return f_3(x / 50);
    }

    public int f_3(int x) {

        int r = x / 10;
        int b = x / 2;

        return (b + 1) * (r + 1) + (-5 * (r) * (r + 1) / 2);

    }

    public int f_2(int x) {

        int ret = 0;
        int r = x / 10;

        for (int i = 0; i <= r; i++) {
            ret += (x - 10 * i) / 2 + 1;
        }

        return ret;

    }

    public int f(int x) {

        int y1 = x / 2 + 1;

        if (0 <= x && x < 10) {
            return y1;
        }

        int y2 = (x - 10) / 2 + 1;

        if (10 <= x && x < 20) {
            return y1 + y2;
        }

        int y3 = (x - 20) / 2 + 1;

        if (20 <= x && x < 30) {
            return y1 + y2 + y3;
        }

        int y4 = (x - 30) / 2 + 1;

        if (30 <= x && x < 40) {
            return y1 + y2 + y3 + y4;
        }

        int y5 = (x - 40) / 2 + 1;

        return y1 + y2 + y3 + y4 + y5;

    }

}
