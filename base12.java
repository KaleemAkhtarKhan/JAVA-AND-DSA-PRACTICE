public class base12 {
    public static void main (String args[]){
        int num [] ={2,4,6,8,10};
        for(int i= 0; i<num.length; i++){
            for(int j= i+1; j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
}
