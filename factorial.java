import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int f = 1;
        for( int i = 1; i <=n; i++){
            f = f *i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int number = sc.nextInt();
        int fact = fact(number);
        System.out.println("factorial is :" +fact);
        sc.close();
    
    }
}
