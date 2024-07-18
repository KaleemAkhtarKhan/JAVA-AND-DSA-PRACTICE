import java.util.Scanner;

public class int17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        do{

            System.out.println("enter the number :");
            int num = sc.nextInt();
            sc.close();
            if (num %10 ==0){
                continue;
            }
            System.out.println(num);

        } while(true);
        
    
    }
}
