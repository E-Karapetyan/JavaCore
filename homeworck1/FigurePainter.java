package homeworck1;

public class FigurePainter {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        int n = 5;
        for (int l = 1; l <= n; l++) {
            for (int j = l; j <= n; j++) {
                System.out.print("* ");

                System.out.println(" ");
            }
            for (int a = 5; a > 0; a--) {
                for (int j = 0; j < a - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= (5 - a); j++) {
                    System.out.print("* ");

                }
                System.out.println(" ");


                for (int b = 0; b < 5; b++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 5; j > b; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();


                }
            }
        }
    }
    }



        


