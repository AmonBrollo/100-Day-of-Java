import java.util.HashMap;
import java.util.Map;

/**
 * Write a function that returns the number of pair of letters, such as 
 * "AA".
 */

public class SockPairsCounter {
    // Function to count sock pairs
    public static int countSockPairs(String socks) {
        // Use a HashMap to store the count of each sock type
        Map<Character, Integer> sockCount = new HashMap<>();

        // Iterate through the socks and count each type
        for (char sock : socks.toCharArray()) {
            sockCount.put(sock, sockCount.getOrDefault(sock, 0) + 1);
        }        

        // Count the number of pairs
        int pairCount = 0;
        for (int count : sockCount.values()) {
            // Calculate pairs for each sock type
            pairCount += count / 2;
        }

        return pairCount;
    }

    // Main mehtid with test cases
    public static void main(String[] args) {
        // Test cases
        System.out.println(countSockPairs("AA"));
        System.out.println(countSockPairs("ABABC"));
        System.out.println(countSockPairs("CABBACCC"));
    }
    
}