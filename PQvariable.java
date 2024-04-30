import java.util.*;
public class PQvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        float sum = a+b+c;
        float average = sum/3;
        System.out.println( "the average is : " + average);
    }
}