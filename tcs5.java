import java.util.*;
public class tcs5 {
    // factorial calculation 
    public static int fact(int num ){
        int facte = 1;
        for(int i = 1; i<=num; i++){
            facte = facte*i;
        }
        return facte;
    }
    // binomial cofficient calculation 
   

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the N number :");
        int n = sc. nextInt();
        System.out.print("enter the R number :");
        int r = sc. nextInt();

        int binaomial = fact(n)/(fact(r)*fact(n-r));

        System.out.println("the binomial cofficient is :"+binaomial);
        sc.close();
    }
   
}
