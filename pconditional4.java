import java.util.*;
public class pconditional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float marks = sc.nextFloat();
        sc.close();
        if (marks >=30){
            System.out.println("your marks is greater than 30 and congratulation! you are PASSED");

        }
        else{
            System.out.println("your marks is less than 30 and you should TRY AGAIN!");
        }


    }
}
