package net.masaki_blog.atcoder.abc081_a;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        try (Scanner input = new Scanner(System.in)) {
            String s = input.next();
            int s1 = s.charAt(0) == '1' ? 1 : 0;
            int s2 = s.charAt(1) == '1' ? 1 : 0;
            int s3 = s.charAt(2) == '1' ? 1 : 0;
            System.out.println(s1 + s2 + s3);
        }

    }

}
