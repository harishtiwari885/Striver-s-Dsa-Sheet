// Take the radius as input and calculate the area of the circle using:
// Area= π × r x r or r-square
import java.util.*;
class UserInputAreaOfCircle{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Radius value: ");
        double r = j.nextDouble();
        double pi = Math.PI;
        //using area of circle formula:  Area= π × r x r or r-square
        double area = pi * r * r;
        System.out.println("The Area of Circle is: " + area);
    }
}