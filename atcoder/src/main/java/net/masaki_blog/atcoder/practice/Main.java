package net.masaki_blog.atcoder.practice;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            String s = input.next();
            System.out.println((a + b + c) + " " + s);
        }

    }

}
