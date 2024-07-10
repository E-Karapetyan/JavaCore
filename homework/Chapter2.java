package homework;

public class Chapter2 {
    public static void main(String[] args) {
        int number;
        number = 100;
        System.out.println("The number equals " + number);
        number = number * 2;
        System.out.println("Number * 2 equals " + number);

        System.out.println("-------------------");


        int x, y;
        x = 10;
        y = 20;
        if (x < y)
            System.out.println("x < y");
        x = x * 2;
        if (x == y)
            System.out.println("x == y");
        x = x * 2;
        if (x > y)
            System.out.println("x > y");
        if (x == y)
            System.out.println();

        System.out.println("------------------");

        int i;
        for (i = 0; i < 10; i = i + 1)
            System.out.println("i: " + i);
        int a, b;
        b = 20;
        for (a = 0; a < 10; a++) {
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            b = b - 2;
        }
    }
}