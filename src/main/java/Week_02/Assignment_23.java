package Week_02;

import java.util.Scanner;

public class Assignment_23 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen girin distace,miles,price");
        double distace = input.nextDouble();
        double miles = input.nextDouble();
        double price = input.nextDouble();
        double Driving = (distace / miles) * price;
        System.out.println(Driving + ":");
    }
}
