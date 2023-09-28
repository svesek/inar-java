package Week_04;

import java.util.Scanner;

public class Assignment_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sting: ");
        String str = input.nextLine();

        // Display the string's length and its first character
        System.out.println(str + " has a length of " + str.length() +
                " and its first character is " + str.charAt(0));
    }
}
