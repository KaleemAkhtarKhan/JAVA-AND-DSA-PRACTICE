import java.util.Scanner;

public class string5 {
    public static String subString(String str, int si, int ei){
        String subString = "";
        for(int i= si; i<ei; i++){
            subString += str.charAt(i);


        }
        // System.out.println(subString);
        return subString;
    }
    public static void main(String[] args) {
        // for printing substring 
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the string :");
        String str = sc.next();
        // String str = "HelloWorld";

        // predifindend function in java to print substring 
       // System.out.println( str.substring(0,5));

    //    the function which i build
        System.out.println(subString(str, 0, 5));
        sc.close();
    } 
}
