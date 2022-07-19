import java.util.Scanner;

public class Pattern6 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLine = scn.nextInt();
        alphabetPrint(numberOfLine);
    }

    public static void alphabetPrint(int numberOfLine) {
        for (int i = 1; i <= numberOfLine; i++) {
            printAlphabet();
            System.out.println();
        }
    }

    public static void printAlphabet() {
        for (int i = 0; i <= 4; i++) {
            System.out.print((char) ('a' + i));
        }
    }
}
