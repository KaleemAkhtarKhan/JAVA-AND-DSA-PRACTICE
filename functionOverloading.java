import java.util.Scanner;

public class functionOverloading {
    public static int sum(int a, int b){
        return a+b;
        //either i can return int sum = a+b;
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
        // either i can return int sum = a+b+c;
    }
    public static void main(String[] args) {
        // int sum = sum(3, 05);
        // int sum = sum(2, 5, 1);
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your first number :");
        int a = sc.nextInt();
        System.out.print("enter your seccond number :");
        int b = sc.nextInt();
       

        System.out.println(sum(a, b));
        System.out.print("enter your third number :");
        int c = sc.nextInt();

        System.out.println (sum(a, b, c));
        sc.close();
    }
}
