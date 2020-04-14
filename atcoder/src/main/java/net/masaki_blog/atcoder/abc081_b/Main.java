package net.masaki_blog.atcoder.abc081_b;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(new Main().execute(input));
        }

    }

    private Object execute(Scanner sc) {
        int[] read = readInput(sc);

        int min = Integer.MAX_VALUE;
        for (int i : read) {
            min = Math.min(min, opc(i));
        }
        return min;

    }

    private int opc(int i) {
        int opc = 0;

        int n = i;

        while (true) {
            if (n % 2 == 0) {
                n = n / 2;
                opc++;
            } else {
                return opc;
            }

        }

    }

    private int[] readInput(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

}
