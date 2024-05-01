import java.util.*;
public class PQconditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("enter your number :");
        num = sc.nextInt();
        sc.close();
        if (num <1){
            System.out.println("Entered Number is NEGATIVE ");

        }else{
            System.out.println("Entered Number is POSITIVE ");
        }
    }
}
