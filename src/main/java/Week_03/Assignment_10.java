package Week_03;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        // Generate tow integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // Prompt the user to enter an answer
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        // Display result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("You are wrong " + number1 + " + " + number2
                    + " should be " + (number1 + number2));
    }
}
