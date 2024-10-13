public class gfg1 {
    public static void compareNM(int n, int m) {
        if (n<m){
            System.out.print("lesser");
        }
          else if (n==m){
            System.out.print("equal ");
        }  else if (n>m){
            System.out.print("grater");
        }
    }
    


    public static void main(String[] args) {
        compareNM(07, 9);
    }

}
