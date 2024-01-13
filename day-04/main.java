import java. util.Arrays;

public class Main {

    /**
     * Calculates the number of days where the mileage is higher then the day 
     * before and display the numbers of days progressed.
     * 
     * @param array An array of integers with the number of miles ran on Saturday.
     */
    public static void progressDays(int[] array) {

        // Number of progress days default zero
        int totalProgressDays = 0;

        // Loop through the array to find a number larger then the last
        for (int i = 1; i < array.length; i++ ) {
            if (array[i] > array[i - 1]) {
                // Count the number of progress days
                totalProgressDays += 1;
            }
        } 

        // Display the number of progress days
        System.out.println(" -> " + totalProgressDays);
    }

    /**
     * Provides test arrays for progressDays
     */
    public static void main(String[] args) {
        progressDays(new int[]{3, 4, 1, 2});
        progressDays(new int[]{10, 11, 12, 9, 10});
        progressDays(new int[]{6, 5, 4, 3, 2, 9});
        progressDays(new int[]{9, 9});        
    }
}