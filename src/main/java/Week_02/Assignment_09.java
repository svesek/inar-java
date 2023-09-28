package Week_02;

import java.util.Scanner;

public class Assignment_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plase v2,v1,t enter");
        int v2 = input.nextInt();
        int v1 = input.nextInt();
        int t = input.nextInt();
        int a = (v1 - v2) / t;
        System.out.println("a: " +a);

    }
}
