import java.util.Scanner;

public class PQ5function {
    public static int SODigit(int n){
         int sum = 0;
         while (n>0) {
            int lastdigit = n %10;
            sum = sum+lastdigit;
            n = n/10;
           
         } return SODigit(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your number :");
        int n = sc.nextInt();
        // int sum = SODigit(n);
        System.out.println("the sum of number is :" +SODigit(n));
        sc.close();
    }
}
