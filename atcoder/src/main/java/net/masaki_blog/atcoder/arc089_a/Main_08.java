package net.masaki_blog.atcoder.arc089_a;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * 最初のバージョンに合わせた =>インスタンス都度生成=>こっちの方が早かった
 */
public class Main_08 {

    public static void main(String... args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        InnerReader ir = new InnerReader(System.in);
        pw.println(new Main_08().execute(ir));
        pw.flush();
    }

    String execute(InnerReader reader) throws Exception {
        Point before = new Point(0, 0, 0);
        boolean able = true;
        int n = reader.readInt();
        for (int i = 0; i < n; i++) {
            Point next = new Point(reader);
            if (before.isAbleWorkTo(next)) {
                before = next;
            } else {
                able = false;
                break;
            }
        }
        return able ? "Yes" : "No";
    }

    private static class Point {
        int t, x, y;

        Point(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }

        Point(InnerReader reader) throws Exception {
            this.t = reader.readInt();
            this.x = reader.readInt();
            this.y = reader.readInt();
        }

        boolean isAbleWorkTo(Point other) {
            int planeDistance = abs(other.x - x) + abs(other.y - y);
            int timeDistance = other.t - t;
            if (planeDistance > timeDistance) {
                return false;
            }
            return (timeDistance - planeDistance) % 2 == 0;
        }

        private static int abs(int a) {
            return (a < 0) ? -a : a;
        }

    }

    private static class InnerReader {

        private static final byte CHAR_0 = 48;
        private static final byte CHAR_9 = 48 + 9;
        private static final char CHAR_SPACE = ' ';

        private static final byte END = -1;

        private final InputStream in;

        InnerReader(InputStream in) {
            this.in = in;
        }

        int readInt() throws Exception {
            int i = 0;
            int j;
            while (true) {
                j = in.read();
                if (j == END || j == CHAR_SPACE) {
                    break;
                }
                if (CHAR_0 <= j && j <= CHAR_9) {
                    i = i * 10 + (j - CHAR_0);
                } else {
                    break;
                }
            }
            return i;
        }
    }
}
