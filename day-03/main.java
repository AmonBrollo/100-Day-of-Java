import java.util.Arrays;
import java.util.List;

/**
 * BBQSkewer class for analyzing skewer configurations.
 */
public class BBQSkewer {
    /*
    * Calculates the counts of vegetarian and non-vegetarian skewers in the given list.
    *
    * @param grill The list of skewer configurations to analyze.
    * @return An array of integers representing the counts, where index 0 is the count of 
    *   vegetarian skewers, and index 1 is the count of non-vegetarian skewers.
    */
    public static int[] bbqSkewer(List<String> grill) {
        // Count vegetarian skewers
        int veg = (int) grill.stream().filter(s -> s.contains("-o") && 
        !s.contains("-x")).count();
        // Count non-vegetarian skewers
        int nonVeg = (int) grill.stream().filter(s -> s.contains("-x")).count();
        // Return an aray containing the counts
        return new int[]{veg, nonVeg};
    }

    /**
     * The main method demonstrates usage of bbqSkwer method with a sample grill configuration.
     * 
     * @param args Command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        // Sample grill configurations
        List<String> grill = Arrays.asList(
            "--xo--x--ox--",
            "--xx--x--xx--",
            "--oo--o--oo--",
            "--xx--x--ox--",
            "--xx--x--ox--"
        );

        // Calculate skewer counts using bbqSkewer method
        int[] result = bbqSkewer(grill);

        // Display the results
        System.out.println("Vegetarian skewers: " + result[0]);
        System.out.println("Non-vegetarian skewers: " + result[1]);
    }
}
