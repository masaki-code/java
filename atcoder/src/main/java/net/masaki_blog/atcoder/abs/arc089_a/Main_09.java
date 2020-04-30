package net.masaki_blog.atcoder.abs.arc089_a;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * コード量減らしてみた。
 */
public class Main_09 {

    public static void main(String... args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        InnerReader ir = new InnerReader(System.in);
        pw.println(new Main_09().execute(ir));
        pw.flush();
    }

    String execute(InnerReader reader) throws Exception {
        boolean able = true;
        int b_t = 0;
        int b_x = 0;
        int b_y = 0;
        int n = reader.readInt();
        for (int i = 0; i < n; i++) {
            int n_t = reader.readInt();
            int n_x = reader.readInt();
            int n_y = reader.readInt();
            int p = (n_t - b_t) - (diff(n_x, b_x) + diff(n_y, b_y));
            if ((0 > p) || p % 2 != 0) {
                able = false;
                break;
            }
            b_t = n_t;
            b_x = n_x;
            b_y = n_y;
        }
        return able ? "Yes" : "No";
    }

    private static int diff(int a, int b) {
        if (a < b) {
            return b - a;
        } else {
            return a - b;
        }
    }

    private static class InnerReader {

        private final InputStream in;

        InnerReader(InputStream in) {
            this.in = in;
        }

        private int readInt() throws Exception {
            int i = 0;
            int j;
            while (true) {
                j = in.read();
                if (j < '0' || '9' < j) {
                    break;
                }
                i = i * 10 + (j - '0');
            }
            return i;
        }
    }
}
