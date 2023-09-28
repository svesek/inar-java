package Week_02;

import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yılı gırınız");
        int yil = input.nextInt();
        int toplam = 312032486 + (((31536000 / 7) - (31536000 / 13)
                + (31536000 / 45)) * yil);
        System.out.println("nufus mıktarı:"+toplam);

    }
}
