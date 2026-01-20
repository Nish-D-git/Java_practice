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
        
        //reverse the string
        // for(int i=name.length(); i<=0; i--){
        //     System.out.println(name);
        // }        

        //using reverse functio
        sb.reverse();
        System.out.println(sb); //String() dont have reverse() funt; we only use reverse() with StringBuilder();
        
        //reverse using manual way //so it be as it was
        StringBuilder sb2 = new StringBuilder();
        for(int i=sb.length() - 1; i>=0; i--){
            sb2.append(sb.charAt(i));
        }
        System.out.print("reverse string manual way: "+sb2);
    }
    
}
