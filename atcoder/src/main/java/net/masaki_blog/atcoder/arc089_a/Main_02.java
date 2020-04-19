package net.masaki_blog.atcoder.arc089_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 改良版<br>
 * サブクラスのインスタンスを作成しない様にした。
 */
public class Main_02 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(check(br));
        pw.flush();
    }

    static String check(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());

        Point before = new Point();
        Point next = new Point();

        boolean able = true;
        for (int i = 0; i < n; i++) {

            next.load(br.readLine());

            if (!before.isAbleWorkTo(next)) {
                able = false;
                break;
            }

            before.copy(next);

        }

        return able ? "Yes" : "No";

    }

    private static class Point {
        int t = 0;
        int x = 0;
        int y = 0;

        void copy(Point next) {
            this.t = next.t;
            this.x = next.x;
            this.y = next.y;
        }

        void load(String str) {
            String[] txy = str.split(" ");
            this.t = Integer.parseInt(txy[0]);
            this.x = Integer.parseInt(txy[1]);
            this.y = Integer.parseInt(txy[2]);
        }

        boolean isAbleWorkTo(Point other) {
            int planeDistance = abs(other.x - x) + abs(other.y - y);
            int timeDistance = other.t - t;

            if (planeDistance > timeDistance) {
                return false;
            }

            return (timeDistance - planeDistance) % 2 == 0;

        }
    }

    private static int abs(int a) {
        return (a < 0) ? -a : a;
    }

}
