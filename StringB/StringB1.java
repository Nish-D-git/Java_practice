package StringB;

import java.util.*;
public class StringB1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nishant");
        System.out.println(sb);

        //print a char
        System.out.println(sb.charAt(0));       
        
        //length
        System.out.println(sb.length());

        //insert
        System.out.println(sb.insert(0, "desh "));

        //setCharAt
        sb.setCharAt(0,'D');
        System.out.println(sb);

        //delete
        sb.delete(1,4);
        sb.delete(6,9);
        System.out.println(sb);

        //append
        sb.append("a");
        sb.append("n");
        sb.append("t");
        System.out.println(sb);
    }
    
}
