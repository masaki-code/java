package net.masaki_blog.atcoder.abs.abc085_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * 初期作成
 */
public class Main_01 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_01(br).execute());
        pw.flush();

    }

    int n;
    int[] d;

    Main_01(BufferedReader br) throws Exception {
        n = Integer.parseInt(br.readLine());
        d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(br.readLine());
        }

    }

    int execute() {
        Arrays.parallelSort(d);

        int r = 0;
        int b = 0;

        for (int di : d) {
            if (di != b) {
                r++;
                b = di;
            }

        }

        return r;

    }

}
