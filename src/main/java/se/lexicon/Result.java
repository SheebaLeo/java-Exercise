package se.lexicon;

public class Result {
    public static void main(String[] args) {
        int score = 10; // Assign a value to the score variable

        if (score > 65) {
            System.out.println("Hurray, You passed!");
        } else if (score >= 55 && score <= 64) {
            System.out.println("You are almost there.");
        } else {
            System.out.println("Sorry, You did not pass.");
        }
    }
}
