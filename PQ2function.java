import java.util.Scanner;

public class PQ2function {
    public static int isEven(int n){
            if (n%2==0) {
               System.out.println("TRUE!");
            } else
             System.out.println("FALSE!" );
        return isEven(n);
     }
     public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        System.out.print("enter your number :");
        int num = sc.nextInt();
        System.out.print(isEven(num));
        sc.close();
    }
        

     }
    
    

