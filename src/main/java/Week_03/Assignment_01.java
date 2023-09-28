package Week_03;

import java.io.PrintStream;
import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen a,b,c yi giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant1 = Math.pow(b, 2) - 4 * a * c;
        if (discriminant1 < 0) {
            System.out.println("there is no reel root");
        } else if (discriminant1 == 0) {
            double root = (-1 * b + (Math.sqrt(discriminant1))) / 2 * a;
            System.out.println("the root is " + root);
        } else {
            double root1 = (-1 * b + (Math.sqrt(discriminant1))) / 2 * a;
            double root2 = (-1 * b - (Math.sqrt(discriminant1))) / 2 * a;
            //System.out.println("the root1 is "+root1+" the root2 is "+root2);
            System.out.printf("%.2f%8s%.2f", root1, "   ", root2);


        }
    }
}