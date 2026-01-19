import java.util.Scanner;

public class example {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("N no: ");
        int n = sc.nextInt();
        System.out.print("J no: ");
        int j = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int m = 0; m < j; m++) {

                System.out.print("#");
            }
            System.out.println("");
        }
        

    }
}