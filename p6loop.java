import java.util.*;
public class p6loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        for ( int i =0; i<=n; i++ ) {
            if (n %10 == 0 ){
                continue;
            }System.out.print(n);
            
        }
    }
}
