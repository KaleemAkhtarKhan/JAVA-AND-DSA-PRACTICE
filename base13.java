public class base13 {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i<num.length; i++){
            for(int j =i; j<num.length; j++){
                currentsum = 0;
                for(int k = i; k<=j ;k++){
                    System.out.print(num[k]+" ");
                    currentsum = currentsum+ num[k];
                    if(currentsum> maxsum){
                        maxsum = currentsum;
                    }
                    
                }
                System.out.println("the current sum is :"+currentsum);
                System.out.println();

            }
           
            System.out.println();
        }
        System.out.print("the max sum of sub array is :"+maxsum);
    }
}
