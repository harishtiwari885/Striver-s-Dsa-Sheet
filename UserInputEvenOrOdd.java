// Write a Java program that takes an integer input from the user and prints whether it iseven orodd.
import java.util.*;
class UserInputEvenOrOdd{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = j.nextInt();
        // Using if-else statement to check if the number is even or odd
        if(num % 2 == 0){
            System.out.println("This is an Even Number: " + num);
        }
        else{
            System.out.println("This is an Odd Number: " + num);
        }
    }
}