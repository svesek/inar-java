package Week_05;

public class Assignment_12 {
    public static void main(String[] args) {
        int n = 0;	// Start n at 0

        while (Math.pow(n, 2) <= 12000) {

            while (Math.pow(n, 2) < 12000) {

                n++;        // Increment n
            }


            System.out.println(
                    "The smallest integer n such that n^2 is greater than 12,000: " + n);

        }   }
}
