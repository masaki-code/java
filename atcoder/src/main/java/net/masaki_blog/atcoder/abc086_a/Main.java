package net.masaki_blog.atcoder.abc086_a;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int p = a * b;
            System.out.println(p % 2 == 0 ? "Even" : "Odd");
        }

    }

}
