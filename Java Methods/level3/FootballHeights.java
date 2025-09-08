import java.util.Random;
public class FootballHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250 inclusive
        }
        System.out.println("Player heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        int sum = sum(heights);
        double mean = mean(heights);
        int shortest = shortest(heights);
        int tallest = tallest(heights);
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
