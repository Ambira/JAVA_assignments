import java.util.Scanner;

public class Positive_negative {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = rr.nextInt();

        if(num>=1){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
