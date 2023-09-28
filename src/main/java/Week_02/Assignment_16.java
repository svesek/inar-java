package Week_02;

import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println( "lutfen alanı gırınız");
        double s = input.nextDouble();
        double alan = 3*Math.sqrt(3)/2*Math.pow(s,2);
        System.out.println("area: "+alan);

    }
}
