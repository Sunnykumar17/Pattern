import java.util.Scanner;

public class Pattern7 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n =scn.nextInt();
        pattern(numberOfStar);
        reversePattern(numberOfLine);
    }

    public static void pattern(int numberOfStar) {
        for (int i = 1; i <= numberOfLine; i++) {
            singleLine(i);
            System.out.println();
        }
    }

    public static void reversePattern(int numberOfLine) {
        for (int i = numberOfLine; i >= 1; i--) {
            singleLine(i);
            System.out.println();
        }

    }

    public static void singleLine(int numberOfStar) {
        for (int i = 1; i <= numberOfStar; i++) {
            System.out.println("* ");
        }
    }
}
