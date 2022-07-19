import java.util.Scanner;

public class Pattern1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
       pattern();
       System.out.println("kamal");
       pattern();
       System.out.println("aggarwal");
    }
    public static void pattern(){
        for(int i=1;i<=5;i++){
            singleLine();
            System.out.println();
        }
    }

    public static void singleLine() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("* ");
        }
    }
}
