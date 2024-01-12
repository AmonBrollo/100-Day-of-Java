import java.util.Scanner; 

class Main {
    public static void main (String[] args) {
        /* Get the phrase containing the word "Nemo" for the program to 
        find*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase with the word \"Nemo\": ");
        String phrase = scanner.nextLine();

        // Split the input phrase into words using space as the delimiter
        String[] words = phrase.split("\\s+");

        // Variables to keep track of where is Nemo
        boolean foundNemo = false;
        int nemoPosition = 0;

        /* Find the word "Nemo" in the phrase */
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Nemo")) {
                foundNemo = true;
                nemoPosition = i + 1;
                break;
            }
        }
        // Display where you found Nemo
        if (foundNemo) {
            System.out.println("I found Nemo at " + nemoPosition + "!");
        } else {
        // Return an error message if you don't find Nemo
            System.out.println("There is no \"Nemo\" in the phrase");
        }

        scanner.close();
    }
}