public class ADpattern3 {
    
    public static void invertednumpyramid(int n){
        for(int i = 1 ; i<=n; i++){

            // inner loop to print numbers 
            for(int j= 1; j<=(n-i)+1; j++){
                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
         invertednumpyramid(5);
    }
}
