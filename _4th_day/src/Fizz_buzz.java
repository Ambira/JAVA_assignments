import java.util.Scanner;

public class Fizz_buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();

        if ((num1 % 3 ==0) && (num1 % 5 ==0)) {
            System.out.println("Fizz Buzz");
        } else if (num1 % 3 ==0){
            System.out.println("Fizz");

            }else if (num1 % 5 ==0) {
            System.out.println("Buzz");
        }
        else System.out.println("Nothing");
        }


    }

