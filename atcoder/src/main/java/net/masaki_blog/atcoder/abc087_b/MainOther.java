package net.masaki_blog.atcoder.abc087_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainOther {

    public static void main(String... args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());

        pw.println(count(a, b, c, x));
        pw.flush();
    }

    static int count(int A, int B, int C, int x) {

        int count = 0;

        return count;

    }

    private static int gamma(int x) {
        return x / 10;
    }

    private static int beta(int x) {
        return x / 2;
    }

}
