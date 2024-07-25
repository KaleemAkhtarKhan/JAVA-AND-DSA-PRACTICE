public class array7 {
    public static void kadans(int num[]){
        int currentsum= 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i= 0; i<num.length; i++){
            currentsum= currentsum + num[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum= Math.max(maxsum, currentsum);

            
        }
        System.out.println("the sub array max sum is :" +maxsum);
    }
    


    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadans(num);
    }
}
