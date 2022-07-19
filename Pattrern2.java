import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
public class Pattrern2 {
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            singleLine();
            System.out.println(); 
        }
    }
    public static void singleLine(){
        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
    }
}
