import java.util.*;
public class base3 {
    // function creation (addtion  of two numbers)
    public static int sum (int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter num 1:");
        int a = sc.nextInt();
        System.out.print("enter num 2:");
        int b = sc.nextInt();
        System.out.print("the sum of the number is : "+sum(a, b));

        sc.close();
    }
}
