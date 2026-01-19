public class rev_pyramid {
    public static void main(String[] args) {
        //o/p:
        // ****
        // ***
        // **
        // *
         
                
        int n = 4;
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for(Integer j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
