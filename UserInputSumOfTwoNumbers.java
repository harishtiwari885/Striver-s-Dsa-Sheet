// Take two integer inputs from the user and print their sum
import java.util.*;
class UserInputSumOfTwoNumbers{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = j.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = j.nextInt();
        //using sum variable for sum of two numbers
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}