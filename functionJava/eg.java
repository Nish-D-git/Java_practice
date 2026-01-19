
import java.util.Scanner;

public class eg {
  public static int sumNumber(int a, int b) {
    int sum = a + b;
    return sum;
    
  }     
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("First no: ");
      int a = sc.nextInt();
      System.out.print("Second no: ");
      int b = sc.nextInt();
      
      
      int sum = sumNumber(a, b);
      System.out.println("sum of two no: " +sum);      

  }
    
}