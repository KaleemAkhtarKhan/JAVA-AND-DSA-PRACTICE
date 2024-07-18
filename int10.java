import java.util.Scanner;

public class int10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number for table :");
        int num = sc.nextInt();
        sc.close();
        int i;
        for ( i=1 ; i <=10; i++){
            System.out.println( +num +"*" +i+ ":" +num*i);
        }
        

    }
}
