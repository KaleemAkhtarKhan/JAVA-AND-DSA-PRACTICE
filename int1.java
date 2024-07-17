import java.util.Scanner;

public class int1 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your first number :");
        int a = sc.nextInt();
        System.out.println("enter your seccond number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of number = "+sum);
         sc.close();
    }
}
