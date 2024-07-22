public class intarray {
    public static int  linearserach(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
        }
        System.out.println();
    }
    return -1;
 }


    public static void main(String[] args) {
        int number []= {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
         int index=linearserach(number, key);
        if ( index ==-1){
            System.out.println("the number is not found !!");

        }else{
            System.out.println("the number is at index :"+index);
            System.out.println("the value of index " +index+" is :"+key);
        }

    }
}
