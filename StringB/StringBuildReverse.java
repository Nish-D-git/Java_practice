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
        
    }
    
}
