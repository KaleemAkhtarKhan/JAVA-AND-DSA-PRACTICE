import java.util.Scanner;

public class int8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the year :");
        int year = sc.nextInt();

        if (year %4 == 0 || year %400 == 0 ){
                System.out.println("this is a leep year ");
            }

            else if(year %100 == 0) {
                System.out.println("this is a leep year ");
            }
        else {
            System.out.println("not a leep year!!");
        }

        sc.close();
    }
}
