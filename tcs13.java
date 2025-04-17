public class tcs13 {
    public static void main(String[] args) {
        int n= 5;
        for(int i= 0; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for reverse print of the above 
        for(int i= 5; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k= 1; k<=2*(n-i); k++){
                System.out.print(" ");
            } for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
