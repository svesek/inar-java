package Week_03;

public class Assignment_16 {
    public static void main(String[] args) {
        // Generate random width and height
        int width = (int)((Math.random() * (50 + 50)) -50);
        int height = (int)((Math.random() * (100 + 100)) -100);

        // Display coordinate
        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println(
                "with width 100 and height 200: (" + width + ", " + height + ")");
    }
}
