import java.util.*;
public class p3loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }System.out.print("sum of first natural number is :" +sum);
    }
}
