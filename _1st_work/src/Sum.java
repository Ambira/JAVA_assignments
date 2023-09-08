import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = scc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = scc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is : "+sum);
    }
}




