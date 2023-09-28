package Week_04;

import java.util.Scanner;

public class Assignment_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = input.nextInt();

        for (int n = 10000; n <= 100000; n += 10000) {
            p += (Math.pow(-1, n + 1)) / (2 * n - 1);
        }
        double result = 4 * p;

        System.out.println(result);
    }
}