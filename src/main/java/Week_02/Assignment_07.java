package Week_02;

import java.util.Scanner;

public class Assignment_07 {
    public static void main(String[] args) {
        // 1 saat 60 dk 1 gun 24*60 dk dır
        Scanner input = new Scanner(System.in);
        System.out.print("kaç dakıka gırınız: ");
        int number = input.nextInt();
        int gun = (number % (24*60));
        int yıl = number / (24*60*365);
        System.out.println("sonuç; " + gun +" "+ yıl + " olur");

    }
}
