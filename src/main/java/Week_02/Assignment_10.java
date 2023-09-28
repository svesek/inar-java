package Week_02;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen sırasıyla suyun kütlesi, son ve ilk sıcaklıkları gırınız: ");
// Q = M * (f�nalTemperature – �n�t�alTemperature) * 4184//
        double M = input.nextDouble();
        double Son = input.nextDouble();
        double ilk = input.nextDouble();
        double Q = M * (Son-ilk)*4184;
        System.out.println("Q= "+Q+" joule");

    }
}
