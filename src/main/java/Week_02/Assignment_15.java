package Week_02;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen degerlerı gırınız.");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double deger = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double deger1 = Math.pow((x2 - x1), 2);
        double deger2 = Math.pow((y2 - y1), 2);
        //double deger = Math.sqrt((deger1+deger2));
        System.out.println("deger: " + deger);

    }
}
