import java.util.Scanner;

public class int25 {

    public static int factorial(int a){
        int f=1;
        for (int i=1; i<=a; i++){
            
            f*=i;
            
        }
        return f;
    }




    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :!");
        int num = sc.nextInt();
        int factorial= factorial(num);
        System.out.println("the factorial is " +factorial);

        sc.close();

    }
    
}
