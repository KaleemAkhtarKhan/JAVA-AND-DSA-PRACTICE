import java.util.Scanner;

public class function{
    public static int  claculatesum(int a ,int b){
        int sum = a + b;
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your first number :");
        int a = sc.nextInt();
        System.out.print("enter your seccond number :");
        int b = sc.nextInt();
       int  sum = claculatesum(a,b);
        System.out.println("sum is :" +sum);
        
        sc.close();
    }
}