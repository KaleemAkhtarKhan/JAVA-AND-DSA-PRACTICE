import java.util.*;

public class intp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the first number :");
        int A = sc.nextInt();
        System.out.println("enter the seccond number :");
        int B = sc.nextInt();
        System.out.println("enter the third number :");
        int C = sc.nextInt();


        int average = ((A+B+C)/3);
        System.out.println("the average of these numbers is: " +average);

        sc.close();
    }
}
