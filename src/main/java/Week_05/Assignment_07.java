package Week_05;

public class Assignment_07 {
    public static void main(String[] args) {
        int totalCost = 0;
        int tuition = 10000;
        int tuitionTenthYear=0;

        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.05);

            if (year > 10) // Test for after 10 years
                totalCost += tuition;
            if (year == 10)
                tuitionTenthYear = tuition;
        }

        System.out.println("Tuition in ten years: $" + tuitionTenthYear);

        System.out.println("Total cost for four years' worth of tuition" +
                " after the tenth year: $" + totalCost);
    }
}
