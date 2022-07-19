import java.util.Scanner;

public class Pattern3 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scn.nextInt();
      pattern(n);
      
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            singleLine(i);
            System.out.println();
        }
    }

    public static void singleLine(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
    }
}
