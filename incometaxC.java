import java.util.*;
public class incometaxC {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();
        sc.close();
        int tax1 = income*20/100;
        int tax2 = income*30/100;
        if (income<500000){
            System.out.println("your income is tax free ");

        }else if (income>500000 && income <1000000){
            System.out.println("you have to pay 20% of amount as TAX i.e.:" +tax1 );

        }else if(income>1000000){
            System.out.println("you have to pay 30% of your amount as TAX i.e.:" +tax2);
        }

    }
}
