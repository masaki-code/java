package net.masaki_blog.atcoder.abc083_b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main(br).execute());
        pw.flush();

    }

    private final int n, a, b;

    Main(BufferedReader br) throws Exception {
        String[] s = br.readLine().split(" ");
        this.n = Integer.parseInt(s[0]);
        this.a = Integer.parseInt(s[1]);
        this.b = Integer.parseInt(s[2]);
    }

    int execute() {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += checkRange(i, a, b);
        }
        return result;
    }

    private static int checkRange(int n, int a, int b) {

        String n5 = String.valueOf(100000 + n); // 1 padding

        int n4 = n5.charAt(1) - 48; // n0000
        int n3 = n5.charAt(2) - 48; // n000
        int n2 = n5.charAt(3) - 48; // n00
        int n1 = n5.charAt(4) - 48; // n0
        int n0 = n5.charAt(5) - 48; // n

        int sum = n4 + n3 + n2 + n1 + n0;

        return (a <= sum && sum <= b) ? n : 0;

    }

}
