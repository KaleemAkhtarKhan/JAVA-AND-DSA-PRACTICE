import java.util.*;
public class PQ3loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        sc.close();
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            
            factorial *=i;
        }
        System.out.println("factorial is "+factorial);
    }
}
