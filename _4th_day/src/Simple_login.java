import java.util.Scanner;
public class Simple_login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "Fep";
        String Password = "meow";
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(Username)) {

            if (password.equals(Password)) {
                System.out.println("Welcome");
            } else {

                System.out.println("Wrong password.");
            }
        }
        else {
                System.out.println("Wrong Username.");
            }
        }
    }
