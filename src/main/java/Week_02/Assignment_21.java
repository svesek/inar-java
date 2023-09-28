package Week_02;

import java.util.Scanner;

public class Assignment_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen degerleçri girin");
        double yatırımtutari= input.nextDouble();
        double aylıkfaiz= input.nextDouble();
        double numberofyears= input.nextDouble();
        double getiri = yatırımtutari*Math.pow((1+aylıkfaiz),numberofyears*12);
        System.out.println("getiri: "+ getiri);
    }
}
