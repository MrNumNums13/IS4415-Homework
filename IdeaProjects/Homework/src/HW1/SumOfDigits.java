package HW1;

import java.util.Scanner;

/**
 * Created by harryhanskat on 9/7/17.
 */
public class SumOfDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number between 0 and 1000: ");
        int number = scan.nextInt();
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100);
        System.out.println("The sum of the digits is "+ (ones+tens+hundreds));
    }
}
