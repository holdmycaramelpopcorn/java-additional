package p3;
import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the payment");
        double payment = input.nextDouble();
        if(payment>=0&&payment<=1000000000) {
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println("US: " + usFormat.format(payment));
            System.out.println("India: " + indiaFormat.format(payment));
            System.out.println("China: " + chinaFormat.format(payment));
            System.out.println("France: " + franceFormat.format(payment));
        }
        else if(payment<0)
            System.out.println("Negative Payment entered");
        else
            System.out.println("Payment not in limits");
    }
}