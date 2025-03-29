import java.util.*;
class UserInputVowelsAndConsonant1 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String s = j.next();  // Read input as String
        j.close();  // Close the scanner
        
        // Convert first character to lowercase
        char ch = s.toLowerCase().charAt(0);

        // Check if it's an alphabet
        if (Character.isLetter(ch)) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("This is a Vowel: " + ch);
            } else {
                System.out.println("This is a Consonant: " + ch);
            }
        } else {
            System.out.println("Invalid input! Please enter a single alphabet character.");
        }
    }
}
