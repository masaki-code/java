package net.masaki_blog.atcoder.abs.abc083_b;

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

    private static int checkRange(int i, int a, int b) {

        int sum = 0;

        int n = i;
        while (true) {
            sum += n % 10;
            if ((n = n / 10) == 0) {
                break;
            }
        }

        return (a <= sum && sum <= b) ? i : 0;

    }

}
