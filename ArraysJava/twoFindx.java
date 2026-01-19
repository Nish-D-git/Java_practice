
import java.util.Scanner;

public class twoFindx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int Arr[][] = new int [row][col];

        System.out.println(" elements enter: ");
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){                
                Arr[i][j] = sc.nextInt();
            }
        }

        //for finding X :
        System.out.print("Enter X element: ");
        int x = sc.nextInt();

        //for output
        System.out.println("array is");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(Arr[i][j]+ " ");
                
                //if for x element
                if(x == Arr[i][j]){
                    System.out.println();
                    System.out.print("x element is at position: " + i+"," +j);
                }
            }
            System.out.println();
        }
        
    }
}
