import java.util.Scanner;

public class PatternAscii {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        printAlphabet();
    }
    public static void printAlphabet(){
        for(int i=1;i<=5;i++){
            singleLine();
            System.out.println();
        }
    }

    public static void singleLine() {
        for (int i = 0; i <= 4; i++) {
            System.out.print((char)('a'+i));
        }
    }
}
