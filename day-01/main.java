import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the 'Age to Days' Converter\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        String ageString = scanner.nextLine();

        int age = Integer.parseInt(ageString);

        int ageInDays = age * 365;

        System.out.println("Your age in days is: " + ageInDays);

        scanner.close();
    }
}