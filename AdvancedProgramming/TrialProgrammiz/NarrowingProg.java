import java.util.*;

public class NarrowingProg{
    public static final double PI = 22.0/7;

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        double radius,circumference,area;

        System.out.println("Enter the radius of the circle");
        radius = Sc.nextDouble();

        area = PI * radius *radius;
        circumference = PI * 2 * radius;

        System.out.printf("\nThe area of a circle of radius %.2f is %.2f", radius,area);
        System.out.printf("\nThe circumference of a circle of radius %.2f is %.2f", radius,circumference);
        
    }

}