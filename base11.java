public class base11 {

    public static void subarraysum(int num[]){
        int currentsum = 0;
        int maxsum= Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            for(int j= i; j<num.length; j++){
                currentsum = 0;
                for(int k= i; k<=j; k++){
                    currentsum = currentsum+ num[k];

                }
                if (maxsum<currentsum){
                    maxsum = currentsum;
                }
                System.out.println(currentsum);
            }
        }
        System.out.print("the maxmum sub array sum is :"+maxsum);
    }
    public static void main(String[] args) {
        int num []= {2, 4, 6, 8, 10};
        subarraysum(num);

    }
}
