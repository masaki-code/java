package net.masaki_blog.atcoder.abc085_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main(br).execute());
        pw.flush();

    }

    int n;
    int[] d;

    Main(BufferedReader br) throws Exception {
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
