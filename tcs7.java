public class tcs7 {
    public static void main(String[] args) {
        // reverce half star patter
        int n= 5;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}
