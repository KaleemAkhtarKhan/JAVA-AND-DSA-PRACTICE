public class int61 {
    public static void hollowRhonbus(int n){
        for(int i=1; i<=n; i++){
            // for space print 
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for hollow star print (refer to ADpattern1)
            for( int j=1; j<=n; j++){
                if(i==1 || i==n || j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        hollowRhonbus(5);
    }
}
