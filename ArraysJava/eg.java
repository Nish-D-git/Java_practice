package java_VS_note.ArraysJava;
import java.util.*;

public class eg { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("array: ");        
        // for input
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
        System.out.print("element: ");
        int x = sc.nextInt();
         for(int i=1; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println(x+ "found at position: "+i);
            }
         }

    }       

                
    
}
