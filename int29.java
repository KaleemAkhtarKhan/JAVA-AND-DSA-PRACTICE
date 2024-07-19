import java.util.Scanner;

public class int29 {
    // function for binary number to decimal number 
    public static int bintodec(int n){
        int pow= 0;
        int dec= 0;
        while (n>0) {
            int lastdigit= n%10;
            dec= dec +(lastdigit* (int)Math.pow(2, pow));
            pow++;
            n= n/10;
        }
        return dec;
    }

// functio for decimal to binary 

    public static void dectobin(int n){
        int bin= 0;
        int pow= 0;
        while (n>0) {
          int reminder = n%2;
            bin=bin+(reminder* (int )Math.pow(10, pow));
            pow++;
            n= n/2;


            
        }
        System.out.println("the number is :" +bin);
    }



public static void main(String[] args) {
    
    // Scanner sc = new Scanner (System.in);
    // System.out.print("enter the number:");
    // int num= sc.nextInt();
    // num = bintodec(num);
    // System.out.println(num);
    // sc.close();

    // for decimal to binary 
    Scanner sc = new Scanner (System.in);
    System.out.print("enter the number:");
    int num= sc.nextInt();
    dectobin(num);
    
    sc.close();
}

}
