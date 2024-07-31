public class int37 {
    public static int keyvalue(int num [] ,int key ){
        for (int  i = 0; i <num.length; i++){
            if (num[i] == key){
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = keyvalue(num, key);
        System.out.println("the index of that key is :" +index);
        System.out.println("the value at index " +index+ " is :" +key);
    }
}
