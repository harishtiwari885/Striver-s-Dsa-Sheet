// Take two integer inputs from the user and swap their values  using a third variable.
import java.util.*;
class UserInputSwappingTwoNumber1{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = j.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = j.nextInt();
        System.out.println("The numbers before swapping " + num1 + " and " + num2);
        //Swapping the two numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The numbers after swapping " + num1 + " and " + num2);
    }
}
