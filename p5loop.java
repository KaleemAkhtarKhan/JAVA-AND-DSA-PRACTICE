import java.util.*;
public class p5loop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("enter the number :");
        int num =  sc.nextInt();
        sc.close();
        while (true) {
            if (num %10 == 0){
                System.out.print("you entered the number is multiple of 10 ");
                break;
            }
            System.out.print("your number is :" +num);
            break;
            
           
                        
        } 
    } 
}
