import java.util.Scanner;

public class SI_input {
    public static void main(String[] args) {

        Scanner pt = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        int principle = pt.nextInt();

        System.out.println("Enter Time: ");
        int time = pt.nextInt();

        System.out.println("Enter Rate: ");
        double rate = pt.nextDouble();

        double Simple_interest = (principle*time*rate)/100;
        System.out.println("The Simple interest is :" +Simple_interest);
    }
}
