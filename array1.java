public class array1 {
    
    public static int linearsearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
            
            
        }
        return -1;
    }



    public static void main(String[] args) {
        
        int num[]= {2, 4, 6, 8, 10, 12, 14, 16};
        int key=10;
         int index =linearsearch(num, key);
         if(index==-1){
            System.out.print("number is not found !!");
         }else{
            System.out.print("the number is at index "+index);
         }
         System.out.println("  ");
         System.out.println("the value is :"+key);
    }
}
