// Take Principal (P), Rate of Interest (R), and Time (T) from the user and calculate the Simple Interest using the formula:
// SI=(𝑃×𝑅×𝑇)/100
import java.util.*;
class UserInputCalculatingSimpleInterest{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double p = j.nextInt();
        System.out.print("Enter the Rate of Interest: ");
        double r = j.nextInt();
        System.out.print("Enter the Time: ");
        double t = j.nextInt();
        //using simple Interest formula for calculating Simple Interest: SI=(𝑃×𝑅×𝑇)/100
        double simpleInterest = (p * r * t) / 100.0;
        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}

