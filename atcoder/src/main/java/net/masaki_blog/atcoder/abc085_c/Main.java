package net.masaki_blog.atcoder.abc085_c;

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

        // TODO

        return bill_10 + " " + bill_05 + " " + bill_01;

    }

}
