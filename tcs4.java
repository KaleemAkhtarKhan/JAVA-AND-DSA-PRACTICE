public class tcs4 {
    //   function to calculate factorial
    public static int factorial(int num){
        int fact=1;
        for(int i= 1; i<=num; i++){
             fact= fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("the factorial is :"+factorial(5));
    }
}
