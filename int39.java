public class int39 {
    public static void swaparray (int num[]){
        int first = 0;
        int last = num.length -1;
        while (first<last) {
            int temp = num[last];
             num [last] = num[first];
              num[first] = temp;
              first ++;
              last--;
        }
    }

    public static void main(String[] args) {
        // int num []  = {2, 4, 6, 8, 10};
        int num [] = {6, 5, 4, 3, 2, 1 };
         swaparray(num);
         for (int i = 0; i<num.length; i++){
            System.out.print(num[i] +" ");
         }
         System.out.println();
    }
}
