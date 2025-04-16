import java.util.*;
public class tcs3 {
    //sum of all natural number enterd by user 
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        int sum = 0;
        for(int i= 0; i<=num; i++){
            sum = sum+i;
        }
        System.out.print("the sum of number till "+num+" is :" +sum);
        sc.close();
    } 
}
