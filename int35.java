public class int35 {
    
    public static void Piramid(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1 ; j<=(row-i);j++){
                System.out.print("");

                }
                for( int j=1; j<=i; j++){
                    System.out.print("*");

            }
           
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Piramid(5, 5); 

    }
}
