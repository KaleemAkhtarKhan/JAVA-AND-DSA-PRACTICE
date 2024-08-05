public class array9 {
    public static void kadans(int num []){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i<num.length; i++){
            
            currsum = currsum + num[i];
            if(currsum <0){
                currsum =0;

            }
            // to calculate the max 
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("the max sum of sub array is :" +maxsum);
    }





    public static void main(String[] args) {
        int num [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadans(num);
    }
    
}
