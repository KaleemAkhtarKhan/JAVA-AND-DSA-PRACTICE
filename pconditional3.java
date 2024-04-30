import java.util.*;
public class pconditional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.println("the first one is greatest");
            
        }else if (b > a && b > c) {
            System.out.println("the seccond one is greatest");
            
        }
        else{
            System.out.println("the third one is greatest");
        }
        
      }
    }

