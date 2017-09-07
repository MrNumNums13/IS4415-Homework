package HW1;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        Double subtotal = scan.nextDouble();
        Double gratuityRate = scan.nextDouble();
        Double totalGratuity = subtotal * (gratuityRate * .01);
        System.out.println("The gratuity is $" + totalGratuity + " and the total is $" + (totalGratuity + subtotal));

    }
}
