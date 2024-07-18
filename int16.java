import java.util.Scanner;

public class int16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
       
        do{
            System.out.print("enter the number:");
            int num = sc.nextInt();
            if (num%10==0){
                break;
            }
            System.out.println(num);
        } while(true);
           
        }
       
}
