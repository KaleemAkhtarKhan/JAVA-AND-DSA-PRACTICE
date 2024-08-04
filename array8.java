public class array8 {
        public static void subarrysum(int num []){
            int currentsum = 0;
            int maxsum = Integer.MIN_VALUE;


              // for the prifix sum
              int  prifix[] = new int [num.length];
              prifix[0] = num[0];
            for (int i= 1; i<prifix.length; i++){
                prifix[i]= prifix[i-1] + num[i];
            }
              
                 
            for (int i = 0; i<num.length; i++){
              
                    for(int j=1; j<num.length; j++){
                        currentsum = i==0? prifix[j] : prifix[j]- prifix[i-1];

                    }
                    System.out.println(currentsum);
                
                if(maxsum<currentsum){
                    maxsum = currentsum;
                }
            }
            System.out.println("the max sybarray sum is :" +maxsum);
        }




    public static void main(String[] args) {
        int num [] = {1, -2, 6, -1, 3};
        subarrysum(num);
    }
}
