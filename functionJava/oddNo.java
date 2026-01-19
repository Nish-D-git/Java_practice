public class oddNo {
    //sum of all odd numver till n

    public static void sumOddNo(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0) {
                sum = sum + i;
                
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Sum of all odd no. till " +n+ " is: ");

        sumOddNo(n);
    }    
}
