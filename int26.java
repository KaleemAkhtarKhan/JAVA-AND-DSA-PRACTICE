import java.util.Scanner;
public class int26 {

    public static int factorial(int a){
        int f=1;
        for (int i=1; i<=a; i++){
            
            f*=i;
            
        }
        return f;
    }


    public static int binomial(int n, int r){
        int binomial = factorial(n)/(factorial(r)*factorial(n-r));
        return binomial;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of N  :");
        int n = sc.nextInt();
        System.out.println( "enter the value of R");
        int r = sc.nextInt();
        System.out.println("the factorial is " +binomial(n, r));

        sc.close();

    }
    
}
