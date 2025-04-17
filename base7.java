public class base7 {
    public static int largestnum(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i= 0; i<num.length; i++){
            if(num[i] >largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {2,4,5,8,45,78,63,90,110,45,};
        System.out.println(largestnum(num));
    }
}
