import java.util.Scanner;

public class int23 {

    public static int csum(int a,int b){
        int sum= a+b;
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your first number :");
        int num1= sc.nextInt();
        System.out.print("enter your seccond number :");
        int num2 = sc.nextInt();
        int sum= csum(num1,num2);
        System.out.println("the sum is :" +sum);
        sc.close();

    }
}
