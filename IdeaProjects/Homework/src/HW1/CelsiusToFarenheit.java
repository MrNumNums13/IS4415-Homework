package HW1;

import java.util.Scanner;

/**
 * Created by harryhanskat on 9/7/17.
 */
public class CelsiusToFarenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Celsius temperature you would like to convert:");
        Double fahrenheit = scan.nextDouble();
        System.out.println(fahrenheit + " Celsius is " + ((9.0/5)*fahrenheit + 32) + " Fahrenheit");
    }
}
