package net.masaki_blog.atcoder.abs.arc089_a;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * サブクラスに戻してみた
 */
public class Main_07 {

    public static void main(String... args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        InnerReader ir = new InnerReader(System.in);
        pw.println(new Main_07().execute(ir));
        pw.flush();

    }

    String execute(InnerReader reader) throws Exception {
        Point before = new Point();
        Point next = new Point();

        int n = reader.readInt();
        boolean able = true;
        for (int i = 0; i < n; i++) {
            next.load(reader);
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

        void load(InnerReader reader) throws Exception {
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

        private final InputStream in;

        private static final byte CHAR_0 = 48;
        private static final byte CHAR_9 = 48 + 9;
        private static final char CHAR_SPACE = ' ';

        private static final byte END = -1;

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
