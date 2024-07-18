import java.util.Scanner;

public class int15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        int i=0;
        int reverse;
        while ( i<=num){
            reverse = num%10;
            num =num/10;
            
            System.out.print(" " +reverse);
            i++;
        }
        sc.close();
        
    }
}
