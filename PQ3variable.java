import java.util.*;
public class PQ3variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bil = pencil+pen+eraser;
        System.out.println( "bill " +bil);
        double gst = bil*18/100;
        System.out.println(" additional GST for total is " +gst);
        double total = bil+gst;
        System.out.println("the total amount to be payed:"+ total);
    }
}
