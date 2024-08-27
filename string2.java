
import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
         // string input in java
    Scanner sc = new Scanner (System.in);
    System.out.print("enter the first name :");
    String firstname = sc.next();
    System.out.print("enter the lastname:");
    String lastname = sc.next();
    // concatanation of string (addition of multiple string )
    String fullname = firstname + " "+ lastname;
    System.out.println(fullname);
    sc.close();
    }
}
