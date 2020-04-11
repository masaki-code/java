package net.masaki_blog.test;

import java.io.IOException;
import java.io.InputStream;

/**
 * テスト用の標準入力クラス
 */
public class StandardInputStream extends InputStream {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private StringBuilder stream = new StringBuilder();

    public static StandardInputStream get() {
        return new StandardInputStream();
    }

    private StandardInputStream() {

    };

    public void inputLine(String line) {
        stream.append(line).append(LINE_SEPARATOR);
    }

    public void inputLines(Iterable<String> lines) {
        for (String line : lines) {
            this.inputLine(line);
        }
    }

    @Override
    public int read() throws IOException {
        if (stream.length() == 0) {
            return -1;
        }
        int result = stream.charAt(0);
        stream.deleteCharAt(0);
        return result;
    }

}
