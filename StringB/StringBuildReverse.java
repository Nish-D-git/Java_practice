package StringB;
import java.util.*;

public class StringBuildReverse {
    public static void main(String[] args) {
        // String reverse using String builder        
        Scanner sc = new Scanner(System.in);
        System.out.print("Print a String: ");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder(name);

        System.out.println(name);
        System.out.println(name.length());

        //charAt
        System.out.print("Enter a index, less than "+name.length()+" index number: ");
        int specElem = sc.nextInt();
        System.out.println(name.charAt(specElem));        
        
    }
    
}
