import java.util.*;
public class base2 {
    // TO reverce of a number entered by user 
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        for(int i=0; i<=num; i++){
            int lastdigit = num%10;
            num = num/10;
            System.out.print(lastdigit);
            sc.close();
        }
        
    }
}
