import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        sc.close();
        boolean isprime= true;
        for(int i=2; i<= num-1; i++ ){
            if (num%i==0) {
                isprime=false;
                
            }
        }
        if(isprime==false){
            System.out.println("the number is not a prime number !!");
        } else{
            System.out.println(" the number is prime number !!");

        }
       
    }
}
