import java.util.Scanner;
public class ReversePattern {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfLine=scn.nextInt();
        number(numberOfLine);
        reversePattern(numberOfLine);

    }
    public static void reversePattern(int numberOfLine){
        for(int i=numberOfLine;i>=1;i--){
            printStar(i);
            System.out.println();
        }
    }
    public static void printStar(int  numberOfStar){
        for(int i=1;i<=numberOfStar;i++){
            System.out.print("*");
        }
    }
    public static void number(int numberOfLine) {
        for (int i = 1; i <= numberOfLine; i++) {
            printStar(i);
            System.out.println();
        }
    }
}
