package Week_03;

import java.util.Scanner;

public class Assignment_02 {
    public static void main(String[] args) {
        int a =(int) (Math.random()*10);
        int b =(int) (Math.random()*10);
        int c =(int) (Math.random()*10);
        System.out.println(a+"+"+b+"+"+c+"=?");
        Scanner input=new Scanner(System.in);
        int tahmin = input.nextInt();
        int total= a+b+c;
        if (total==tahmin){
            System.out.println("dogru");
        }
         else{
            System.out.println("yanlış");

        }


    }
}
