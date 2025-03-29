// Take a single character input from the user and determine whether it is a vowel or a consonant.
import java.util.*;
class UserInputVowelsAndConsonant2 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String s = j.next();  // Read input as String
        char ch = s.charAt(0);
        if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e")|| s.equalsIgnoreCase("i")
        || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u")){
            System.out.println("This is an Vowel: " + ch);
        }
        else{
            System.out.println("This is an Consonant: " + ch);
        }
    }
}
