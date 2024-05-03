import java.util.Scanner;

public class binomialcoeff {
    public static int fact(int n){
        int f = 1;
        for( int i = 1; i <=n; i++){
            f = f *i;
        }
        return f;
    }
    public static int bincoffe(int n, int r){
        int ni = fact(n);
        int ri = fact(r);
        int facto_nmr = fact(n-r);
        int binomialcoeffe = ni/(ri*facto_nmr);
        return binomialcoeffe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the value of N:");
        int n = sc.nextInt();
        System.out.print("enter the value of R :");
        int r = sc.nextInt();
        int binomialcof = bincoffe(n, r);
        System.out.println("the binomial coffecient is :" +binomialcof);
        sc.close();
    }
}
