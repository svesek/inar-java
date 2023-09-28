package Week_02;

public class Assignment_13 {
    public static void main(String[] args) {
        // 3 aydakı
        double a1 = 100 * (1 + 0.00417);
        double a2 = (100 + a1) * (1 + 0.00417);
        double a3 = (100 + a2) * (1 + 0.00417);
        double a4 = (100 + a3) * (1 + 0.00417);
        double a5 = (100 + a4) * (1 + 0.00417);
        double a6 = (100 + a5) * (1 + 0.00417);
        System.out.println("sonuc: "+ a6);
    }
}
//public class Assignment_13 {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("please enter saving amount");
//        int savingAmount= input.nextInt();
//        double amount=(savingAmount*(1+0.00417));
//        for (int i = 0; i <5 ; i++) {
//            amount=((amount+savingAmount)*(1+0.00417));
//        }
//        System.out.println("after six month saving amount is "+amount);
//
//    }
//}
