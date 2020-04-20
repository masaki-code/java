package net.masaki_blog.atcoder.abs.arc065_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * パスしたバージョン
 */
public class Main_01 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_01(br).execute());
        pw.flush();

    }

    private final char[] s;

    Main_01(BufferedReader br) throws Exception {
        this.s = br.readLine().toCharArray();
    }

    String execute() {
        boolean result = false;

        int beforeSize = s.length;
        int afterSize = beforeSize;

        while (true) {
            afterSize = next(beforeSize);

            if (afterSize == 0) {
                result = true;
                break;
            }

            if (beforeSize == afterSize) {
                break;
            } else {
                beforeSize = afterSize;
            }
        }

        return result ? "YES" : "NO";
    }

    private int next(int size) {
        size = deleteEndsWith(size, "dream".toCharArray());
        size = deleteEndsWith(size, "dreamer".toCharArray());
        size = deleteEndsWith(size, "erase".toCharArray());
        size = deleteEndsWith(size, "eraser".toCharArray());
        return size;
    }

    private int deleteEndsWith(int currentSize, char... checkStr) {

        if (endsWith(currentSize, checkStr)) {
            return currentSize - checkStr.length;

        } else {
            return currentSize;

        }

    }

    private boolean endsWith(int currentSize, char... checkStr) {
        int checkSize = checkStr.length;
        int nextSize = currentSize - checkSize;

        if (currentSize < checkSize) {
            return false;

        }

        for (int j = 0; j < checkSize; j++) {
            if (s[nextSize + j] != checkStr[j]) {
                return false;
            }
        }

        return true;

    }

}
