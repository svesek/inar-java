package Week_02;

import java.util.Scanner;

public class Assignment_14 {
// Body Mass Index (BMI) �s a measure of
//health on we�ght. It can be calculated by tak�ng your we�ght �n k�lograms and
//d�v�d�ng by the square of your he�ght �n meters. Wr�te a program that prompts the
//user to enter a we�ght �n pounds and he�ght �n �nches and d�splays the BMI. Note
//that one pound �s 0.45359237 k�lograms and one �nch �s 0.0254 meters. Here �s
//a sample run
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("lütfen vucut olculerınızı inç ve pound olarak giriniz.");
    double inc = input.nextInt();
    double pound = input.nextInt();
    double metre = inc * 0.45359237;
    double kg = pound * 0.0254;
    double endeks = kg/Math.pow(metre,2);
    System.out.println("vucut kıtle endeks: "+ endeks);


}
}
