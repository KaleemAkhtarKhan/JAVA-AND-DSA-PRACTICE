import java.util.*;
public class string7 {
    public static int countvowels(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='u' || str.charAt(i)=='o'){
                count++;

            }
            // seccond type of solution 

            // }else if(str.charAt(i)=='e'){
            //     count++;
            // }else if(str.charAt(i)=='i'){
            //     count++;
            // }else if(str.charAt(i)=='o'){
            //     count++;
            // }else if(str.charAt(i)=='u'){
            //     count++;
            // }
            


        }
         return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the string :");
        String str = sc.nextLine();
        System.out.print(" the number of vowels present in the string is :"+countvowels(str));
        sc.close();


    }
}
