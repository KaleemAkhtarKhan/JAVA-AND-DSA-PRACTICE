public class string3 {
    public static boolean ispalindrome(String name){
        int start = 0; 
        int end = name.length()-1;
        for (int i= 0; i<name.length(); i++){
            if(name.charAt(start) != name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "faisal";
        if(ispalindrome(name) ==true){
            System.out.println(" the name entered by user is a palindrom ");
        }else{
            System.out.println("the name is not palindrome ");
        }
       
      
       
        }
    
}
