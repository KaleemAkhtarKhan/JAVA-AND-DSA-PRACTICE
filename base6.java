public class base6 {
    public static int linearsearch(int num[] , int key){
        for(int i= 0; i<num.length; i++){
            if (num[i]==key){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {2,4,8,6,10,19,15};
        int key= 4;
       int index= linearsearch(num, key);
       if(index==-1){
        System.out.print("the key value is missing !!");
       }else{
        System.out.println("the value is at index :"+index +" and the value is :"+key);
       }
        
       
        
    }
}
