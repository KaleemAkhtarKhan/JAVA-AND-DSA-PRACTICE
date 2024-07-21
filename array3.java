public class array3 {
    
    public static void reversearray(int number[]){
        int first =0, last=number.length-1;
        // for reverse we can use swap concept 

        while (first<last) {
            
        int temp= number[last];
        number[last]=number[first];
        number[first]=temp;

        first++;
        last--;

        }
    }


    public static void main(String[] args) {
        int number[] ={5, 4, 3, 2, 1};
        reversearray(number); 
        for(int i= 0; i<number.length; i++){
            
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
