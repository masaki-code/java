package net.masaki_blog.atcoder.abc088_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * 入出力と変換を分離
 */
public class Main_03 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_03(br).execute());
        pw.flush();

    }

    int n;
    String an;

    Main_03(BufferedReader br) throws Exception {
        this.n = Integer.parseInt(br.readLine());
        this.an = br.readLine();
    }

    int execute() {
        int result = 0;

        int[] ai = new int[n];
        {
            int i = 0;
            for (String a : an.split(" ")) {
                ai[i] = Integer.parseInt(a);
                i++;
            }

            Arrays.parallelSort(ai);

        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += ai[n - i - 1];
            } else {
                result -= ai[n - i - 1];
            }
        }

        return result;

    }

}
