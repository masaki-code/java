package net.masaki_blog.atcoder.abc088_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * splitをメソッドに
 */
public class Main_04 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_04(br).execute());
        pw.flush();

    }

    int n;
    String a;

    Main_04(BufferedReader br) throws Exception {
        this.n = Integer.parseInt(br.readLine());
        this.a = br.readLine();
    }

    int execute() {
        int r = 0;
        int[] a = split();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                r += a[n - i - 1];
            } else {
                r -= a[n - i - 1];
            }
        }

        return r;

    }

    private int[] split() {
        int[] r = new int[n];
        String[] s = a.split(" ");

        for (int i = 0; i < n; i++) {
            r[i] = Integer.parseInt(s[i]);
        }

        Arrays.parallelSort(r);
        return r;

    }

}
