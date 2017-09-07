package HW1;

import java.util.Scanner;

/**
 * Created by harryhanskat on 9/7/17.
 */
public class NumberOfYears {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        int minutes = scan.nextInt();
        double hours = minutes/60;
        double years = (((minutes / 60)/24)/365);
        double days = (minutes/60/24) % 365;
        System.out.println("That is approximately " + years + " years, and "+ days + " days.");
    }
}
