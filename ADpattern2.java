public class ADpattern2 {
   
    public static void invertedp(int n){
        // outer loop
        for (int i = 1; i<=n; i++){

            // for space print 
            for(int j= 1; j<= (n-i); j++){
                System.out.print(" ");
            }
            // for stars print 
            for(int j= 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
         
        invertedp(10);
    }
} 
