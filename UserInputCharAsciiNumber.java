//Take a character input from the user and print its ASCII value.
import java.util.*;
class UserInputCharAsciiNumber {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        
        // Taking a string input from the user
        System.out.print("Enter a String: ");
        String s = j.next();
        
        // Extracting the first character
        char ch = s.charAt(0);
        
        // Getting the ASCII value
        int num = (int) ch;
        
        // Printing the character and its ASCII value
        System.out.println("The Character is: " + ch + " and its ASCII value is: " + num);
        
        j.close();
    }
}
