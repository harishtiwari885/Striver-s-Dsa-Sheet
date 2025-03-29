// Take the user's full name as input (including spaces) and print it.
import java.util.*;
class UserInputPrintingUserName{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Please Enter Your Good Name: ");
        String s = j.nextLine();
        System.out.println("Hello " + s + " How are you!");
    }
}