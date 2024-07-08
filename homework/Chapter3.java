package homework;

public class Chapter3 {
    /*Long class Light */

    public static void main(String[] args) {

        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("  " + days);
        System.out.print("         ");
        System.out.println(distance + "  ");


        double pi, r, a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;
        System.out.print("  " + a);

        char ch1, ch2;
        ch1 = 89;
        ch2 = 'Y';
        System.out.print(" ch1  ch2: ");
        System.out.print(ch1 + "  " + ch2);
        /* class CharDemo2 */
        char ch3;
        ch3 = 'X';
        System.out.println(" ch3  " + ch3);
        ch3++;
        System.out.println(" ch3  " + ch3);
        /* class boolTest */
        boolean b;
        b = false;
        System.out.println(" b  " + b);
        b = true;
        System.out.println(" b  " + b);
        if (b) System.out.println("  ");
        b = false;
        if (b) System.out.println("    ");
        System.out.println(" 10 > 9  " + (10 > 9));
    }
}