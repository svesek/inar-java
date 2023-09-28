package Week_02;

import java.util.Scanner;

public class Assignment_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "lutfen degerlerı gırınız");
        double f = input.nextDouble();
        double v = input.nextDouble();
        double t = 35.74 + 0.6215*f - 35.75*Math.pow(v,0.16)+ 0.4275*f*Math.pow(v,0.16);
        System.out.println("deger: "+ t);


    }

}
