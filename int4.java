import java.util.Scanner;

public class int4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the cost of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("enter the cost of pen :");
        float pen = sc.nextFloat();
        System.out.println("enter the cost of Eraser :");
        float eraser = sc.nextFloat();

        float totalcost = pencil + pen + eraser;
        System.out.print("the total cost of items is : " +totalcost);

        float gst = ((totalcost*18)/100) + totalcost;
        System.out.println();
        System.out.println("grand total cost after 18% of GST is :" +gst);

        sc.close();

    }
}
