import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = vv.nextInt();

        if(number%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }

    }
}
