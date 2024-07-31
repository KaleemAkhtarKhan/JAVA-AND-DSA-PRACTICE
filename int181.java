import java.util.*;
public class int181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();

            boolean isprime=true;
            for( int i=2; i<=num; i++){
                if(num%i==0){
                    isprime=false;
                }
            }

            if(isprime==true){
                System.out.println("the number is not  a prime number !!");
            } else{
                System.out.println("the number is  a prime number!!");
            }
            sc.close();

    }
}
