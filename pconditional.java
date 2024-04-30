import java.util.*;
public class pconditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("the given number is odd");
        }
    }
}
