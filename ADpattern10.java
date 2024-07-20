public class ADpattern10 {
    
    public static void numberpyramid(int n){
        int output=1;
        for (int i=1; i<=n; i++){
            for (int j= 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(output+" ");
                
            }
            System.out.println();
            output++;
        }
    }



    public static void main(String[] args) {
        numberpyramid(5);
    }
}
