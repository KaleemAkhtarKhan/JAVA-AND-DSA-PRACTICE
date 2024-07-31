public class int38 {
     public static int largestnum (int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if( largest<num[i]){
                largest = num[i];
            }
        }
        return largest;
     }

    public static void main(String[] args) {
        int num [] = {1, 2, 3, 6, 5};
        int largest = largestnum(num);
        System.out.println("the largest number in the array is : " +largest);
    }
}
