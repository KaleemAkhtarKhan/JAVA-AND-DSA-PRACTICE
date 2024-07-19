import java.util.Scanner;

public class int33 {
    
    public static int sumofdigits(int n){
        int sum=0;
        while ( n>0) {
       int lastdigit=n%10;
       sum= sum+lastdigit;
       n=n/10;

        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("enter the number :");
        int num= sc.nextInt();
        System.out.println("sum of digits is :" +sumofdigits(num));

        sc.close();
    }
}
