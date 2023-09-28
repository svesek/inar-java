package Week_03;

import java.util.Scanner;

public class Assignment_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg = input.nextDouble();
        double boy = input.nextDouble();
        double bmi = kg / Math.pow(boy, 2);
        if (bmi < 18.5)
            System.out.println(bmi + " zayıf");
        else if (18.5 < bmi && bmi < 25)
            System.out.println(bmi + "normal");
        else if (25 <= bmi && bmi < 30)
            System.out.println(bmi + "fazla kilolu");
        else if (30 <= bmi)
            System.out.println(bmi + "obez");


    }
}
