
import java.util.Scanner;

public class conditional2 {
    public static void main(String[] args) {
         int age ;
        Scanner sc = new Scanner (System.in);
        age = sc.nextInt();
        sc.close();
        if (age>=18) {
            System.out.println("ADULT");

            
        }else if (age>13 && age <18) {
            System.out.println("you are TEENAGER");
            
        }else{
            System.out.println("you are child ");
        }

    }
}
