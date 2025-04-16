public class tcs10 {
    // 01 number pattern in java
    public static void main(String[] args) {
        int counter = 1;
        for(int i=1; i<=6; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(" "+counter);
                counter++;
            }
            System.out.println();
        }
        
    }
}
