
import java.util.Scanner;

public class avg {
    public static void printAvg(float  a, float b, float  c) {
        System.out.println("average of 3 no: " + (a+b+c)/3);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("print no: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAvg(a,b,c);


    }    
}
