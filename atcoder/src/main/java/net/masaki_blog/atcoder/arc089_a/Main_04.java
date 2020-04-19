package net.masaki_blog.atcoder.arc089_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 読み込みループしながらが悪い？
 *
 */
public class Main_04 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_04(br).execute());
        pw.flush();

    }

    int n;
    String[] p;

    Main_04(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[] p = new String[n];
        for (int i = 0; i < n; i++) {
            p[i] = br.readLine();
        }

        this.n = n;
        this.p = p;

    }

    String execute() {
        // before
        int b_t = 0;
        int b_x = 0;
        int b_y = 0;

        boolean able = true;
        for (int i = 0; i < n; i++) {
            String[] txy = p[i].split(" ");

            // next
            int n_t = Integer.parseInt(txy[0]);
            int n_x = Integer.parseInt(txy[1]);
            int n_y = Integer.parseInt(txy[2]);

            if (!isAbleWorkTo(b_t, b_x, b_y, n_t, n_x, n_y)) {
                able = false;
                break;
            }

            b_t = n_t;
            b_x = n_x;
            b_y = n_y;
        }

        return able ? "Yes" : "No";
    }

    private static boolean isAbleWorkTo(int b_t, int b_x, int b_y, int n_t, int n_x, int n_y) {
        int planeDistance = abs(n_x - b_x) + abs(n_y - b_y);
        int timeDistance = n_t - b_t;

        if (planeDistance > timeDistance) {
            return false;
        }

        return (timeDistance - planeDistance) % 2 == 0;

    }

    private static int abs(int a) {
        return (a < 0) ? -a : a;
    }

}
