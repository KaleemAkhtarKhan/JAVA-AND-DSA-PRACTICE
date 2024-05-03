import java.util.Scanner;

public class primeinrange {
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
      public static void inrangeprime(int n){
        for(int i = 2; i<=n; i++){
            if(isprime(i)){
                System.out.print(+i+ " ");
            }
            // System.out.println();

        } 
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your range number :");
        int n = sc.nextInt();
        inrangeprime(n);
        sc.close();
      }
}

