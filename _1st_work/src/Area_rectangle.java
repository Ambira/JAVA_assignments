import java.util.Scanner;

public class Area_rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;

        System.out.println("The area of rectangle is: " +area);
    }
}
