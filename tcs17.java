public class tcs17 {
    public static void main(String[] args) {
        int n= 5;
        int counter = 1;
        for(int i= 1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            } for(int k=1; k<=i; k++){
                System.out.print(counter+" ");
            }
            counter++;
            System.out.println();
        }
    }
}
