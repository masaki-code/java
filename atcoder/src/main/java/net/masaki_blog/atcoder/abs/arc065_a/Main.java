package net.masaki_blog.atcoder.abs.arc065_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    private static char[] DREAM = { 'd', 'r', 'e', 'a', 'm' };
    private static char[] DREAMER = { 'd', 'r', 'e', 'a', 'm', 'e', 'r' };
    private static char[] ERASE = { 'e', 'r', 'a', 's', 'e' };
    private static char[] ERASER = { 'e', 'r', 'a', 's', 'e', 'r' };

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_02(br).execute());
        pw.flush();

    }

    private final char[] s;

    Main(BufferedReader br) throws Exception {
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
        size = deleteEndsWith(size, DREAM);
        size = deleteEndsWith(size, DREAMER);
        size = deleteEndsWith(size, ERASE);
        size = deleteEndsWith(size, ERASER);
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
