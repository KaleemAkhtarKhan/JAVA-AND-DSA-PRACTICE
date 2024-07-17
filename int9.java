import java.util.*;
public class int9 {
   public static void main(String[] args) {

    int number ;
    int choice;
    int evensum =0;
    int oddsum = 0;

    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number :");
    number = sc.nextInt();

    if (number %2==0 ){
        evensum+=number;
        //System.out.println("even sum of number is : " +evensum);

    }
    else {
        oddsum+=number;
        //System.out.println("odd sum of number is : " +oddsum);
       
    }
      System.out.println("presss 1 for continue and 0  for discard :");
      choice = sc.nextInt();
      while (choice == 1) {
        System.out.println("the even sum is :" +evensum);
        System.out.println("the odd sum is :" +oddsum);
        
    }
    sc.close();

   } 
}
