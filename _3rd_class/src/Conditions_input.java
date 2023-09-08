import java.util.Scanner;

public class Conditions_input {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = aa.nextInt();

        if(age==16){
            System.out.println("Welcome");
        }


    }
}
