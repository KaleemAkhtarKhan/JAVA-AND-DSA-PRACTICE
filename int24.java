import java.util.*;

public class int24 {

    public static int product(int a , int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the seccond number :");
        int b = sc.nextInt();
        int multiplication = product(a, b);
        System.out.println(multiplication);
        sc.close();
    }
}
