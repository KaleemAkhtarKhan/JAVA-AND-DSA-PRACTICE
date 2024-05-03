import java.util.Scanner;

public class function1 {
    public static int product(int a, int b){
         int product = a * b;
         return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your first number :");
        int a = sc.nextInt();
        System.out.print("enter your seccond number :");
        int b = sc.nextInt();
        int multiply = product(a, b);
        System.out.print("the product of NUM 1 and NUM 2 is :" +multiply);
        sc.close();



    }
}
