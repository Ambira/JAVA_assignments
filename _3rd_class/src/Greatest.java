import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" Is greater than "+num2);
        }
        else if (num1==num2) {
            System.out.println(num1+" Is equal to "+num2);

        }
        else{
            System.out.println(num2+" Is greater than "+num1);
        }

    }
}
