package Week_04;

import java.util.Scanner;

public class Assignment_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Compute the area of a regular polygon
        double area = (numberOfSides * Math.pow(side, 2) /
                (4 * Math.tan(Math.PI / numberOfSides)));

        // Display result
        System.out.println("The area of the polygon is " + area);
    }
}
