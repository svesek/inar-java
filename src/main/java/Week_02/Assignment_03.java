package Week_02;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter feed");
        double feet = input.nextDouble();
        double metre = feet * 0.305;
        System.out.println("metre: "+ metre );

    }

}
