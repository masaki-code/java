package net.masaki_blog.atcoder.abs.abc085_c;

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

    int n, y;

    Main(BufferedReader br) throws Exception {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        y = Integer.parseInt(s[1]);
    }

    String execute() {
        int bill_10 = -1;
        int bill_05 = -1;
        int bill_01 = -1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int k = n - i - j;

                if (i * 10_000 + j * 5_000 + k * 1_000 == y) {
                    bill_10 = i;
                    bill_05 = j;
                    bill_01 = k;
                    break;
                }
            }
        }

        return bill_10 + " " + bill_05 + " " + bill_01;

    }

}
