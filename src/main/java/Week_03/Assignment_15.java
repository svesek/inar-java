package Week_03;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random three-digit number
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user to enter a three-digit number
        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        // Extract digits from lottery
        int lotteryDigit1 = lottery / 100;
        int remainingDigits = lottery % 100;
        int lotteryDigit2 = remainingDigits / 10;
        int lotteryDigit3 = remainingDigits % 10;

        int guessDigit1 = guess / 100;
       // int remainingDigits = guess % 100;
       // int guessDigit2 = remainingDigits / 10;
      //  int guessDigit3 = remainingDigits % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        if (guessDigit1 == lotteryDigit2)
        {

        }
    }
}
