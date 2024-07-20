public class ADpattern9 {
    
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            // to print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // to print star
            for(int j= 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.err.println();
        }
        for (int i=n; i>=1;i--){
            
             // to print space
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // to print star
            for(int j= 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.err.println();

        }
    }


    public static void main(String[] args) {
        diamond(4);
    }
}
