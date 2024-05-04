import java.util.Scanner;

public class PQ1function {
    public static int average(int a, int b, int c){
       int  average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("enter your first number :");
        int a = sc.nextInt();
        System.out.print("enter your Seccond  number :");
        int b = sc.nextInt();
        System.out.print("enter your third  number :");
        int c = sc.nextInt();
        System.out.println(average(a, b, c));
        sc.close();
    }
}
