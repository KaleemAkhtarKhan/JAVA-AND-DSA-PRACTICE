public class tcs8 {
    // combination  of tcs7 & tcs6 problem( full star pattern)
    public static void main(String[] args) {
        int n = 5;
        for(int i =1; i<=n; i++){
            // for 1st star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            // for space print 
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            // again star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // reverce of that upper pattern
        for(int i=n; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
