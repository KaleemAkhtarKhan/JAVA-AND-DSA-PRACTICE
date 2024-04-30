import java.util.Scanner;

public class calculatar {
    public static void main(String[] args) {
        int a ,b ;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number :");
        a = sc.nextInt();
        System.out.println("enter the seccond number :");
        b = sc.nextInt();
        System.out.println("enter the operatar");
         char ch = sc.next().charAt(0);
         sc.close();
        switch (ch) {
           
            case '+':
                System.out.println("addition" +(a+b));
                
                break;
            case '-': 
                System.out.println("substration :" +(a-b));
                break;
            case '*': 
            System.out.println("multiplicatiom :" +(a*b));
                 break;
             case '/': 
             System.out.println("Dvision :" +(a/b));
                 break;
             case '%': 
             System.out.println("madulo :" +(a%b));
                break;        
        
            default:
            System.out.println("you have entered invailid operator");
                break;
        }
    }
}
