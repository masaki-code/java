package net.masaki_blog.atcoder.abs.abc083_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * サブメソッドを外すと性能上がる？ => 下がった。
 */
public class Main_2 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_2(br).execute());
        pw.flush();

    }

    private final int n, a, b;

    Main_2(BufferedReader br) throws Exception {
        String[] s = br.readLine().split(" ");
        this.n = Integer.parseInt(s[0]);
        this.a = Integer.parseInt(s[1]);
        this.b = Integer.parseInt(s[2]);
    }

    int execute() {
        int result = 0;
        for (int i = 1; i <= n; i++) {

            String n5 = String.valueOf(100000 + i); // 1 padding

            int n4 = n5.charAt(1) - 48; // n0000
            int n3 = n5.charAt(2) - 48; // n000
            int n2 = n5.charAt(3) - 48; // n00
            int n1 = n5.charAt(4) - 48; // n0
            int n0 = n5.charAt(5) - 48; // n

            int sum = n4 + n3 + n2 + n1 + n0;

            result += (a <= sum && sum <= b) ? i : 0;
        }
        return result;
    }

}
