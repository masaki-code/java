package net.masaki_blog.atcoder.abc088_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * 最初の作成分
 */
public class Main_01 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_01(br).execute());
        pw.flush();

    }

    int n;
    int[] ai;

    Main_01(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] ai = new int[n];

        int i = 0;
        for (String a : br.readLine().split(" ")) {
            ai[i] = Integer.parseInt(a);
            i++;
        }

        Arrays.parallelSort(ai);

        this.n = n;
        this.ai = ai;
    }

    int execute() {
        int result = 0;

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
