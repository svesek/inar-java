package Week_02;

import java.util.Scanner;

public class Assignment_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius and uzunluk ");
        double radius = input.nextDouble();
        double uzunluk = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volum = area * uzunluk;
        System.out.println("area: " + area);
        System.out.println("volum: " + volum);
    }
}
