import java.util.Scanner;

public class int5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
         
        if (num >= 0){
            System.out.println("the number is positive!");
        }
        else{
            System.out.println("number is negative !");

        }
        sc.close();
    }
}
