package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print("  ");
        }
        System.out.println("  ");

        System.out.print("First element " + numbers[0]);

        System.out.println("  ");

        System.out.println("Last element " + numbers[numbers.length - 1]);


        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is  :" + smallest);

        System.out.println("Odd numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.println();
        System.out.println("Even numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ",");
            }
        }

        System.out.println();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Summa " + sum);

        double summa = sum;
        double average = summa / numbers.length;
        System.out.println("Average " + average);


    }


}
