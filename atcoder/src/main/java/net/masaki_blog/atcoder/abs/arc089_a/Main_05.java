package net.masaki_blog.atcoder.abs.arc089_a;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * 独自リーダクラス
 */
public class Main_05 {

    public static void main(String... args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        try (InnerReader ir = new InnerReader(System.in)) {
            pw.println(new Main_05().execute(ir));
            pw.flush();
        }

    }

    String execute(InnerReader reader) throws Exception {

        int n = reader.readInt();

        // before
        int b_t = 0;
        int b_x = 0;
        int b_y = 0;

        boolean able = true;
        for (int i = 0; i < n; i++) {

            // next
            int n_t = reader.readInt();
            int n_x = reader.readInt();
            int n_y = reader.readInt();

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

    private static class InnerReader implements AutoCloseable {

        private final InputStream in;

        private static final byte CHAR_0 = 48;
        private static final byte CHAR_9 = 48 + 9;
        private static final char CHAR_SPACE = ' ';

        private static final byte END = -1;

        InnerReader(InputStream in) {
            this.in = in;
        }

        private int readInt() throws Exception {
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

        @Override
        public void close() throws IOException {
            this.in.close();
        }
    }

}
