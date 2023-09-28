package Week_05;

import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;



        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        if (number == 0) {	// Test for sentinel value
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0) {
            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }

        double average = total / count;

        System.out.println(
                "The number of positive is " + positives +
                        "\nThe number of negatives is " + negatives +
                        "\nThe total is total " + total +
                        "\nThe average is " + average);
    }
}
