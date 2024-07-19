import java.util.Scanner;

public class int30 {
    
    public static int average(int a,int b, int c){
        int  average= (a+b+c)/3;
        return average;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("enter the seccond number :");
        int num2 = sc.nextInt();
        System.out.print("enter the third  number :");
        int num3 = sc.nextInt();
        System.out.print("the average of three number is : " +average(num1, num2,num3));
        sc.close();
    }
}
