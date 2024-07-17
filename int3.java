import java.util.Scanner;

public class int3 {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("enter the side of area :");
        int side = sc.nextInt();
        double  AreaofSqure = 3.14*side*side ;

        System.out.print("the area of squre is :" +AreaofSqure);

        sc.close();

    }
}
