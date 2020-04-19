package net.masaki_blog.atcoder.arc065_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * メモリでNGになった。
 */
public class Main_00 {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(new Main_00(br).execute());
        pw.flush();

    }

    String S;

    Main_00(BufferedReader br) throws Exception {
        this.S = br.readLine();
    }

    String execute() {
        boolean result = false;

        String before = S;
        String after = S;
        while (true) {
            after = replace(before);

            if ("".equals(after)) {
                result = true;
                break;
            }

            if (before == after) {
                break;
            } else {
                before = after;
            }
        }

        return result ? "YES" : "NO";
    }

    String replace(String before) {

        String target = before;
        target = checkAndDelete(target, "dream");
        target = checkAndDelete(target, "dreamer");
        target = checkAndDelete(target, "erase");
        target = checkAndDelete(target, "eraser");
        return target;

    }

    String checkAndDelete(String target, String param) {
        if (target.endsWith(param)) {
            return target.substring(0, target.length() - param.length());
        } else {
            return target;
        }
    }

}
