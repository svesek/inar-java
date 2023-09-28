package Week_03;

import java.util.Scanner;

public class Assignment_20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen faiz ve para mıktarını gırınız");
        double faiz = input.nextDouble();
        double bakiye = input.nextDouble();
        double yıllıkfaiz = bakiye * (faiz/1200);
        System.out.println("yıllık getırı: "+yıllıkfaiz);

    }
}
