public class array2 {
    
    public static int largestnum(int num[]){
        int largest= Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if ( largest < num[i]){
                largest = num[i]; 
                
            } 
        }
        return largest;
    }


    public static void main(String[] args) {
        int num[] = {1, 2, 6, 5, 3, 4 };
        System.out.println(largestnum(num));
    }
}
