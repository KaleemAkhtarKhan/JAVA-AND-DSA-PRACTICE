public class base14 {
    // kadane's algorithm
    public static void main(String[] args) {
        int num []= {2,4,6,8,10};
        int currentsum = 0; 
        int maxsum= Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
           
            for(int j = 0; j<num.length; j++){
                currentsum=0;
                for(int k =i; k<=j; k++){
                    System.out.print(num[k]+" ");
                    currentsum = currentsum+num[k];


                }
                
                System.out.println();
            }
            if(maxsum< currentsum){
                maxsum = currentsum;
            }
            System.out.print("current sum is :"+currentsum);
            System.out.println();
        }
        System.out.print("max sum  is :" +maxsum); 
    }
}
