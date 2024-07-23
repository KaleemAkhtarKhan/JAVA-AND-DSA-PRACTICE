public class intarray4 {
 
    public static void pairs(int num[]){
        for(int i= 0; i<num.length; i++){
            int current = num[i];
            for(int j= i; j<num.length; j++){
                System.out.print("(" +current+ ","+ num[j]+" )");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10}; 
        pairs(num);
    }
}