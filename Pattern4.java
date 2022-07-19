import java.util.Scanner;

public class Pattern4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scn.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=n;i>=1;i--){
            singleLine(i);
            System.out.println();
        }
    }
    public static void singleLine(int n){
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
    }
}
