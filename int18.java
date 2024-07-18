import java.util.Scanner;

public class int18 {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number :");
    int num = sc.nextInt();
    
     boolean isprime= true;
    for(int i =2; i<=(num-1); i++){
        if (num%i==0){
            isprime =false;
        // System.out.println("the number is prime number !!");
    }
    }
    if(isprime==true){
        System.out.println("the number is prime number !!");
    }
    else{
        System.out.println("the number is not a prime number !!!");
    }
    
    
    sc.close();
    
   } 
}
