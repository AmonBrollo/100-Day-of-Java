public class Main {

    // Function to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * nextPrime returns the next prime number given an integer.
     * If the number is prime, return the number itself.
     */
    static int nextPrime(int number) {
        while (!isPrime(number)) {
            number++;
        }
        return number;
    }


    public static void main(String[] args) {
        // Test the nextPrime function
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
    }
}