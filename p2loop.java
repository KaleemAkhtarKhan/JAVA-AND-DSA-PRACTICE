import java.util.*;
public class p2loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = 1;
        System.out.print("enter your desired number to be printed : ");
        int n = sc.nextInt();
        sc.close();
        while (num<=n){
            System.out.print( "  " +num);
            num++;
        }

    }
}
