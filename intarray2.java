public class intarray2 {
    public static void largest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(largest<num[i]){
                largest = num[i];
                
            }

        }
        System.out.print(largest);
        System.out.println();
    }    



    public static void main(String[] args) {
        int num []= {1, 2, 6, 3, 5};
        largest(num);
        
    }
}
