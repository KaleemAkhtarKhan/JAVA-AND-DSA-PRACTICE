import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner (System.in);
        age = sc.nextInt();
        sc.close();
        if (age>18) {
            System.out.println("you are adult");

        }
        else{
            System.out.println("you are minor and not able to vote" );
        }
    }

}
