import java.util.*;
public class PQ4conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        sc.close();
        if (year%4==0){
            System.out.println("yes! this is a LEAP YEAR ");
        }else if(year%400==0){
            System.out.println("yes  this is a leap year");

        }else if (year % 100 == 0){
            System.out.println("this not a leeap year ");
        }else {
            System.out.println("not a leap year");
        }
    }
}
