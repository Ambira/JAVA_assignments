import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner mow = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = mow.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature from Fahrenheit to Celsius is: "+ celsius+"°C");
    }
}
