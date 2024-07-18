import java.util.Scanner;

public class int12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        for(int i =1; i<=num ; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
