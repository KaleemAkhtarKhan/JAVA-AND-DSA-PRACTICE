import java.util.*;
public class PQ4loop {
    public static void main (String[] args){
        Scanner sc =  new Scanner (System.in);
        System.out.print("input the number :");
        int num = sc.nextInt();
        sc.close();
        int i;
        System.out.println("the multiplication table of " +num );
        for (i = 1; i <= 10; i++){
            
            System.out.println( num+ "*" + i + "="+num*i);
        }
    }
}
