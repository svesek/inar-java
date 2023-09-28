package Week_02;

import java.util.Scanner;

public class Assignment_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter pounds: ");
        double pounds = input.nextDouble();
        double kg = pounds * 0.454;
        System.out.println("kg:"+ kg);
    }
}
