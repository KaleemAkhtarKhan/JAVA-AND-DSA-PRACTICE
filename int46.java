import java.util.Scanner;

public class int46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the row number :");
        int row = sc.nextInt();
        System.out.print("enyter the coloum number :");
        int col = sc.nextInt();
        for (int i =1; i<=row; i++){
            for (int j = 1; j<=col; j++){
                if(i==1 || row==i || j ==1|| j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
