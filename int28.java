import java.util.Scanner;

public class int28 {


    public static boolean isprime(int n){
        if(n==2){
            return false;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
          if (n %i ==0) {  //complitily divided 
            return false;
          }
         
        }  return true;
    }

    public static void primeinrangee(int num){
        for(int i=2; i<=num; i++){
            if(isprime(i)){
                System.out.println(""+i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();

        primeinrangee(num);
        
        sc.close();
    }
    
}