import java.util.Scanner;

public class int45 {
    public static void main(String[] args) {
       char az = 'A';
       Scanner sc = new Scanner (System.in);
       System.out.print("enter the number :");
       int num = sc. nextInt();

        for (int i = 1; i<=num; i++){
            // az = 'A';
            for (int j = 1; j<=i; j++){
               
                System.out.print(az);
                az ++;
            }
           
            System.out.println();
        }
        sc.close();
    }
}
