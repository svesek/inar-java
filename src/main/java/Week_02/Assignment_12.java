package Week_02;

import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ltfen hızı ve ıvmeyı gırın");
        double hiz = input.nextDouble();
        double ivme= input.nextDouble();
        double limit =hiz*hiz/(2*ivme);
        System.out.println("kalkıs ıcın mın hız: "+limit);




    }

}
