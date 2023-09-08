import java.util.Scanner;

public class Conditions_else {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = ss.nextInt();

        if(age==16){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }
    }
}
