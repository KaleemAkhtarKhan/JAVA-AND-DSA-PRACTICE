public class base15 {
    public static void main(String[] args) {
        int currentsum = 0; 
        int maxsum = Integer.MIN_VALUE;
        int num[]= {-2, -3, 4, -1, -2, 1, 5, -3};
        for(int i=0; i<num.length; i++){
            currentsum = currentsum+ num[i];
            if(currentsum < 0){
                currentsum=0;
            }
            maxsum= Math.max(maxsum, currentsum);
        }
        System.out.println("the max sum the array is :" +maxsum);
    }
}
