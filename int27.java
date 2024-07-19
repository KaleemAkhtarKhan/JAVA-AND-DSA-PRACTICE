import java.util.Scanner;

public class int27 {
   
        public static boolean isprime(int n){
            boolean primeis= true;
            for(int i=2; i<=n-1; i++ ){
                if(n%i==0){
                    primeis= false;
                }

                
            }
            return primeis;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        System.out.print(isprime(n));


        sc.close();




    }
}
