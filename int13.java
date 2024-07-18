import java.util.Scanner;

public class int13 {
    public static void main(String[] args) {
        int sum =0;
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        for(i=1; i<=num; i++){
            sum = sum+i;
           
        }
         System.out.println(sum);
        sc.close();

    }
}
