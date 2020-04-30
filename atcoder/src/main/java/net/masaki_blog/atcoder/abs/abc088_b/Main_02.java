package net.masaki_blog.atcoder.abs.abc088_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * streamにしてみる。
 */
public class Main_02 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_02(br).execute());
        pw.flush();

    }

    int n;
    String an;

    Main_02(BufferedReader br) throws Exception {
        this.n = Integer.parseInt(br.readLine());
        this.an = br.readLine();
    }

    int execute() {
        int result = 0;

        int[] a = Stream.of(an.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.parallelSort(a);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += a[n - i - 1];
            } else {
                result -= a[n - i - 1];
            }
        }

        return result;

    }

}
