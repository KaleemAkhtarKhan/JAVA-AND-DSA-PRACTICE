public class int56 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j =1; j<=5-i; j++){
                System.out.print(" ");
            }
            int row = 5;
            int col = 5;
          
            for (int k = 1; k<=col; k++){
                if(i==1 || row ==i || k==1 || col ==k ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          }
          
        }
     }

