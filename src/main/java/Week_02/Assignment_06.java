package Week_02;

import java.util.Scanner;

public class Assignment_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int lessThan10 = number % 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;
        System.out.println("The sum of the digits is " + sum);
    }
}
