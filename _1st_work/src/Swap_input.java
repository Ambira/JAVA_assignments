import java.util.Scanner;

public class Swap_input {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sw = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        num1 = sw.nextInt();

        System.out.println("Enter 2nd number: ");
        num2 = sw.nextInt();

        System.out.println("Number before swapping: "+ num1+","+num2);

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Number after swapping: "+ num1+","+num2);

    }
}
