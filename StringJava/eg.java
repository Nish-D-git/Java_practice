package java_VS_note.StringJava;
import java.util.Scanner;

public class eg {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String name1 = sc.next();
        System.out.print("Enter your last name: ");
        String name2 = sc.next();

        System.out.println("FIrst name: " +name1);
        System.out.println("Last name: " +name2);

        // concatination
        System.out.println();
        String fullName = name1 + " " + name2;
        System.out.print("Full name is: " + fullName);
        System.out.println();

        //compareTo
        // for comparing two string we can use name1 == name2 but, its not valid.
        // use compareTo() funt.
        // S1 > S2 :S1 is greater : => +ve 
        // S1 = S2 :S1,S2 are equal : => 0 
        // S1 < S2 :S2 is greater : => +ve 
        if(name1.compareTo(name2) == 0){            
            System.out.println("INVALID NAME");
        }else{
            System.out.println("VALID NAME");

            // charAt => use when user want to print one charate at a time.
            for(int i=0; i<fullName.length(); i++){
                System.out.print(fullName.charAt(i) +" ");
                
            }
            
        }

        //use of substring(intial inedx for beginning, ending index);
        String pronounce = fullName.substring(0,5);
        System.out.println();
        System.out.print("Your pronounce will be: " + pronounce);

        
    }
}
