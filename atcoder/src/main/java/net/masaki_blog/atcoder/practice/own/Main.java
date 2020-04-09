package net.masaki_blog.atcoder.practice.own;

public class Main {

    int a, b, c;
    String s;

    public static void main(String... strings) {
        new Main(strings[0]).execute();
    }

    private void execute() {
        System.out.println((this.a + this.b + this.c) + " " + this.s);
    }

    private Main(String str) {
        String[] lSplit = str.split(System.lineSeparator());
        a = Integer.parseInt(lSplit[0]);
        String[] cSplit = lSplit[1].split(" ");
        b = Integer.parseInt(cSplit[0]);
        c = Integer.parseInt(cSplit[1]);
        s = lSplit[2];
    }

}
