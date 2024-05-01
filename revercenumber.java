import java.util.*;
public class revercenumber {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        
        while (num > 0) {
            int lastdigit = num %10;
            rev = (rev*10) + lastdigit;
            num = num / 10;
            
        } System.out.print(rev);
    }
}
