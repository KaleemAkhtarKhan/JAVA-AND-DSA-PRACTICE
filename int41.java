public class int41 {
    
    public static void subarray(int num[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                
                for(int k = i; k<=j;  k++){
                    // System.out.print(num[k] +" ");
                    currentsum += num[k];
                   
                }
                System.out.println(currentsum);
            }
            if( maxsum<currentsum){
                maxsum= currentsum;
            }

        
        }
        System.out.println("the maximum sum of array is :" +maxsum);
        
    }


    public static void main(String[] args) {
        int num []= {2, 4, 6, 8, 10};
        subarray(num);
    }
}



    
