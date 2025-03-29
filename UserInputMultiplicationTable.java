// Take an integer input from the user and print its multiplication table up to 10.
import java.util.*;
class UserInputMultiplicationTable{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = j.nextInt();
        int mul = 1;
        //using loops for multilplication table
        System.out.println("The Multiplication Table for " + num + " is: ");
        for(int a= 1 ; a <= 10 ; a++){
            mul = num * a;
            System.out.println(num + " x " + a + " = " + mul);
        }
    }
}