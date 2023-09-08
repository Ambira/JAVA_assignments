import java.util.Scanner;

public class Area_circle_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        int radius = sc.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("The area of Circle is: "+area);
    }
}