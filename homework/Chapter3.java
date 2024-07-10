package homework;

public class Chapter3 {
    /*Long class Light */

    public static void main(String[] args) {
        int lihtspeed;
        long days;
        long seconds;
        long distance;
        lihtspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lihtspeed * seconds;
        System.out.println("in " + days);
        System.out.println("days the light will pass about ");
        System.out.println(distance + "mile.");

        System.out.println("---------------");

        double pi, r, a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println(" area of a circle equal " + a);

        System.out.println("----------------");

        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.println(" ch1  ch2: ");
        System.out.println(ch1 + "  " + ch2);

        System.out.println("-------------------");

        char ch3;
        ch3 = 'X';
        System.out.println(" ch3  " + ch3);
        ch3++;
        System.out.println(" ch3  " + ch3);

        System.out.println("-------------------");

        boolean b;
        b = false;
        System.out.println(" b  " + b);
        b = true;
        System.out.println(" b  " + b);
        if (b) System.out.println("  ");
        b = false;
        if (b) System.out.println("    ");
        System.out.println(" 10 > 9  " + (10 > 9));

        System.out.println("--------------------");

        double m = 3.0, n = 4.0;
        double c = Math.sqrt(m * m + n * n);
        System.out.println("Hypotenuse equal" + c);

        System.out.println("--------------------");

        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y equal: " + y);
            y = 100;
            System.out.println("y now equal " + y);

            System.out.println("-----------------");

            byte j;
            int i = 257;
            double d = 323.142;
            System.out.println("type conversion int in type");
            j = (byte) i;
            System.out.println(" i and e " + i + " " + j);
            System.out.println("type conversion double in type int ");
            i = (int) d;
            System.out.println(" d and i  " + d + " " + i);
            System.out.println("type conversion double in type byte.");
            j = (byte) d;
            System.out.println("d and j" + d + " " + j);

            System.out.println("---------------------");

            byte b1 = 42;
            char c1 = 'a';
            short s = 1024;
            int i1 = 50000;
            float f = 5.67f;
            double d1 = .1234;
            double result = (f * b1) + (i1 / c1) - (d1 * s);
            System.out.println((f * b1) + " + " + (i1 / c1) + " - " + (d1 * s));
            System.out.println("results = " + result);
        }
    }
}


