import java.util.*;
public class p7loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
        sc.close();

        if (n == 2){
            System.out.println(n+ " is a prime number ");
    
        }else{
            boolean isprime = true;
            for (int i = 2; i <= n-1; i++){
                if (n % i == 0){
                    isprime = false;

                }
            }
            if (isprime == true){
                System.out.println("this is a prime number!");
        }  
        else{
            System.out.println("this is not a prime number !!!");
        }
        }

    }
}
