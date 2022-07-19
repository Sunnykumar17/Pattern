import java.util.Scanner;

public class PatternPractice {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLine = scn.nextInt();

        // number(numberOfLine);
       number(numberOfLine);

    }

    public static void number(int numberOfLine) {
        for (int i = 1; i <= numberOfLine; i++) {
            stars(i);
            System.out.println();
        }
    }


    public static void stars(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
    }

}
