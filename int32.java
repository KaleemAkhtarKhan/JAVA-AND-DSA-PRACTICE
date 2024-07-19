import java.util.Scanner;

public class int32 {
    
    public static int palindrome(int n){
       int mynum= n;
        int output= 0;
        while (n>0) {
            int lastdigit= n%10;
            output= output*10+lastdigit;
            n= n/10;
            
        }
        if(mynum==output){
            System.out.println("the number is palindrome in java");
        } else{
            System.out.println("the number is not palindrome !");
        }
        return output;
       
        

    

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int num= sc.nextInt();
        palindrome(num);
        sc.close();
    }
}
