import java.util.*;
public class int63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the size of array :");
         int size = sc.nextInt();
         int [] number = new int  [size];
         System.out.print("enter the element of array :");
         for (int i = 0; i<size; i++){
            number[i] = sc.nextInt();
         }
         System.out.print("enter the key value:");
         int key = sc.nextInt();
         for (int i = 0; i<number.length; i++){
            if (key != number[i]){
              System.out.println("the value is at index not found ");
            }
         }
         sc.close();
    }
}
