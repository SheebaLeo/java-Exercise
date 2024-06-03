package se.lexicon;

import java.util.Scanner;

public class ObjectPractise {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");

        // Read the string from the user
        String userInput = scanner.nextLine();

        // Display the user input
        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();
    }
}
